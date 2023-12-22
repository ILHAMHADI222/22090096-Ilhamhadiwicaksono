/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Connection;

import com.mysql.cj.jdbc.MysqlDataSource;
import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author lenovo
 */
public class Connectiondb {
     public static Connection Koneksi_DB(){
            try{
                MysqlDataSource m = new MysqlDataSource();
            m.setUser("root");
            m.setPassword("");
            m.setDatabaseName("sinomanapps");
            m.setServerName("localhost");
            m.setPortNumber(3306);
            m.setServerTimezone("Asia/Jakarta");
            
            Connection C = (Connection) m.getConnection();
            System.out.println("Succes");
            return C;
            } catch(Exception e){
                System.out.println("Gagal " + e.getMessage());
            }
        return null;
        }
    
}
