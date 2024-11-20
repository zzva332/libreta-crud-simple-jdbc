/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sena.libreta.sql;

import com.sena.libreta.connection.DBConnection;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class ListarItemsLibreta {
    public static void main(String[] args) {
        
        try {
            Connection conexion = DBConnection.getConnection();
            
            var st = conexion.createStatement();
            String sql = "SELECT * FROM libreta";
            var result = st.executeQuery(sql);
            result.next();
            do {
                System.out.println("ID: " + result.getInt("id"));
                System.out.println("NOMBRE: " + result.getString("nombre"));
                System.out.println("TELEFONO: " + result.getString("telefono"));
                System.out.println("DOMICILIO: " + result.getString("domicilio"));
                System.out.println("----------------------------------------");
            } while(result.next());
            
        } catch (Exception ex) {
            Logger.getLogger(ListarItemsLibreta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
