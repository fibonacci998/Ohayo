/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Wasd
 */
public class UserWord {
    private String wordID;
    private String userID;
    private String topicID;
    private String japanese;
    private String vietnamese;

    public UserWord(String wordID, String userID,  String japanese, String vietnamese,String topicID) {
        this.wordID = wordID;
        this.userID = userID;
        this.japanese = japanese;
        this.vietnamese = vietnamese;
        this.topicID = topicID;
    }

    public String getWordID() {
        return wordID;
    }

    public void setWordID(String wordID) {
        this.wordID = wordID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getTopicID() {
        return topicID;
    }

    public void setTopicID(String topicID) {
        this.topicID = topicID;
    }

    public String getJapanese() {
        return japanese;
    }

    public void setJapanese(String japanese) {
        this.japanese = japanese;
    }

    public String getVietnamese() {
        return vietnamese;
    }

    public void setVietnamese(String vietnamese) {
        this.vietnamese = vietnamese;
    }
    
    
}
