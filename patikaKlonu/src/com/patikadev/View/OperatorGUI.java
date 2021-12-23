package com.patikadev.View;
import com.patikadev.Helper.*;
import com.patikadev.Model.Operator;
import com.patikadev.Model.Patika;
import com.patikadev.Model.User;
import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class OperatorGUI extends JFrame {
    private JPanel wrapper;
    private JTabbedPane tab_operator;
    private JLabel lbl_welcome;
    private JPanel pnl_top;
    private JButton btn_exit;
    private JPanel pnl_userList;
    private JScrollPane scrl_userList;
    private JTable tbl_userList;
    private JPanel pnl_userForm;
    private JTextField fld_userName;
    private JTextField fld_user_Nickname;
    private JPasswordField fld_password;
    private JComboBox cmb_userType;
    private JButton btn_userAdd;
    private JTextField fld_userId;
    private JButton btn_userDelete;
    private JTextField fld_searchName;
    private JTextField fld_searchNickName;
    private JComboBox cmb_searchType;
    private JButton btn_searchUser;
    private JPanel pnl_patikaList;
    private JScrollPane scr_patikaList;
    private JTable tbl_patikaList;
    private JPanel pnl_patikaAdd;
    private JTextField fld_patikaName;
    private JButton btn_patikaAdd;
    private DefaultTableModel mdl_userList;
    private Object[] row_userList;
    private DefaultTableModel mdl_patikaList;
    private Object[] row_patikaList;
    private JPopupMenu patikaMenu;

    private final Operator operator;

    public OperatorGUI(Operator operator){
        this.operator = operator;
        add(wrapper);
        setSize(1000,500);

        setLocation(Helper.screenCenterPoint("x",getSize()) , Helper.screenCenterPoint("y",getSize()));

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);

        lbl_welcome.setText("Hoş Geldin "+ operator.getUser_name());

        //UserList
        mdl_userList = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0){
                    return false;
                }
                return super.isCellEditable(row, column);
            }
        };
        Object[] col_UserList = {"ID","Ad Soyad","Kullanıcı Adı","Şifre","Üyelik Tipi"};
        mdl_userList.setColumnIdentifiers(col_UserList);

        row_userList = new Object[col_UserList.length];
        loadUserModel();

        tbl_userList.setModel(mdl_userList);
        tbl_userList.getTableHeader().setReorderingAllowed(false);

         tbl_userList.getSelectionModel().addListSelectionListener(e -> {
             try{
                 String select_userId = tbl_userList.getValueAt(tbl_userList.getSelectedRow(),0).toString();
                 fld_userId.setText(select_userId);
             }catch(Exception exception){

             }
         });

         tbl_userList.getModel().addTableModelListener(e -> {
             if (e.getType() == TableModelEvent.UPDATE){
                 int id = Integer.parseInt(tbl_userList.getValueAt(tbl_userList.getSelectedRow(),0).toString());
                 String user_name = tbl_userList.getValueAt(tbl_userList.getSelectedRow(),1).toString();
                 String user_nickname = tbl_userList.getValueAt(tbl_userList.getSelectedRow(),2).toString();
                 String password = tbl_userList.getValueAt(tbl_userList.getSelectedRow(),3).toString();
                 String user_type = tbl_userList.getValueAt(tbl_userList.getSelectedRow(),4).toString();

                 if (User.updateFunction(id,user_name, user_nickname, password, user_type)){
                     Helper.showMessage("success");

                 }
                 loadUserModel();
             }
        });
        // ###

        //PatikaList
        patikaMenu = new JPopupMenu();
        JMenuItem updateMenu = new JMenuItem("Güncelle");
        JMenuItem deleteMenu = new JMenuItem("Sil");
        patikaMenu.add(updateMenu);
        patikaMenu.add(deleteMenu);

        updateMenu.addActionListener(e -> {
            int select_id = Integer.parseInt(tbl_patikaList.getValueAt(tbl_patikaList.getSelectedRow(),0).toString());
            UpdatePatikaGUI updatePatikaGUI = new UpdatePatikaGUI(Patika.getFetch(select_id));
            updatePatikaGUI.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadPatikaModel();
                }
            });
        });

        deleteMenu.addActionListener(e -> {
            if (Helper.confirm("sure")){
                int select_id = Integer.parseInt(tbl_patikaList.getValueAt(tbl_patikaList.getSelectedRow(),0).toString());
                if (Patika.delete(select_id)){
                    Helper.showMessage("success");
                    loadPatikaModel();
                }else{
                    Helper.showMessage("error");
                }
            }
        });

        mdl_patikaList = new DefaultTableModel();
        Object[] col_patikaList = {"ID", "Patika Adı"};
        mdl_patikaList.setColumnIdentifiers(col_patikaList);
        row_patikaList = new Object[col_patikaList.length];
        loadPatikaModel();

        tbl_patikaList.setModel(mdl_patikaList);
        tbl_patikaList.setComponentPopupMenu(patikaMenu);
        tbl_patikaList.getTableHeader().setReorderingAllowed(false);
        tbl_patikaList.getColumnModel().getColumn(0).setMaxWidth(75);

         tbl_patikaList.addMouseListener(new MouseAdapter() {
             @Override
             public void mousePressed(MouseEvent e) {
                 Point point = e.getPoint();
                 int selected_row = tbl_patikaList.rowAtPoint(point);
                 tbl_patikaList.setRowSelectionInterval(selected_row,selected_row);
             }
         });
        // ###

        //Kişi Ekleme Butonu
        btn_userAdd.addActionListener(e -> {
            if (Helper.isFieldEmpty(fld_userName)|| Helper.isFieldEmpty(fld_user_Nickname) || Helper.isFieldEmpty(fld_password)){
                Helper.showMessage("fill");
            }else{
                String user_name = fld_userName.getText();
                String user_nickname = fld_user_Nickname.getText();
                String password = fld_password.getText();
                String user_type = cmb_userType.getSelectedItem().toString();

                if (User.add(user_name,user_nickname,password,user_type)){
                    Helper.showMessage("success");
                    loadUserModel();
                    fld_userName.setText(null);
                    fld_user_Nickname.setText(null);
                    fld_password.setText(null);
                }
            }
        });
        // ###

        //Kişi Silme Butonu
        btn_userDelete.addActionListener(e -> {
            if (Helper.isFieldEmpty(fld_userId)){
                Helper.showMessage("fill");
            }else {
                if (Helper.confirm("sure")){
                    int userId = Integer.parseInt(fld_userId.getText());
                    if (User.deleteFunction(userId)){
                        Helper.showMessage("success");
                        loadUserModel();
                    }else {
                        Helper.showMessage("error");
                    }
                }
            }
        });
        // ###

        // Kişi Arama butonu işlemi
        btn_searchUser.addActionListener(e -> {
            String user_name = fld_searchName.getText();
            String user_nickname = fld_searchNickName.getText();
            String user_type = cmb_searchType.getSelectedItem().toString();
            String query =User.searchQuery(user_name,user_nickname,user_type);
            loadUserModel(User.searchUserList(query));

        });

        // Çıkış butonu
        btn_exit.addActionListener(e -> {
            dispose();
        });

        //Patika Ekleme Butonu
        btn_patikaAdd.addActionListener(e -> {
            if (Helper.isFieldEmpty(fld_patikaName)){
                Helper.showMessage("fill");
            }else {
                if (Patika.add(fld_patikaName.getText())){
                    Helper.showMessage("success");
                    loadPatikaModel();
                    fld_patikaName.setText(null);
                }else {
                    Helper.showMessage("error");
                }
            }
        });
    }

    private void loadPatikaModel(){
        DefaultTableModel clearModel = (DefaultTableModel) tbl_patikaList.getModel();
        clearModel.setRowCount(0);
        int i=0;
        for (Patika obj : Patika.getList()){
            i=0;
            row_patikaList[i++] = obj.getId();
            row_patikaList[i++] = obj.getName();
            mdl_patikaList.addRow(row_patikaList);
        }
    }

    public  void loadUserModel(){
        DefaultTableModel clearModel = (DefaultTableModel) tbl_userList.getModel();
        clearModel.setRowCount(0);
        int i;
        for (User obj:User.getList()){
            i = 0;
            row_userList[i++] = obj.getId();
            row_userList[i++] = obj.getUser_name();
            row_userList[i++] = obj.getUser_nickname();
            row_userList[i++] = obj.getPassword();
            row_userList[i++] = obj.getUser_type();
            mdl_userList.addRow(row_userList);
        }
    }
    public  void loadUserModel(ArrayList<User> list){
        DefaultTableModel clearModel = (DefaultTableModel) tbl_userList.getModel();
        clearModel.setRowCount(0);
        for (User obj:list){
            int i = 0;
            row_userList[i++] = obj.getId();
            row_userList[i++] = obj.getUser_name();
            row_userList[i++] = obj.getUser_nickname();
            row_userList[i++] = obj.getPassword();
            row_userList[i++] = obj.getUser_type();
            mdl_userList.addRow(row_userList);
        }
    }
}
