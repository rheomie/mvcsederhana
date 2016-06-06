/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author MalingerS Media
 */
public class Koneksi {
    public Connection connect;
    public Statement state;
    public ResultSet res;
    String namaDatabase = "jdbc:mysql://localhost:3306/db_teman";
        
     public void koneksiDatabase(){
        try {
            connect = DriverManager.getConnection(namaDatabase,"root","");//nama database, username database, password database
            System.out.println("Koneksi Tidak Bermasalah");
            state = connect.createStatement();
        } catch (SQLException ex) {
             System.err.println("Cek url, username host dan password host");
             System.err.println("SQLException:"+ex.getMessage());
        }
    }
}
