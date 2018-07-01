/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import DBConnect.ConnectDB;
import entity.Dictionary;
import entity.RecentLesson;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Laptop VINHLINK
 */
public class RecentLessonDAO {
    
    public void insert(RecentLesson reLesson) throws Exception{
        String query = "insert into Lesson_Recently values (1, ?)";
        Connection conn = new ConnectDB().getConnection();
        PreparedStatement ps = conn.prepareStatement(query); 
//        ps.setString(1, reLesson.getUserId());
        ps.setString(1, reLesson.getLessonId());
        ps.executeUpdate();
        conn.close();
    }
    
    public List<Dictionary> getRecentWords() throws Exception {
        String select = "SELECT TOP 7 * FROM User_Word order by WordID desc";

//        String select = "SELECT TOP 7 * FROM Dictionary_Main where id != 20 and "
//                + " id != 27 and LessonID = '"+choosenID
//                + "' ORDER BY NEWID()";

        ConnectDB conn = new ConnectDB();
        ResultSet rs = conn.getData(select);
        List<Dictionary> list = new ArrayList<>();
        while (rs.next()) {
            String jp = rs.getString("Japanese");
            String vi = rs.getString("Vietnamese");
            list.add(new Dictionary(jp, vi));
            System.out.println(jp + "\t" + vi);
        }
        rs.close();
        return list;
    }
    

}
