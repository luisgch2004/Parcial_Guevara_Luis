/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Luis
 */
public class EstadoEtapa {
    private String nombre;
    private boolean estado;

    public EstadoEtapa(String nombre) {
        this.nombre = nombre;
        this.estado = true;
    }

    public void habilitar() {
        this.estado = true;
    }

    public void deshabilitar() {
        this.estado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
