/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import DBConnect.ConnectDB;
import entity.TestWord;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wasd
 */
public class TestBean {
    String lessonID;
    String lessonName;

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }
    public TestBean() {
    }
    
    
    public String getLessonID() {
        return lessonID;
    }

    public void setLessonID(String lessonID) {
        this.lessonID = lessonID;
    }
    public List<TestWord> getWords()throws Exception {
        ConnectDB conn = new ConnectDB();
        System.out.println(lessonID);
        ResultSet rs = conn.getData("select * from Dictionary_Main where LessonID='"+lessonID+"'");
        List<TestWord> list = new ArrayList<>();
        while (rs.next()) {         
            String id = rs.getString(1);
            String jp = rs.getString(2);
            String vi = rs.getString(3);          
            list.add(new TestWord(jp,vi));
        }
        for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        rs.close();
        conn.closeConnection();
        return list;
    }
}
