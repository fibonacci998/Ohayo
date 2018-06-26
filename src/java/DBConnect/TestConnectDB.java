/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnect;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tuans
 */
public class TestConnectDB {

    public static void main(String[] args) {

        ConnectDB conn=new ConnectDB();
        ResultSet rs=conn.getData("select * from Dictionary_Main");
        try {
            while(rs.next()){
                String id=rs.getString(1);
                String japanese=rs.getString(2);
                String vietnamese=rs.getString(3);
                String category=rs.getString(4);
                String lesson=rs.getString(5);
                System.out.println(id+"\t"+japanese+"\t"+vietnamese+"\t"+category+"\t"+lesson);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TestConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
//        
//        ConnectDB conn=new ConnectDB();
//        ResultSet rs=conn.getData("select * from Lesson");
//        try {
//            while(rs.next()){
//                String id = rs.getString(1);
//                String name = rs.getString(2);
//                System.out.println(id+"\t"+name);
//            }
//            rs.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(TestConnectDB.class.getName()).log(Level.SEVERE, null, ex);
//        }




//        String select = "select count(*) from Lesson";
//        ConnectDB conn = new ConnectDB();
//        ResultSet rs = conn.getData(select);
//        int p = 0;
//        try {
//            if (rs.next()) {
//                p = rs.getInt(1);
//                System.out.println("row count " + p);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }
}
