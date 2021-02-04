package com.vastika1.st;

import com.vastika1.util.DbUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {
    public static final String SQL = "update user_tbl set user_name='Ramesh',password='ff' where id=4 ";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        try(

                Statement st = DbUtil.getConnection().createStatement();
        ) {
            st.executeUpdate(SQL);
            System.out.println("data updated");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
