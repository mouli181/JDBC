package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class insert {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/college";
        String username = "root";
        String password = "Mouli@1234";


        Connection c = DriverManager.getConnection(url, username, password);

        String str = "insert into student1 values(?,?)";

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the id");
        int id = s.nextInt();
        s.nextLine();
        System.out.println("Enter the name");
        String name = s.nextLine();

        PreparedStatement p = c.prepareStatement(str);
        p.setInt(1, id);
        p.setString(2,name);

        int e = p.executeUpdate();
        if(e > 0) {
            System.out.println("Insertion Sucessfull");
        }
        else {
            System.out.println("Insertion Failiure");
        }
    }
}
