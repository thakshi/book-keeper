package com.laki.dao;

import io.swagger.model.User;
import org.h2.jdbcx.JdbcDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class UserDao {
    private static JdbcDataSource dataSource = null;
    private static String tomcatHome = null;

    private static UserDao userDao = new UserDao();


    private UserDao(){
        dataSource = new JdbcDataSource();
        tomcatHome =  System.getProperty("catalina.base");
        dataSource.setURL("jdbc:h2:"+tomcatHome+"/database/book-keeper");
        dataSource.setUser("sa");
        dataSource.setPassword("sa");
    }

    public static UserDao getUserDaoInstance(){
        return userDao;
    }

    public boolean addUser(User user) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = dataSource.getConnection();
            stmt = conn.createStatement();
            stmt.executeUpdate("INSERT  INTO CUSTOMER (NAME, ADDRESS, TELEPHONE_NO, EMAIL_ADDRESS, FAX_NUMBER) VALUES ('"+
                    user.getName()+"','"+user.getAddress()+"','"+user.getPhoneNumber()+"','"+
                    user.getEmailAddress()+"','"+user.getFaxNumber()+"')");
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        finally {
            if(stmt != null){
                stmt.close();
            }
            if(conn != null){
                conn.close();
            }
        }

        return true;

    }

    public ArrayList<User> getAllUsers() throws SQLException {
        ArrayList<User> userList = new ArrayList<User>();
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = dataSource.getConnection();
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM CUSTOMER");
            while(rs.next()){
                User user = new User();
                user.setName(rs.getString("NAME"));
                user.setAddress(rs.getString("ADDRESS"));
                user.setPhoneNumber(rs.getString("TELEPHONE_NO"));
                user.setFaxNumber(rs.getString("FAX_NUMBER"));
                userList.add(user);
            }
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;

        }
        finally {
            if(stmt != null){
                stmt.close();
            }
            if(conn != null){
                conn.close();
            }
        }

        return userList;

    }

    public User getUserById(int id){
        return null;
    }

    public User getUserByName(String name){
        return null;
    }

    public boolean updateUserById(int id){
        return false;
    }
    public boolean updateUserByName(String name){
        return false;
    }
}
