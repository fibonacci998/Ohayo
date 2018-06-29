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
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
            String id = rs.getString(1);
            String name = rs.getString(2);          
            list.add(new Topic(id,name));
        }
        rs.close();
        return list;
    }
}
