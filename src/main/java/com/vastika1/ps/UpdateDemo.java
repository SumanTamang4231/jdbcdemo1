package com.vastika1.ps;

import com.vastika1.util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDemo {
    public static final String SQL = "update user_tbl set user_name=? ,password=? where id=?";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        try(

                PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
        ) {
            ps.setString(1,"krishna");
            ps.setString(2,"kk");
            ps.setInt(3,5);


            ps.executeUpdate();
            System.out.println("data updated");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}



