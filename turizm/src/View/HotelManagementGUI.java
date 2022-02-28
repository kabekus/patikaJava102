package View;
import javax.swing.*;
public class HotelManagementGUI extends JFrame {
    private JPanel wrapper;
    private JTextField fld_hotelName;
    private JTextField fld_hotelLocation;
    private JTextField fld_hotelAddress;
    private JTextField fld_hotelPhoneNum;
    private JTextField fld_hotelMail;
    private JTextField fld_hotelStarNum;
    private JCheckBox cbx_freeCarPark;
    private JCheckBox cbx_freeWifi;
    private JCheckBox cbx_fitnessCenter;
    private JCheckBox cbx_hotelConcierge;
    private JCheckBox cbx_spa;
    private JCheckBox cbx_roomService;
    private JCheckBox cbx_swimmingPool;
    private JComboBox cmb_hostelType;
    private JButton btn_hotelAdd;
    private JTabbedPane tbdpn_hotelManagement;
    private JComboBox cmb_hotelName;
    private JTextField fld_bedNum;
    private JTextField fld_squareMeters;
    private JCheckBox cbx_tv;
    private JCheckBox cbx_minibar;
    private JCheckBox cbx_gameConsole;
    private JCheckBox cbx_till;
    private JCheckBox cbx_projection;
    private JButton btn_roomAdd;
    private JComboBox cmb_roomType;

    public void createUIComponents() {

    }
   public  HotelManagementGUI(){
       add(wrapper);
       setSize(900,600);
       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       setResizable(true);
       setVisible(true);


   }

}
