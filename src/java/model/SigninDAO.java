/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import DBConnect.ConnectDB;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author tuans
 */
public class SigninDAO {
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
    
    public String getUserID(String username) throws Exception{
        Connection conn= new ConnectDB().getConnection();
        ResultSet rs=conn.prepareStatement("SELECT UserID FROM dbo.[User] WHERE Username='"+username+"'").executeQuery();
        while(rs.next()){
            String userID=rs.getString(1);
            return userID;
        }
        return null;
    }
    public Boolean checkUserValid(String username, String password) throws Exception{
        Connection conn= new ConnectDB().getConnection();
        ResultSet rs=conn.prepareStatement("SELECT Password FROM dbo.[User] WHERE Username='"+username+"'").executeQuery();
        String decode=getHash(password);
        while(rs.next()){
            String passwordDB=rs.getString(1);
            if (decode.equals(passwordDB)){
                return true;
            }
        }
        return false;
    }
}
