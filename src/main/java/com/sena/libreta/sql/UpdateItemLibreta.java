/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sena.libreta.sql;

import com.sena.libreta.model.Libreta;
import com.sena.libreta.connection.DBConnection;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class UpdateItemLibreta {
    public static void main(String[] args) {
        
        try {
            Connection conexion = DBConnection.getConnection();
            
            var libreta = new Libreta();
            libreta.id = 1; // usuario a modificar
            libreta.nombre = "Juan modificado";
            libreta.telefono = "333333";
            libreta.domicilio = "avenida pruebas";
            
            String sql = "UPDATE libreta SET nombre = ?, telefono = ?, domicilio = ? WHERE id = ?";
            var st = conexion.prepareStatement(sql);
            st.setString(1, libreta.nombre);
            st.setString(2, libreta.telefono);
            st.setString(3, libreta.domicilio);
            st.setInt(4, libreta.id);
            
            st.executeUpdate();
            
            System.out.println("Registro actualizado correctamente. ya se puede apreciar en la lista de elementos");
            
        } catch (Exception ex) {
            Logger.getLogger(UpdateItemLibreta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
