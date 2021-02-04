package com.vastika1.ps;

import com.vastika1.util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectDemo2 {
    public static final String SQL = "select * from user_tbl where id =?";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        try(

                PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
        ) {
            ps.setInt(1,2);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                System.out.println("Id is :"+rs.getInt("id"));
                System.out.println("Usernmame is :"+rs.getString("user_name"));
                System.out.println("Password is :"+rs.getString("password"));
            }



        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
