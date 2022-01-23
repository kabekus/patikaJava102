package com.patikadev.View;

import com.patikadev.Helper.Config;
import com.patikadev.Helper.Helper;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EducatorGUI extends JFrame {
    private JPanel wrapper;
    private JPanel pnl_contents;
    private JTabbedPane tab_contents;
    private JTable tbl_contents;
    private JTextField fld_ContentsTitle;
    private JTextField fld_youtube;
    private JTextField fld_lesson;
    private JTextArea area_contentsComment;
    private JButton btn_contentsAdd;
    private JTextField fld_question;
    private JRadioButton rbtn_option1;
    private JRadioButton rbtn_option2;
    private JRadioButton rbtn_option3;
    private JRadioButton rbtn_option4;
    private JButton btn_quizAdd;
    private JTextField fld_optionAdd;
    private JButton şıkEkleButton;

    public EducatorGUI() {
        add(wrapper);
        setSize(600, 600);
        setLocation(Helper.screenCenterPoint("x", getSize()), Helper.screenCenterPoint("y", getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        setVisible(true);


        şıkEkleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rbtn_option1.setText(fld_optionAdd.getText());
            }
        });
    }
}
