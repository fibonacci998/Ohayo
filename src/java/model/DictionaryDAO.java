/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import DBConnect.ConnectDB;
import DBConnect.TestConnectDB;
import entity.Dictionary;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laptop VINHLINK
 */
public class DictionaryDAO {

    public List<Dictionary> selectDictionary(String lessonID) throws Exception {
        ConnectDB conn = new ConnectDB();
        ResultSet rs = conn.getData("select japanese, vietnamese "
                + "from Dictionary_Main where lessonID = " + lessonID);
        List<Dictionary> d = new ArrayList<>();
        while (rs.next()) {         
            String japanese = rs.getString("japanese");
            String vietnamese = rs.getString("vietnamese");          
            d.add(new Dictionary(japanese, vietnamese));
        }
        rs.close();
        return d;
    }
}
