/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import DBConnect.ConnectDB;
import entity.Topic;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wasd
 */
public class TopicDAO {
    public List<Topic> selectTopic() throws Exception {
        ConnectDB conn = new ConnectDB();
        ResultSet rs = conn.getData("select * from Word_Topic ");
        List<Topic> list = new ArrayList<>();
        while (rs.next()) {         
            int id = rs.getInt(1);
            String name = rs.getString(2);          
            list.add(new Topic(id,name));
        }
        rs.close();
        return list;
    }
    
    public void insert(String name) throws SQLException{
        String insert = "insert into Word_Topic values('?')";
        ConnectDB conn = new ConnectDB();
        try (PreparedStatement ps = conn.insertTopic(insert,name)) {
            conn.closeConnection();
        }
    }
}
