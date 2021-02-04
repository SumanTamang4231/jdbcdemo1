package com.vastika1.ps;

import com.mysql.cj.protocol.Resultset;
import com.vastika1.util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectDemo {
    public static final String SQL = "select * from user_tbl";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        try(

                PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
        ) {
           ResultSet rs=ps.executeQuery();
           while(rs.next()){
               System.out.println("Id is :"+rs.getInt(1));
               System.out.println("Usernmame is :"+rs.getString(2));
               System.out.println("Password is :"+rs.getString(3));
           }



        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}





