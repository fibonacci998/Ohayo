/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import DBConnect.ConnectDB;
import entity.Topic;
import java.sql.ResultSet;
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
            String id = rs.getString(1);
            String name = rs.getString(2);          
            list.add(new Topic(id,name));
        }
        rs.close();
        return list;
    }
}
