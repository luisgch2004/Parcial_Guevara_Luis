/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Luis
 */
public class Requisitos {
    private int orden;
    private String descripcion;
    private boolean estado;

    public Requisitos(int orden, String descripcion, boolean estado) {
        this.orden = orden;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    Requisitos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public boolean habilitar(){
        this.estado = true;
        return this.estado;
    }
    public boolean deshabilitar(){
        this.estado = false;
        return this.estado;
    }
}
