package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");


        String url = "jdbc:mysql://localhost/java";
        String username = "root";
        String password = "Mouli@1234";

        //Establishing connection
        Connection c = DriverManager.getConnection(url, username, password);
//
        //executing sql statement
        Statement st = c.createStatement();
        st.execute("create table student1(id int, name varchar(20))");
        System.out.println("success");
    }
}