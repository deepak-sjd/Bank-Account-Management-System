package bank.account.management.system;
import java.sql.*;

public class Connnection {
    Connection connection;
    Statement statement;
    public Connnection(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","@Deepak74795");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}