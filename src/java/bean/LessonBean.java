/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import DBConnect.ConnectDB;
import entity.Lesson;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Laptop VINHLINK
 */
public class LessonBean {

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
    
    public LessonBean() {
        page = 1;
        pageSize = 6;
        
    }

    public int getPages()throws Exception {
        int rows = getRowCount();   
        return rows / (pageSize) + 1;
    }
     
    public int getRowCount()throws Exception {
        String select = "select count(*) from Lesson";
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
    
    public List<Lesson> getLessons()throws Exception {
        //calculate from or begin and to or end
        int from = (page - 1) * pageSize + 1;
        int to = page * pageSize;
        String select = "{call GetLessons(?,?)}";
        ConnectDB conn = new ConnectDB();
        CallableStatement cs = conn.prepareCallLesson(select, from, to);    
        ResultSet rs = cs.executeQuery();//execute store
        List<Lesson> list = new ArrayList<>();
        while(rs.next()) {
            String id = rs.getString("LessonID");
            String name = rs.getString("LessonName");
            list.add(new Lesson(id, name));
        }
        cs.close();
        rs.close();
        conn.closeConnection();
        return list;
    }
    
   

    
   
   
   
}
