/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import DBConnect.ConnectDB;
import entity.Lesson;
import entity.Topic;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Wasd
 */
public class TopicBean {
    private int page;
   private int pageSize;

    
    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    
    public TopicBean() {
        page = 1;
        pageSize = 5;
        
    }

    public int getPages()throws Exception {
        int rows = getRowCount();   
        return rows / (pageSize) + 1;
    }
     
    public int getRowCount()throws Exception {
        String select = "select count(*) from Word_Topic";
        ConnectDB conn = new ConnectDB();
        ResultSet rs = conn.getData(select);
        int p = 0;
        if(rs.next()){
            p = rs.getInt(1);
        }
        rs.close();
        conn.closeConnection();
        return p;
    }
    
    public List<Topic> getTopics() throws Exception {
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
        PreparedStatement ps = conn.insertTopic(insert,name);
        ps.setString(1, name);
        conn.closeConnection();
        ps.close();
    }
}
