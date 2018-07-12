/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author Wasd
 */
public class TestWord implements Serializable{
    private String id;
    private String japanese;
    private String vietnamese;

    public TestWord() {
    }

    public TestWord(String id, String japanese, String vietnamese) {
        this.id = id;
        this.japanese = japanese;
        this.vietnamese = vietnamese;
    }

    public TestWord(String japanese, String vietnamese) {
        this.japanese = japanese;
        this.vietnamese = vietnamese;
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        return japanese + "\t" + vietnamese + "}\n";
    }
    
    
}
