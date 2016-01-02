package com.laki;

import org.h2.jdbcx.JdbcDataSource;
import org.h2.tools.Server;

import javax.servlet.ServletContextEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Lakshman on 12/31/15.
 */
public class InitH2DBServer implements javax.servlet.ServletContextListener{

    Server tcpServer, webServer = null;


    public void contextInitialized(ServletContextEvent servletContextEvent) {

        try {
            tcpServer = Server.createTcpServer().start();
            webServer = Server.createWebServer().start();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        JdbcDataSource ds = new JdbcDataSource();
        ds.setURL("jdbc:h2:~/Documents/software/tomcat/test/book-keeper");
        ds.setUser("sa");
        ds.setPassword("sa");
//        try {
//            Connection conn = ds.getConnection();
//            Statement stmt = conn.createStatement();
//            //stmt.executeUpdate( "DROP TABLE table1" );
//            stmt.executeUpdate( "CREATE TABLE IF NOT EXISTS table1 ( user varchar(50) )" );
//            stmt.executeUpdate( "INSERT INTO table1 ( user ) VALUES ( 'Claudio' )" );
//            stmt.executeUpdate( "INSERT INTO table1 ( user ) VALUES ( 'Bernasconi' )" );
//
//            ResultSet rs = stmt.executeQuery("SELECT * FROM table1");
//            while( rs.next() )
//            {
//                String name = rs.getString("user");
//                System.out.println( name );
//            }
//            stmt.close();
//            conn.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        tcpServer.stop();
        webServer.stop();
    }
}
