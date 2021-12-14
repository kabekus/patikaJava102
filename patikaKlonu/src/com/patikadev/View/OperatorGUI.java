package com.patikadev.View;
import com.patikadev.Helper.*;
import com.patikadev.Model.Operator;
import com.patikadev.Model.User;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

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

        lbl_welcome.setText("Hoş Geldin "+operator.getName());

        //ModelUserList
        mdl_userList = new DefaultTableModel();
        Object[] col_UserList = {"ID","Ad Soyad","Kullanıcı Adı","Şifre","Üyelik Tipi"};
        mdl_userList.setColumnIdentifiers(col_UserList);

        for (User obj:User.getList()){
            Object[] row = new Object[col_UserList.length];
            row[0] = obj.getId();
            row[1] = obj.getName();
            row[2] = obj.getUser_name();
            row[3] = obj.getPassword();
            row[4] = obj.getUser_type();
            mdl_userList.addRow(row);
        }

        tbl_userList.setModel(mdl_userList);
        tbl_userList.getTableHeader().setReorderingAllowed(false);

        btn_userAdd.addActionListener(e -> {
            if (Helper.isFieldEmpty(fld_userName)|| Helper.isFieldEmpty(fld_user_Nickname) || Helper.isFieldEmpty(fld_password)){
                Helper.showMessage("fill");
            }else {
                String userName = fld_userName.getText();
                String user_Nickname = fld_user_Nickname.getText();
                String password = fld_password.getText();
                String user_type = cmb_userType.getSelectedItem().toString();

                if (User.add(userName,user_Nickname,password,user_type)){
                    Helper.showMessage("success");
                }else {
                    Helper.showMessage("error");
                }
            }
        });
    }
}
