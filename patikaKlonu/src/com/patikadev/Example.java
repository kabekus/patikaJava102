package com.patikadev;
import javax.swing.*;
import java.awt.*;

public class Example extends JFrame {
    private JPanel wrapper;
    private JPanel wtop;
    private JPanel wbottom;
    private JTextField fld_name;
    private JPasswordField fld_password;
    private JButton btn_giris;

    public Example(){
        for (UIManager.LookAndFeelInfo info: UIManager.getInstalledLookAndFeels()){
            if ("Nimbus".equals(info.getName())){
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (UnsupportedLookAndFeelException e) {
                    e.printStackTrace();
                }
            }
        }
       // this.add(wrapper); setContentPane ile aynı.
        setContentPane(wrapper);
        setSize(400,300);
        setTitle("Uygulama Adı");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // dispose var olan uygulamanın kapatılmasını sağlar
        setResizable(false);//Uygulamanın boyutu sabit kalır.

        int x= (Toolkit.getDefaultToolkit().getScreenSize().width-getSize().width)/2;
        int y= (Toolkit.getDefaultToolkit().getScreenSize().height-getSize().height)/2;
        setLocation(x,y);
        setVisible(true);

        btn_giris.addActionListener(e -> {  //Butona basıldığında ne olacağını belirleriz.
            if (fld_name.getText().length() == 0 || fld_password.getText().length() == 0){
                JOptionPane.showMessageDialog(null,"Tüm Alanları Doldurun!","! HATA !",JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}
