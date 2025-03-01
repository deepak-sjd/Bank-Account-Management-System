package bank.account.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String pin;  // here we received pin form signup3
    TextField textField;
    JButton b1, b2;
    Deposit(String pin){   // this is constructor class
        this.pin = pin;


        // for image icons
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,760,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,760);
        add(l3);

        JLabel label1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        label1.setForeground(Color.white);
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(460,145,400,35);
        l3.add(label1); // l3 because text show on image

        textField = new TextField();
        textField.setBackground(new Color(37, 94, 115, 239));
        textField.setForeground(Color.white);
        textField.setBounds(460,195,320,35);
        textField.setFont(new Font("Raleway",Font.BOLD,22));
        l3.add(textField);

        b1= new JButton("DEPOSIT");
        b1.setBounds(700,335,140,32);
        b1.setBackground(new Color(37, 94, 115, 239));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        l3.add(b1); // every time we add by the help of l3 because we add every thing on image

        b2 = new JButton("BACK");
        b2.setBounds(700,375,140,32);
        b2.setBackground(new Color(37, 94, 115, 239));
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        l3.add(b2);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        try {
            String amount = textField.getText();
            Date date = new Date();
            if (e.getSource()==b1){
                if (textField.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter the Amount you want to Deposit");
                }
                else {
                    DatabaseConnection con1 = new DatabaseConnection();
                    // q means query to insert data in to table  for submit button
                    con1.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Deposit','"+amount+"')");//here we not write + sign near Deposit because we not-declared globally direct store in database
                    JOptionPane.showMessageDialog(null,"Rs. "+amount+" Deposited Successfully");
                    setVisible(false); // after complete deposit click on ok then close the frame
                    new main_Class(pin); // after deposit go on main class means on atm and restart transaction
                }
            }
            else if (e.getSource()==b2){
                setVisible(false); // false because after click on b2 button means Back button then close the frame
                // after deposit click on back then go main atm screen
                new main_Class(pin); // go on main atm page where transaction process running
            }
        }
        catch (Exception E){
            E.printStackTrace();;
        }
    }

    public  static void main(String[]arg){
     new Deposit(""); // object for deposit constructor class

    }
}
