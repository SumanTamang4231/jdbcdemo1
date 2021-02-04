package com.vastika1.st;

import com.vastika1.util.DbUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

    public static final String SQL = "insert into user_tbl(user_name,password)values('GOpal','dd')";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        try(

                Statement st = DbUtil.getConnection().createStatement();
        ) {
            st.executeUpdate(SQL);
            System.out.println("data inserted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


