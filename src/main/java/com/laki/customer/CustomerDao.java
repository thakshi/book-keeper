package com.laki.customer;

import org.h2.jdbcx.JdbcDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Lakshman on 1/2/16.
 */
public class CustomerDao {

    public static void addCustomer(String name, String address, String tpNo){
        try {
            JdbcDataSource ds = new JdbcDataSource();
            String tomcatHome = System.getProperty("catalina.base");
            ds.setURL("jdbc:h2:"+tomcatHome+"/database/book-keeper");
            ds.setUser("sa");
            ds.setPassword("sa");
            Connection conn = ds.getConnection();
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT  INTO CUSTOMER (NAME, ADDRESS, TELEPHONE_NO) VALUES ('"+name+"','"+address+"','"+tpNo+"')");
//            stmt.executeUpdate( "INSERT INTO table1 ( user ) VALUES ( 'Claudio' )" );
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
