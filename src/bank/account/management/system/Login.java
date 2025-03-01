package bank.account.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

// public class Login extends JFrame {
public class Login extends JFrame implements ActionListener{ // implement actionListener for after click button go somewhere
    JLabel label1, label2, label3; // global declared because we used this outside of constructor in button

    JTextField textField2; // used for to take textField to enter text

    JPasswordField passwordField3;

    JButton jButton1, jButton2, jButton3; // take three button because one is sing in , sing up and 3rd one is clear // all are declared global


    Login() {

        super("Bank Account Management System"); // super used here for title and super always used just down from constructor otherwise error comes

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 10,100, 100);
        add(image); //this is insert JLabel image

        // here we only change image name to ii ever have we write double ii
        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icons/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630, 350,100, 100);
        add(iimage);


        // JLabel basically work for show any text on frame
        label1 = new JLabel("WELCOME TO ATM");
        // setForeground used to set color
        label1.setForeground(Color.white);
        label1.setFont(new Font("AvantGarde",Font.BOLD, 38));//used to change font of text
        label1.setBounds(230,125,450,40);
        add(label1);

        label2 = new JLabel("Card No:");
        label2.setFont(new Font("Ralway", Font.BOLD, 28));
        label2.setForeground(Color.white);
        label2.setBounds(150, 190, 375, 30);
        add(label2);

        // textField used in label2 because in label 3 we used passwordFiled for password and label1 used heading
        textField2 = new JTextField(15);
        textField2.setBounds(300, 190, 230, 30);
        textField2.setFont(new Font("Arial",Font.BOLD,14));
        textField2.setForeground(Color.black);
        add(textField2);


        label3 = new JLabel("PIN: ");
        label3.setFont(new Font("Arial",Font.BOLD, 28));
        label3.setForeground(Color.white);
        label3.setBounds(150, 250, 375, 30);
        add(label3);


        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(300, 250, 230, 30);
        passwordField3.setFont(new Font("Arial",Font.BOLD, 14));
        passwordField3.setForeground(Color.black);
        add(passwordField3);


        jButton1 = new JButton("SIGN IN");
        jButton1.setFont(new Font("Arial",Font.BOLD, 14));
        jButton1.setForeground(Color.white);
        jButton1.setBackground(Color.black);
        jButton1.setBounds(300,300,100,30);
        // here we add actionListener not add after add button add before
        jButton1.addActionListener(this);
        add(jButton1);

        jButton2 = new JButton("CLEAR");
        jButton2.setFont(new Font("Arial",Font.BOLD,14));
        jButton2.setForeground(Color.white);
        jButton2.setBounds(430,300,100,30);
        jButton2.setBackground(Color.black);
        jButton2.addActionListener(this);
        add(jButton2);


        jButton3 = new JButton("SING UP");
        jButton3.setFont(new Font("Arial",Font.BOLD,14));
        jButton3.setForeground(Color.white);
        jButton3.setBackground(Color.black);
        jButton3.setBounds(300,350,230,30);
        jButton3.addActionListener(this);
        add(jButton3);



       // for background image  and background always niche rak
        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icons/back.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0, 0,850, 480);
        add(iiimage);


        setLayout(null); //setLayout(null) because we don't want default we want according to we

        // Set the size of the frame
        setSize(850, 480);
        // in starting our frame is open corner side then shift x asis means right from left and y asis means down from top and used setLocation
        setLocation(450, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close application on exit
        // setUndecorated is used when your project is fully completed because this is close all exit and back and minimization icons on page
        setUndecorated(true); // this is remove the all icons and exit and minimization icons form login page which is default show on upper side on page
        setVisible(true); // Make the frame visible  and setVisibility always niche rak otherwise image not show in output
    }

    @Override   // here we used override and actionPerformed due to implementation of ActionListener implements
    public void actionPerformed(ActionEvent e){

        try {
            if (e.getSource()==jButton1){
                // here we write code for take pin from query and card number also
                DatabaseConnection con1 = new DatabaseConnection();
                String cardno = textField2.getText();
                String pin = passwordField3.getText();
                String q = "select * from Login where card_number = '"+cardno+"' and pin = '"+pin+"'"; // get data form table
                ResultSet resultSet = con1.statement.executeQuery(q);
                if (resultSet.next()){
                    setVisible(false);
                    new main_Class(pin); // pass pin from here to main_class
                }
               else {
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN"); //if pin is not correct pass from database table sql which is made during signup process
                }

            }
            else if (e.getSource()==jButton2){ // this button is clear button
                textField2.setText("");
                passwordField3.setText("");

            }
            else if (e.getSource()==jButton3){
                new Signup();
                setVisible(false);

            }
        }catch (Exception E){
            E.printStackTrace();

        }

    }
    public static void main(String[] arg) {
        new Login(); // Create an instance of Login new is keyword used to create a new object in java
        // login() : this is the constructor of the login class. in you case , the constructor sets up the JFrame(the window) with specific size and other properties

    }
}
