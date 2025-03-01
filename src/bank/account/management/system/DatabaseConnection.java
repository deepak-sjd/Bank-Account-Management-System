package bank.account.management.system;

import java.sql.*;

public class DatabaseConnection {
    Statement statement;

    Connection connection;


    public DatabaseConnection(){
        try { // here we connect our database directly from sql workbench
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","@Deepak99311");
            statement = connection.createStatement();

        }
        // why we used try catch due to we access data from sql so may be exception is hppend so catch the exception we used
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

