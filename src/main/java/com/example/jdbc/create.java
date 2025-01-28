package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class create {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/college";
        String username = "root";
        String password = "Mouli@1234";

        Connection c = DriverManager.getConnection(url, username, password);

        Statement st = c.createStatement();
        st.execute("create table student1(id int, name varchar(20))");
        System.out.println("success");

    }

}
