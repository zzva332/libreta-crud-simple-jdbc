/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sena.libreta.sql;

import com.sena.libreta.connection.DBConnection;
import com.sena.libreta.model.Libreta;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class InsertarItemLibreta {
    public static void main(String[] args) {
        
        try {
            Connection conexion = DBConnection.getConnection();
            
            var libreta = new Libreta();
            libreta.id = 0;
            libreta.nombre = "nuevo registro";
            libreta.telefono = "343893589";
            libreta.domicilio = "avenida pruebas xs";
            
            var sql = "INSERT INTO libreta(nombre, telefono, domicilio) VALUES (?, ?, ?)";
            var st = conexion.prepareStatement(sql);
            st.setString(1, libreta.nombre);
            st.setString(2, libreta.telefono);
            st.setString(3, libreta.domicilio);
            
            st.executeUpdate();
           
            System.out.println("Registro almacenado correctamente. ya se puede apreciar en la lista de elementos");
            
        } catch (Exception ex) {
            Logger.getLogger(InsertarItemLibreta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
