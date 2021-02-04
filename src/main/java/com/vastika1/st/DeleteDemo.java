package com.vastika1.st;

import com.vastika1.util.DbUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDemo {
    public static final String SQL = "delete from user_tbl where id=4";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        try(

                Statement st = DbUtil.getConnection().createStatement();
        ) {
            st.executeUpdate(SQL);
            System.out.println("data deleted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}




