/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sena.libreta.model;

/**
 *
 * @author Usuario
 */
public class Libreta {
    public int id;
    public String nombre;
    public String telefono;
    public String domicilio;
    
    public Libreta(){
        
    }
    public Libreta(int id, String nombre, String telefono, String domicilio){
        this.nombre = nombre;
        this.telefono = telefono;
        this.domicilio = domicilio;
    }
}
