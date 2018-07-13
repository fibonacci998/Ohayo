/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import DBConnect.ConnectDB;
import entity.Dictionary;
import entity.Lesson;
import java.io.Serializable;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Laptop VINHLINK
 */
public class FlashcardBean implements Serializable{
    private int page;
   private int pageSize;
   private String lessonID;
   
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

    public String getLessonID() {
        return lessonID;
    }

    public void setLessonID(String lessonID) {
        this.lessonID = lessonID;
    }
    
    public FlashcardBean() {
        page = 1;
        pageSize = 11;
        
    }

    public int getPages()throws Exception {
        int rows = getRowCount();   
        return rows / (pageSize) +1;
    }
     
    public int getRowCount()throws Exception {
        String select = "select count(*) from Dictionary_Main where LessonID = '"+lessonID+"'";
        ConnectDB conn = new ConnectDB();
        ResultSet rs = conn.getData(select);
        int p = 0;
        if(rs.next()){
            p = rs.getInt(1);
        }
        System.out.println("ROW COUNT BY id = "+p);
        rs.close();
        conn.closeConnection();
        return p;
    }
    
    public List<Dictionary> getWords()throws Exception {
        //calculate from or begin and to or end
        int from = (page - 1) * pageSize + 1;
        int to = page * pageSize;
        String select = "{call GetWordsByID(?, ?, ?)}";
        ConnectDB conn = new ConnectDB();
        CallableStatement cs = conn.prepareCallWord(select, from, to, lessonID);    
        ResultSet rs = cs.executeQuery();//execute store
        List<Dictionary> list = new ArrayList<>();
        while(rs.next()) {
            String jp = rs.getString("Japanese");
            String vi = rs.getString("Vietnamese");
            list.add(new Dictionary(jp, vi));
            System.out.println(jp+"\t"+vi);
            System.out.println("From "+from);
            System.out.println("To "+to);
        }
        cs.close();
        rs.close();
        conn.closeConnection();
        return list;
    }
}
