package com.patikadev.View;

import com.patikadev.Helper.Config;
import com.patikadev.Helper.Helper;
import com.patikadev.Model.Patika;

import javax.swing.*;
public class UpdatePatikaGUI extends JFrame {
    private JPanel wrapper;
    private JTextField fld_patikaName;
    private JButton btn_update;
    private Patika patika;

    public UpdatePatikaGUI(Patika patika ){
        this.patika = patika;
        add(wrapper);
        setSize(300,150);
        setLocation(Helper.screenCenterPoint("x",getSize()),Helper.screenCenterPoint("y",getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);

        fld_patikaName.setText(patika.getName());

        //Güncelleme Butonu
        btn_update.addActionListener(e -> {
           if (Helper.isFieldEmpty(fld_patikaName)){
               Helper.showMessage("fill");
           }else {
               if (Patika.update(patika.getId(),fld_patikaName.getText())){
                   Helper.showMessage("success");
               }
               dispose();
           }
        });
    }
}
