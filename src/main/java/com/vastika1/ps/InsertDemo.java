package com.vastika1.ps;

import com.vastika1.util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {
    public static final String SQL = "insert into user_tbl(user_name,password)values(?,?)";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        try(

                PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
        ) {
            ps.setString(1,"gopal");
            ps.setString(2,"gg");


            ps.executeUpdate();
            System.out.println("data inserted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}




