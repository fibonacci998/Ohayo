/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import DBConnect.ConnectDB;
import entity.UserWord;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wasd
 */
public class WordDAO {
    public List<UserWord> selectWord(String topicID) throws Exception {
        ConnectDB conn = new ConnectDB();
        ResultSet rs = conn.getData("select * "
                + "from User_Word where TopicID = "+topicID);
        List<UserWord> list = new ArrayList<>();
        while (rs.next()) {   
            String wordID = rs.getString(1);
            String userID = rs.getString(2);
            String japanese = rs.getString(3);
            String vietnamese = rs.getString(4);     
            list.add(new UserWord(wordID,userID,japanese,vietnamese,topicID));
        }
        rs.close();
        return list;
    }
}
