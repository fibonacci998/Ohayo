package DBConnect;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author tuans
 */
public class ConnectDB {
    Connection conn=null;
    public ConnectDB(){
        //C1:fix code
        //call driver {using multi driver}
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //get connect
            conn=DriverManager.getConnection("jdbc:sqlserver://homersimpson.database.windows.net:1433;"
                    + "database=dbLearnJapaneseProgram;user=bart@homersimpson;"
                    + "password=lisa12#$;encrypt=true;trustServerCertificate=false;"
                    + "hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
            System.out.println("Connected");
        } catch (Exception e) {
            e.printStackTrace();
        }         
    }
    public Connection getConnection(){
        return this.conn;
    }
    
    public void closeConnection(){
        try {
             conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
       
        
    }
    
    public ResultSet getData(String sql){
        ResultSet rs=null;
        try {
            Statement state=conn.createStatement();
            rs=state.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    public void runUpdateData(String sql){
        Statement state;
        try {
            state = conn.createStatement();
            state.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public CallableStatement prepareCall(String select, int from, int to) {
        CallableStatement cs = null;
        try {
           cs = conn.prepareCall(select);
           cs.setInt(1, from);
           cs.setInt(2, to);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return cs;
    }

   
}
