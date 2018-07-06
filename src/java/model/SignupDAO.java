/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import DBConnect.ConnectDB;
import entity.Dictionary;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tuans
 */
public class SignupDAO {
    //convert text to hash encrypt
    private String getHash(String text) throws Exception{
        Connection conn = new ConnectDB().getConnection();
        ResultSet rs=conn.prepareStatement("SELECT CONVERT(VARCHAR(32), HashBytes('MD5', '"+text+"'), 2) as md5").executeQuery();
        while(rs.next()){
            String encode=rs.getString(1);
            conn.close();
            return encode;
        }
        conn.close();
        return null;
    }
    //add new user to database
    public void addNewUser(String email, String username, String password) throws Exception {
        String query="INSERT INTO dbo.[User]\n" +
        "  (\n" +
        "      Username,\n" +
        "      Password,\n" +
        "      Email\n" +
        "  )\n" +
        "  VALUES\n" +
        "  (   N'"+username+"', -- Username - nvarchar(50)\n" +
        "      '"+getHash(password)+"',  -- Password - varchar(32)\n" +
        "      N'"+email+"'  -- Email - nvarchar(50)\n" +
        "  )";
        Connection conn=new ConnectDB().getConnection();
        conn.prepareStatement(query).executeUpdate();
        conn.close();
    }
    //check if email is existed
    public boolean checkEmailExist(String email) throws SQLException{
        Connection conn=new ConnectDB().getConnection();
        String query="SELECT * FROM dbo.[User] WHERE Email LIKE '"+email+"'";
        ResultSet rs=conn.prepareStatement(query).executeQuery();
        while (rs.next()){
            return true;
        }
        return false;
    }
    //check if username is existed
    public boolean checkUsernameExist(String username) throws SQLException{
        Connection conn=new ConnectDB().getConnection();
        String query="SELECT * FROM dbo.[User] WHERE username LIKE '"+username+"'";
        ResultSet rs=conn.prepareStatement(query).executeQuery();
        while (rs.next()){
            return true;
        }
        return false;
    }
}
