package bank.account.management.system;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

//public class Signup extends JFrame {
// starting from here but in last when we need ActionListener then implement ActionListener
public class Signup extends JFrame implements ActionListener{
    JRadioButton radioButton1, radioButton2,radioButton3,  radioButtonm1, radioButtonm2,radioButtonm3;
    JButton next;

    // before constructor class all global declared
    JTextField textName, textFname, textphone, textEmail, textMs, textAdd,textCity,textPin,textState;

    JDateChooser dateChooser; //for date for birth file import which is present in java project file
    // first go to project structure then library and then add click + sign and add and go java project file

    Random ran = new Random(); // for random text generate we can write anything the place of ran

    long first3 =(ran.nextLong()%900L)+100L;
    String first = " " + Math.abs(first3);


    // create constructor same name as class
    Signup(){

        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10,100,100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO:"+first); //first4 digit number random create
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);


        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(400,70,600,30);
        add(label2);


        JLabel jLabel3 = new JLabel("Personal Details");
        jLabel3.setFont(new Font("Raleway",Font.BOLD,22));
        jLabel3.setBounds(350,90, 600,60);
        add(jLabel3);

        // textField and label for user information

        JLabel labelName = new JLabel("Full Name :");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,150,200,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,17));
        textName.setBounds(300,150,370,30);
        textName.setBackground(new Color(210, 225, 239, 255));
        add(textName);


        JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setFont(new Font("Raleway",Font.BOLD,20));
        labelfName.setBounds(100,190,200,30);
        add(labelfName);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD,17));
        textFname.setBounds(300,190,370,30);
        textFname.setBackground(new Color(210, 225, 239, 255));
        add(textFname);

        //for date of birth text label
        JLabel DOB = new JLabel("Date of Birth :");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,240,200,30);
        add(DOB);

        //  Datechooser button for date of birth
        dateChooser = new JDateChooser();
       // dateChooser.setForeground(new Color(210, 225, 239, 255));
        dateChooser.setBounds(300,240,370,30);
        dateChooser.setBackground(new Color(210, 225, 239, 255));
        dateChooser.setFont(new Font("Raleway",Font.BOLD,17));
        add(dateChooser);

        // phone number
        JLabel phone = new JLabel("Phone Number :");
        phone.setFont(new Font("Raleway",Font.BOLD,20));
        phone.setBounds(100,290,200,30);
        add(phone);

        textphone = new JTextField();
        textphone.setFont(new Font("Raleway",Font.BOLD,17));
        textphone.setBounds(300,290,370,30);
        textphone.setBackground(new Color(210, 225, 239, 255));
        add(textphone);

        // gender
        JLabel labelG = new JLabel("Gender");
        labelG.setFont(new Font("Raleway",Font.BOLD,20));
        labelG.setBounds(100,340,200,30);
        add(labelG);

        // radio button for gender
        radioButton1 = new JRadioButton("Male");
        radioButton1.setFont(new Font("Raleway",Font.BOLD,17));
        radioButton1.setBackground(new Color(162, 205, 246));
        radioButton1.setBounds(300,340,80,30);
        add(radioButton1);

        radioButton2 = new JRadioButton("Female");
        radioButton2.setFont(new Font("Raleway",Font.BOLD,17));
        radioButton2.setBackground(new Color(162, 205, 246));
        radioButton2.setBounds(450,340,90,30);
        add(radioButton2);

        radioButton3 = new JRadioButton("Other");
        radioButton3.setFont(new Font("Raleway",Font.BOLD,17));
        radioButton3.setBounds(600,340,90,30);
        radioButton3.setBackground(new Color(162, 205, 246));
        add(radioButton3);


        // for not select both option male and female at a time means if male select then female button automatically disible
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);

        // for email first declare global variable textEmail then used properties

        JLabel labelEmail = new JLabel("Email address :");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,17));
        textEmail.setBounds(300,390,370,30);
        textEmail.setBackground(new Color(210, 225, 239, 255));
       // textEmail.setBackground(Color.white);
        add(textEmail);

        // for marriage status

        JLabel labelMs = new JLabel("Marital Status :");
        labelMs.setFont(new Font("Raleway",Font.BOLD,20));
        labelMs.setBounds(100,440,200,30);
        add(labelMs);

//        textMs = new JTextField();  // not required textField required is radioButton
//        textMs.setFont(new Font("Raleway",Font.BOLD,14));
//        textMs.setBounds(300,440,390,30);
//        add(textMs);
        radioButtonm1= new JRadioButton("Married");
        radioButtonm1.setBounds(300,440,100,30);
        radioButtonm1.setBackground(new Color(162, 205, 246));
        radioButtonm1.setFont(new Font("Raleway",Font.BOLD,17));
        add(radioButtonm1);

        radioButtonm2= new JRadioButton("Single");
        radioButtonm2.setBounds(450,440,100,30);
        radioButtonm2.setBackground(new Color(162, 205, 246));
        radioButtonm2.setFont(new Font("Raleway",Font.BOLD,17));
        add(radioButtonm2);

        radioButtonm3= new JRadioButton("Waiting");
        radioButtonm3.setBounds(595,440,100,30);
        radioButtonm3.setBackground(new Color(162, 205, 246));
        radioButtonm3.setFont(new Font("Raleway",Font.BOLD,17));
        add(radioButtonm3);

        ButtonGroup buttonGroup1  = new ButtonGroup();
        buttonGroup1.add(radioButtonm1);
        buttonGroup1.add(radioButtonm2);
        buttonGroup1.add(radioButtonm3);



        // address
        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setFont(new Font("Raleway",Font.BOLD,20));
        labelAdd.setBounds(100,490,200,30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway",Font.BOLD,17));
        textAdd.setBounds(300,490,370,30);
        textAdd.setBackground(new Color(210, 225, 239, 255));
        add(textAdd);

        // city
        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Raleway",Font.BOLD,20));
        labelCity.setBounds(100,540,200,30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,17));
        textCity.setBounds(300,540,370,30);
        textCity.setBackground(new Color(210, 225, 239, 255));
        add(textCity);

        // pinCode
        JLabel labelPin = new JLabel("Pin Code :");
        labelPin.setFont(new Font("Raleway",Font.BOLD,20));
        labelPin.setBounds(100,590,200,30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway",Font.BOLD,17));
        textPin.setBackground(new Color(210, 225, 239, 255));
        textPin.setBounds(300,590,370,30);
        add(textPin);

        // state
        JLabel labelState = new JLabel("State :");
        labelState.setFont(new Font("Raleway",Font.BOLD,20));
        labelState.setBounds(100,640,200,30);
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Raleway",Font.BOLD,17));
        textState.setBounds(300,640,370,30);
        textState.setBackground(new Color(210, 225, 239, 255));
        add(textState);

        // for next Page
        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,17));
        next.setBackground(new Color(65,105,225));
        next.setForeground(Color.white);
        next.setBounds(440,710,80,28);
        next.addActionListener(this); // used for one page to another page
        add(next);




        getContentPane().setBackground(new Color(162, 205, 246));
        setLayout(null);
        setSize(850, 800);//set size of jFrame
        setLocation(360,40);
        setVisible(true);

    }
    // constructor ke bahar and main function ke under override used for ActionListener otherwise on top error show in ActionListener
    @Override
    public void actionPerformed(ActionEvent e){
        // here we write the code to perform even and work on inside the textField and get data
        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();

        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText(); // to get dob no easy way

        String gender = null; // null because we select any one then come here and store
        if(radioButton1.isSelected()){
            gender="Male";
        }
        else if (radioButton2.isSelected()){
            gender ="Female";
        }
        else if(radioButton3.isSelected()){
            gender= "Other";
        }

        String email = textEmail.getText(); //here email store which is you enter

        String marital =null; // if we select marriage then here store marriage depends on which one is you select after that come here and store
        if (radioButtonm1.isSelected()){
            marital = "Married";
        }
        else if(radioButtonm2.isSelected()){
            marital= "Single";
        }
        else if (radioButtonm3.isSelected()){
            marital = "Waiting";
        }

        String address = textAdd.getText();
        String city = textCity.getText();
        String pin = textPin.getText();
        String state = textState.getText();

       // for data store used try catch to catch any exception is happend
        try {
             if(textName.getText().equals("")){ // if user not enter name so print message
                 JOptionPane.showMessageDialog(null,"Please first fill all the fields");
             } else if (textEmail.getText().equals("")) {
                 JOptionPane.showMessageDialog(null,"First fill email");

             } else if (textFname.getText().equals("")) {
                 JOptionPane.showMessageDialog(null,"Father name required");

             } else if (textState.getText().equals("")) {
                 JOptionPane.showMessageDialog(null, "plz fill state");

             } else if (textPin.getText().equals("")) {
                 JOptionPane.showMessageDialog(null,"plz fill PinCode");

             } else {
                 DatabaseConnection con1 = new DatabaseConnection();
                 // q means query to insert data in to table
                 String q = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
                  con1.statement.executeUpdate(q); //executeUpdate used when query put or insert in to our table
                 new Signup2(formno); // go signup2 class and show form number
                 setVisible(false);
             }

        }
        catch (Exception E){
            E.printStackTrace();
        }

    }


    public  static  void main(String[]arg){
   new Signup(); // object here
    }

}
