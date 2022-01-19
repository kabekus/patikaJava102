package com.patikadev.View;

import com.patikadev.Helper.Config;
import com.patikadev.Helper.Helper;
import com.patikadev.Model.Operator;
import com.patikadev.Model.User;

import javax.swing.*;


public class LoginGUI extends JFrame {
    private JPanel wrapper;
    private JPanel wtop;
    private JPanel wbottom;
    private JTextField fld_userNickName;
    private JPasswordField fld_userPassword;
    private JButton btn_login;

    public LoginGUI(){
        add(wrapper);
        setSize(600,600);
        setLocation(Helper.screenCenterPoint("x",getSize()),Helper.screenCenterPoint("y",getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        setVisible(true);

        //Giriş Butonu
        btn_login.addActionListener(e -> {
            if(Helper.isFieldEmpty(fld_userNickName) || Helper.isFieldEmpty(fld_userPassword)){
                Helper.showMessage("fill");
            }else{
              User u = User.getFetch(fld_userNickName.getText(),fld_userPassword.getText());
              if (u == null){
                  Helper.showMessage("Kullanıcı Bulunamadı !");
              }else{
                  switch (u.getUser_type()){
                      case "Operator":
                          Operator op = new Operator();
                          OperatorGUI opGUI = new OperatorGUI(op);
                          break;
                      case "Educator":
                          EducatorGUI edGUI = new EducatorGUI();
                          break;
                      case "Student":
                          StudentGUI studentGUI = new StudentGUI();
                          break;
                  }
                  dispose();
              }
            }
        });
    }

}
