package com.vastika1.st;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDb {

        public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
        public static final String URL = "jdbc:mysql://localhost:3306/";
        public static final String USER_NAME = "root";
        public static final String PASSWORD = "root";
        public static final String SQL = "create database test1_db";

        public static void main(String[] args) throws SQLException {
            Connection con = null;
            Statement st = null;

            try {
                Class.forName(DRIVER);
                con = DriverManager.getConnection(URL, USER_NAME,PASSWORD);
                st = con.createStatement();
                st.executeUpdate(SQL);
                System.out.println("db created");
            } catch (ClassNotFoundException  | SQLException e) {
                e.printStackTrace();
            }
            finally {
                con.close();
                st.close();
            }
        }
    }

    
