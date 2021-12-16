package com.patikadev.View;
import com.patikadev.Helper.*;
import com.patikadev.Model.Operator;
import com.patikadev.Model.User;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    private DefaultTableModel mdl_userList;
    private Object[] row_userList;

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

        //ModelUserList
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

        //Butona basılınca ekleme işlemi
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

        //Butona basılınca silme işlmi
        btn_userDelete.addActionListener(e -> {
            if (Helper.isFieldEmpty(fld_userId)){
                Helper.showMessage("fill");
            }else {
                int userId = Integer.parseInt(fld_userId.getText());
                if (User.deleteFunction(userId)){
                    Helper.showMessage("success");
                    loadUserModel();
                }else {
                    Helper.showMessage("error");
                }
            }
        });
        // Arama butonu işlemi
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
    }

    public  void loadUserModel(){
        DefaultTableModel clearModel = (DefaultTableModel) tbl_userList.getModel();
        clearModel.setRowCount(0);
        for (User obj:User.getList()){
            int i = 0;
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
