/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import DBConnect.ConnectDB;
import entity.Topic;
import entity.UserWord;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wasd
 */
public class UserWordBean {
    private int page;
    private int pageSize;
    List<UserWord> list = new ArrayList<>();;
   
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
    
    public UserWordBean() {
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
    
    public List<UserWord> getWords(String topicID) throws Exception {
        ConnectDB conn = new ConnectDB();
        ResultSet rs = conn.getData("select * "
                + "from User_Word where TopicID = "+topicID);
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
