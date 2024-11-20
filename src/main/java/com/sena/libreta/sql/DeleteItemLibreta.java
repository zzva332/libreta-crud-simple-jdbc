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
public class DeleteItemLibreta {
    public static void main(String[] args) {
        
        try {
            Connection conexion = DBConnection.getConnection();
            int libretaId = 5;
            String sql = "DELETE FROM libreta WHERE id = ?";
            var st = conexion.prepareStatement(sql);
            
            st.setInt(1, libretaId);
            
            st.executeUpdate();
            System.out.println("Se removio el elemento exitosamente");
            
        } catch (Exception ex) {
            Logger.getLogger(DeleteItemLibreta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
