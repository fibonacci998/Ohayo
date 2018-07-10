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
    private int wordID;
    private int userID;
    private int topicID;
    private String japanese;
    private String vietnamese;

    public UserWord(int wordID, int userID, int topicID, String japanese, String vietnamese) {
        this.wordID = wordID;
        this.userID = userID;
        this.topicID = topicID;
        this.japanese = japanese;
        this.vietnamese = vietnamese;
    }

   

    public int getWordID() {
        return wordID;
    }

    public void setWordID(int wordID) {
        this.wordID = wordID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getTopicID() {
        return topicID;
    }

    public void setTopicID(int topicID) {
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

    @Override
    public String toString() {
        return "UserWord{" + "wordID=" + wordID + ", userID=" + userID + ", topicID=" + topicID + ", japanese=" + japanese + ", vietnamese=" + vietnamese + '}';
    }
    
}
