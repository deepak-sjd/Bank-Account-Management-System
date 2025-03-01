package bank.account.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

// public class Signup3 extends JFrame {
public  class Signup3 extends JFrame implements ActionListener{     // after all code finished implement ActionListener
    JCheckBox jCheckBox1,jCheckBox2,jCheckBox3,jCheckBox4,jCheckBox5,jCheckBox6,jCheckBox7,jCheckBox8,jCheckBox9,jCheckBox10;

    JRadioButton r1, r2, r3, r4;
    JButton submit,cancel;

    String formno;
    Signup3( String formno){
        this.formno = formno;
       // super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);


        JLabel l1 = new JLabel("Page 3:");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);


        JLabel l2 = new JLabel("Account Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(280,70,400,40);
        add(l2);


        JLabel l3 = new JLabel("Account Type:");
        l3.setFont(new Font("Raleway",Font.BOLD,20));
        l3.setBounds(100,140,200,30);
        add(l3);

        r1 = new JRadioButton("Saving Account");
        r1.setBackground(new Color(202, 241, 189));
        r1.setFont(new Font("Raleway",Font.BOLD,17));
        r1.setBounds(100,180,250,30);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setBackground(new Color(202, 241, 189));
        r2.setFont(new Font("Raleway",Font.BOLD,17));
        r2.setBounds(350,180,350,30);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setBackground(new Color(202, 241, 189));
        r3.setFont(new Font("Raleway",Font.BOLD,17));
        r3.setBounds(100,220,250,30);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setBackground(new Color(202, 241, 189));
        r4.setFont(new Font("Raleway",Font.BOLD,17));
        r4.setBounds(350,220,300,30);
        add(r4);

        // group all button because not click all at same time

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);


        JLabel l4 = new JLabel("Card Number:");
        l4.setFont(new Font("Raleway",Font.BOLD,19));
        l4.setBounds(100,300,200,30);
        add(l4);


        JLabel l5 = new JLabel("(Your 16-digit Card Number)");
        l5.setFont(new Font("Raleway",Font.ITALIC,13));
        l5.setBounds(100,330,200,20);
        add(l5);


        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-7479:");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(330,300,300,30);
        add(l6);

        JLabel l7 = new JLabel("It will appear on ATM cards, checkbooks, and statements.");
        l7.setFont(new Font("Raleway",Font.ITALIC,14));
        l7.setBounds(330,330,600,30);
        add(l7);

        JLabel l8 = new JLabel("PIN Number");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,370,200,30);
        add(l8);


        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Raleway",Font.BOLD,16));
        l9.setBounds(330,370,200,30);
        add(l9);

        JLabel l10 = new JLabel("(Enter your 4-digit password)");
        l10.setFont(new Font("Raleway",Font.ITALIC,13));
        l10.setBounds(100,390,400,30);
        add(l10);

        JLabel l11 = new JLabel("Services Required:");
        l11.setFont(new Font("Raleway",Font.BOLD,20));
        l11.setBounds(100,440,200,30);
        add(l11);

 // for checkBox button Service Requirement
        jCheckBox1= new JCheckBox("ATM CARD");
        jCheckBox1.setFont(new Font("Raleway",Font.BOLD,17));
        jCheckBox1.setBounds(100,500,200,30);
        jCheckBox1.setBackground(new Color(202, 241, 189));
        add(jCheckBox1);

        jCheckBox2= new JCheckBox("Internet Banking");
        jCheckBox2.setFont(new Font("Raleway",Font.BOLD,17));
        jCheckBox2.setBounds(350,500,200,30);
        jCheckBox2.setBackground(new Color(202, 241, 189));
        add(jCheckBox2);

        jCheckBox3= new JCheckBox("Mobile Banking");
        jCheckBox3.setFont(new Font("Raleway",Font.BOLD,17));
        jCheckBox3.setBounds(600,500,200,30);
        jCheckBox3.setBackground(new Color(202, 241, 189));
        add(jCheckBox3);

        jCheckBox4= new JCheckBox("Business Banking");
        jCheckBox4.setFont(new Font("Raleway",Font.BOLD,17));
        jCheckBox4.setBounds(100,550,200,30);
        jCheckBox4.setBackground(new Color(202, 241, 189));
        add(jCheckBox4);

        jCheckBox5= new JCheckBox("Financial Education");
        jCheckBox5.setFont(new Font("Raleway",Font.BOLD,17));
        jCheckBox5.setBounds(350,550,200,30);
        jCheckBox5.setBackground(new Color(202, 241, 189));
        add(jCheckBox5);

        jCheckBox6= new JCheckBox("Email Alerts");
        jCheckBox6.setFont(new Font("Raleway",Font.BOLD,17));
        jCheckBox6.setBounds(600,550,200,30);
        jCheckBox6.setBackground(new Color(202, 241, 189));
        add(jCheckBox6);

        jCheckBox7= new JCheckBox("Cheque Book");
        jCheckBox7.setFont(new Font("Raleway",Font.BOLD,17));
        jCheckBox7.setBounds(100,600,200,30);
        jCheckBox7.setBackground(new Color(202, 241, 189));
        add(jCheckBox7);

        jCheckBox8= new JCheckBox("E-Statement");
        jCheckBox8.setFont(new Font("Raleway",Font.BOLD,17));
        jCheckBox8.setBounds(350,600,200,30);
        jCheckBox8.setBackground(new Color(202, 241, 189));
        add(jCheckBox8);

        jCheckBox9= new JCheckBox("Investment Account");
        jCheckBox9.setFont(new Font("Raleway",Font.BOLD,17));
        jCheckBox9.setBounds(600,600,200,30);
        jCheckBox9.setBackground(new Color(202, 241, 189));
        add(jCheckBox9);

        jCheckBox10 = new  JCheckBox(" I hereby declare that the details provided above are accurate to the best of my knowledge and belief.",true); // write true of most be mark
        jCheckBox10.setFont(new Font("Raleway",Font.BOLD,16));
        jCheckBox10.setBounds(20,650,900,30);
        jCheckBox10.setBackground(new Color(202, 241, 189));
        add(jCheckBox10);


        JLabel l12 = new JLabel("Form No :");
        l12.setFont(new Font("Raleway",Font.BOLD,16));
        l12.setBounds(700,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,18));
        l13.setBounds(100,440,200,30);
        add(l13);


        submit = new JButton("Submit");
        submit.setForeground(Color.white);
        submit.setFont(new Font("Raleway",Font.BOLD,17));
        submit.setBounds(250,720,100,30);
        submit.setBackground(Color.black);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setForeground(Color.white);
        cancel.setFont(new Font("Raleway",Font.BOLD,17));
        cancel.setBounds(420,720,100,30);
        cancel.setBackground(Color.black);
        cancel.addActionListener(this);
        add(cancel);


       getContentPane().setBackground(new Color(202, 241, 189));
       setSize(850,800);
       setLayout(null);
       setLocation(400,20);
       setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e){

        String atype = null;
        if (r1.isSelected()){
            atype = "Saving Account";
        }
        else if (r2.isSelected()){
            atype ="Fixed Deposit Account";

        }
        else if (r3.isSelected()){
            atype ="Current Account";
        }
        else if (r4.isSelected()){
            atype = "Recurring Deposit Account";
        }

        // for card number generate random number
        Random ran = new Random();
        long first7 = (ran.nextLong()%90000000L)+7479500000L;  // our staring card number is 1409963 then zeros
        String cardno = " "+ Math.abs(first7); // this is used for generate random number

        long firs3 =(ran.nextLong()%9000L)+1000L; // for pin generate and one thing take these number very care fully
        String pinno = " "+ Math.abs(firs3);

        // now for get all facility like services
        String fac = "";
        if (jCheckBox1.isSelected()){
           fac ="ATM CARD";
        }
        else if (jCheckBox2.isSelected()){
            fac ="Internet Banking";
        }
        else if (jCheckBox3.isSelected()){
            fac = "Mobile Banking";

        }
        else if (jCheckBox4.isSelected()){
            fac ="Business Banking";
        }
        else if (jCheckBox5.isSelected()){
            fac = "Financial Education";
        }
        else if (jCheckBox6.isSelected()){
            fac = "Email Alerts";
        }
        else if (jCheckBox7.isSelected()){
            fac ="Cheque Book";

        }
        else if (jCheckBox8.isSelected()){
            fac ="E-Statement";

        }
        else if (jCheckBox9.isSelected()){
            fac ="Investment Account";
        }

        try {
              if (e.getSource()==submit){
                  if(atype.equals((""))){
                      JOptionPane.showMessageDialog(null,"Fill all the fields");
                  }
                  else {
                      DatabaseConnection con1 = new DatabaseConnection();
                      // q means query to insert data in to table  for submit button
                      String q1 = "insert into signupthree values('"+formno+"','"+atype+"','"+cardno+"','"+pinno+"','"+fac+"')";
                      String q2 = "insert into Login values('"+formno+"','"+cardno+"','"+pinno+"')";
                      con1.statement.executeUpdate(q1); //executeUpdate used when query put or insert in to our table
                      con1.statement.executeUpdate(q2);
                      JOptionPane.showMessageDialog(null,"Card Number : "+cardno+"\nPin : "+pinno);
                      new Deposit(pinno); // here we send pin to deposit class and  received in Deposit class
                      setVisible(false);
                  }
              }
              // for cancel buttom
            else if (e.getSource()==cancel){
                System.exit(0); // for exit form system
              }
        }catch (Exception E){
            E.printStackTrace();
        }

    }
    public static void main(String []arg){

     new  Signup3(" "); // without main call main method not run

    }
}
