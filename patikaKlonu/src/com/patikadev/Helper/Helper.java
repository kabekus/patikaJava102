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

    public static boolean isFieldEmpty(JTextField field){
        return  field.getText().trim().isEmpty();
    }

    public static void showMessage(String str){
        optionPaneTR();
        String message;
        String title;
        switch (str){
            case "fill":
                message="Lütfen Tüm Alanları Doldurun!";
                title = "Hata !";
                break;
            case "success":
                message="İşlem Tamamlandı";
                title = "Sonuç";
                break;
            case "error":
                message="Bir Hata Oluştu !";
                title = "Hata !";
                break;
            default:
                message=str;
                title = "Mesaj";
        }
        JOptionPane.showMessageDialog(null,message,title,JOptionPane.INFORMATION_MESSAGE);
    }

     public static void optionPaneTR(){
        UIManager.put("OptionPane.okButtonText","Tamam");
        UIManager.put("OptionPane.yesButtonText","Evet");
        UIManager.put("OptionPane.noButtonText","Hayır");
     }

    public static boolean confirm(String str) {
        String msg;
        optionPaneTR();
        switch (str){
            case "sure":
                msg = "Bu işlemi gerçekletrimek istediğinize emin misiniz?";
                break;
            default:
                msg = str;
        }
        return JOptionPane.showConfirmDialog(null,msg,"Son kararın mı?", JOptionPane.YES_NO_OPTION)==0;
    }
}
