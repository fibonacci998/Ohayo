/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import DBConnect.ConnectDB;
import entity.Dictionary;
import entity.RecentLesson;
import java.io.Serializable;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Laptop VINHLINK
 */
public class RecentActivitiesBean implements Serializable {

    private int userIDSession;

    public int getUserIDSession() {
        return userIDSession;
    }

    public void setUserIDSession(int userIDSession) {
        this.userIDSession = userIDSession;
    }

    public RecentActivitiesBean() {
    }

    public List<Dictionary> getRecentWords() throws Exception {
//        String select = "SELECT TOP 6 * FROM User_Word order by WordID desc";
//        String select = "SELECT TOP 7 * FROM Dictionary_Main where id != 20 and "
//                + " id != 27 and LessonID = '"+choosenID
//                + "' ORDER BY NEWID()";

        System.out.println("userID in BEAN " + userIDSession);
        String select = "SELECT TOP 6 * FROM User_Word "
                + " where UserID = " + userIDSession
                + " order by WordID desc ";
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

    public List<RecentLesson> getRecentLessons() throws Exception {
        //this query must contain the ID of user, which would define the latest
        //activities of an specific user in community. 

        //----> must be updated later
        String select = "SELECT TOP 6 lr.LessonID, l.LessonName FROM Lesson_Recently lr "
                + " inner join Lesson l "
                + " on lr.LessonID = l.LessonID "
                + " where lr.UserID = " + userIDSession
                + " order by lr.ID desc";
        ConnectDB conn = new ConnectDB();
        ResultSet rs = conn.getData(select);
        List<RecentLesson> list = new ArrayList<>();
        while (rs.next()) {

            String lessonID = rs.getString("LessonID");
            String lessonName = rs.getString("LessonName");
            list.add(new RecentLesson(lessonID, lessonName));
            System.out.println(lessonID + "\t" + lessonName);
        }
        rs.close();
        return list;
    }
}
