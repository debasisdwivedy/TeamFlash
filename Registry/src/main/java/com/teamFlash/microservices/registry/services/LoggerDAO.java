package com.teamFlash.microservices.registry.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * Created by girish on 9/24/16.
 */
public class LoggerDAO {

     String url;
     String db ;
     String JDBC_DRIVER = "com.mysql.jdbc.Driver";
     String DB_URL = null;
     String user ;
     String password ;

    LoggerDAO()
    {
        initializeFields();
    }

    public void initializeFields()
    {
        Properties prop = new Properties();
        InputStream input = null;

        try {

            input = new FileInputStream("config.properties");
            // load a properties file
            prop.load(input);
            // get the property value and print it out
            url=prop.getProperty("url");
            user=prop.getProperty("user");
            password=prop.getProperty("password");
            db=prop.getProperty("dbName");
            DB_URL=url+db;
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void insertLog(Log log)
    {
        Connection conn=null;
        PreparedStatement pstmt = null;

        try
        {
            String userID = log.getUserID();
            String requestID = log.getRequestID();
            String microservice = log.getMicroservice();
            String description = log.getLogDescription();
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,user,password);
            System.out.println("Trying to initiate connection"); 
            Date date = new Date(System.currentTimeMillis());
            Timestamp now = new Timestamp(date.getTime());
             System.out.println("Date: "+date);
            String sql = "Insert into user_request_log_dtls values (?,?,?,?,?)";
            pstmt = conn.prepareStatement(sql);
            System.out.println("After prepared statement"); 
            pstmt.setString(1,requestID);
            pstmt.setString(2,userID);
            pstmt.setString(3,microservice);
            pstmt.setString(4,description);
            pstmt.setTimestamp(5,now);
            pstmt.executeUpdate();
            System.out.println("After execute query"); 
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
           if (conn != null) {
                try {
                     System.out.println("Inside try to cllose connection");
                         conn.close();
                    } catch (SQLException e) {
                         e.printStackTrace();
                 }
               }
        }
    }


    public void deleteLog(String requestID)
    {
        Connection conn=null;
        PreparedStatement pstmt = null;

        try
        {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,user,password);
            String sql = "delete FROM user_request_log_dtls where request_id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,requestID);
            pstmt.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


}