package com.vastika1.ps;

import com.vastika1.util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDemo {
    public static final String SQL = "delete from user_tbl where id = ?)";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        try(

                PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
        ) {
        ps.setInt(1,5);
         ps.executeUpdate();
            System.out.println("data deleted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}






