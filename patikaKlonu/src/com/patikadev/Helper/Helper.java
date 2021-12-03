package com.patikadev.Helper;
import javax.swing.*;
import java.awt.*;

public class Helper {
    public static int screenCenterPoint(String axis , Dimension size){
        int point;
        switch (axis){
            case "x":
                point =(Toolkit.getDefaultToolkit().getScreenSize().width-size.width)/2;
                break;
            case "y":
                point = (Toolkit.getDefaultToolkit().getScreenSize().height-size.height)/2;
                break;
            default:
                point = 0;
        }
        return point;
    }

    public static void setLayout(){
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()){
            if ("Nimbus".equals(info.getName())){
               try {
                   UIManager.setLookAndFeel(info.getClassName());
               } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
                   e.printStackTrace();
               }
               break;
            }
        }
    }
}
