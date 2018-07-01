/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author Laptop VINHLINK
 */
public class RecentLesson implements Serializable{
    private int userId;
    private String lessonId;
    private String lessonName;

    public RecentLesson() {
    }

    public RecentLesson(int userId, String lessonId) {
        this.userId = userId;
        this.lessonId = lessonId;
    }

    public RecentLesson(String lessonId, String lessonName) {
        this.lessonId = lessonId;
        this.lessonName = lessonName;
    }
    
    

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLessonId() {
        return lessonId;
    }

    public void setLessonId(String lessonId) {
        this.lessonId = lessonId;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    

    
    
}
