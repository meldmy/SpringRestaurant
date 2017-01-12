package com.luv2code.springdemo.mvc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Dmytro Melnychuk
 */
public class TestConnecrionMySQL {
    public static void main(String[] args) {

        String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
        String user = "hbtester";
        String pass = "hbtester";

        try {
            System.out.println("Connecting to database: " + jdbcUrl);

            try (Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass)) {
                System.out.println("Connection successful!!!");
            }

            System.out.println("ss");

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}

