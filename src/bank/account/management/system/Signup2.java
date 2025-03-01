package bank.account.management.system;

import com.mysql.cj.util.StringInspector;

import javax.swing.*;
import javax.xml.stream.Location;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox comboBox,comboBox1,comboBox2,comboBox3,comboBox4;
    JTextField textPan, textAadhar;
    JRadioButton r1,r2,r3,r4;
    JButton button;
    String formno;
    Signup2(String formno){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno = formno;



        JLabel l1 = new JLabel("Page 2 :-");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion");
        l3.setFont(new Font("Raleway",Font.BOLD,20));
        l3.setBounds(100,120,100,60);
        add(l3);

        String religion[]={"Hindu","Muslim","Sikh","Christian","Other"};
        //comboBox used for available option
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(194, 214, 243));
        comboBox.setFont(new Font("Raleway",Font.BOLD,17));
        comboBox.setBounds(350,135,320,30);
        add(comboBox);

        JLabel l4 = new JLabel("Category");
        l4.setFont(new Font("Raleway",Font.BOLD,20));
        l4.setBounds(100,190,100,30);
        add(l4);

        String Category[]={"general","OBC","SC","ST","Other"};
        comboBox1 = new JComboBox(Category);
        comboBox1.setBackground(new Color(194, 214, 243));
        comboBox1.setFont(new Font("Raleway",Font.BOLD,17));
        comboBox1.setBounds(350,190,320,30);
        add(comboBox1);


        JLabel l5 = new JLabel("Income: ");
        l5.setFont(new Font("Raleway",Font.BOLD,20));
        l5.setBounds(100,235,100,30);
        add(l5);

        String Income[]={"Null","Less Than - 1,50,000","Less Than - 2,50,000","5,00,000","Upto 10,00,000","Above 10,00,000"};
        comboBox2 = new JComboBox(Income);
        comboBox2.setBackground(new Color(194, 214, 243));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,17));
        comboBox2.setBounds(350,235,320,30);
        add(comboBox2);


        JLabel l6 = new JLabel("Education: ");
        l6.setFont(new Font("Raleway",Font.BOLD,20));
        l6.setBounds(100,285,150,30);
        add(l6);

        String Education[]={"Non-Graduate","High School","Matric Pass","Intermediate Pass","MBBS","Graduate","Engineering","Law","Other"};
        comboBox3 = new JComboBox(Education);
        comboBox3.setBackground(new Color(194, 214, 243));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,17));
        comboBox3.setBounds(350,285,320,30);
        add(comboBox3);



        JLabel l7 = new JLabel("Occupation: ");
        l7.setFont(new Font("Raleway",Font.BOLD,20));
        l7.setBounds(100,335,150,30);
        add(l7);

        String Occupation[]={"Choose-One","Salaried","Self-Employed","Business","Student","Indian-Force","Teacher","Doctor","Law","Retired","Other"};
        comboBox4 = new JComboBox(Occupation);
        comboBox4.setBackground(new Color(194, 214, 243));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,17));
        comboBox4.setBounds(350,335,320,30);
        add(comboBox4);


        JLabel l8 = new JLabel("Aadhar Number: ");
        l8.setFont(new Font("Raleway",Font.BOLD,20));
        l8.setBounds(100,385,180,30);
        add(l8);

        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Raleway",Font.BOLD,18));
        textAadhar.setBounds(350,385,320,30);
        textAadhar.setBackground(new Color(194, 214, 243));
        add(textAadhar);



        JLabel l9 = new JLabel("PAN Number : ");
        l9.setFont(new Font("Raleway",Font.BOLD,20));
        l9.setBounds(100,435,150,30);
        add(l9);

        textPan = new JTextField();
        textPan.setFont(new Font("Raleway",Font.BOLD,18));
        textPan.setBounds(350,435,320,30);
        textPan.setBackground(new Color(194, 214, 243));
        add(textPan);

     // for asked users to Senior Citizen yes/No
        JLabel l10 = new JLabel("Senior Citizen : ");
        l10.setFont(new Font("Raleway",Font.BOLD,20));
        l10.setBounds(100,485,250,30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,17));
        r1.setBackground(new Color(198, 178, 250, 255));
        r1.setBounds(350,485,100,30);
        add(r1);

        r2= new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,17));
        r2.setBackground(new Color(198, 178, 250, 255));
        r2.setBounds(490,485,100,30);
        add(r2);


        ButtonGroup  buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);


        // for asked user  Existing Account  yes/no

        JLabel l11 = new JLabel("Existing Account : ");
        l11.setFont(new Font("Raleway",Font.BOLD,20));
        l11.setBounds(100,535,250,30);
        add(l11);

        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Raleway",Font.BOLD,17));
        r3.setBackground(new Color(198, 178, 250, 255));
        r3.setBounds(350,535,100,30);
        add(r3);

        r4= new JRadioButton("No");
        r4.setFont(new Font("Raleway",Font.BOLD,17));
        r4.setBackground(new Color(198, 178, 250, 255));
        r4.setBounds(490,535,100,30);
        add(r4);


        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r3);
        buttonGroup1.add(r4);


        // this is for form number



        JLabel l12 = new JLabel("Form No :");
        l12.setFont(new Font("Raleway",Font.BOLD,15));
        l12.setBounds(660,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,18));
        l13.setBounds(100,440,200,30);
        add(l13);

        // button for go next page

        button = new JButton("Next");
        button.setFont(new Font("Raleway",Font.BOLD,17));
        button.setBackground(new Color(119, 146, 232));
        button.setForeground(Color.black);
        button.setBounds(450,640,100,30);
        add(button);
        button.addActionListener(this);





        this.formno = formno; // used for the coming from signup first page to this page first declared global String formNumber

        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(198, 178, 250, 255));
        setVisible(true);
    }
    // here we perform Action Litnier
    @Override
    public void actionPerformed(ActionEvent e){

        String rel = (String) comboBox.getSelectedItem();
        String cat = (String) comboBox1.getSelectedItem();
        String inc = (String) comboBox2.getSelectedItem();
        String edu = (String) comboBox3.getSelectedItem();
        String occ = (String) comboBox4.getSelectedItem();

        String pan = textPan.getText();
        String aadhar = textAadhar.getText();

        String scitizen = " "; // you can also take like null the place of null
        if((r1.isSelected())){
            scitizen = "Yes";
        }
        else  if (r2.isSelected()){
            scitizen ="No";
        }

        String eAccount = " ";
        if (r1.isSelected()){
            eAccount ="Yes";

        }
        else if (r1.isSelected()){
            eAccount = "No";
        }

        // now data store in database
        try {
            if (textPan.getText().equals("")||textPan.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please Fill all the fields");
            }
            else {
                DatabaseConnection con1 = new DatabaseConnection();
                // q means query
                String q = "insert into Signuptwo values('"+formno+"','"+rel+"','"+cat+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eAccount+"')";
                 con1.statement.executeUpdate(q);
                 new Signup3(formno);
                 setVisible(false);
            }

        }
        catch (Exception E){
            E.printStackTrace();
        }


    }
    public static void main(String[]arg){
        new Signup2("");
    }
}
