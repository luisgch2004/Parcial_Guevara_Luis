/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Luis
 */
public class Oferta {
    private String puesto;
    private String descripcion;
    private String area;
    private Date fechaInicio;
    private Date fechaFinal;
    private int nrequisito;
    private Requisitos requisito;

    public Oferta(String puesto, String descripcion, String area, Date fechaInicio, Date fechaFinal) {
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.area = area;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }
    
    public boolean agregarRequisito(int orden, String descripcion){
        boolean result = false;{
            this.requisito= new Requisitos (orden,descripcion);
        return result;
    }
    
    public boolean eliminarRequisitos(int orden){
        
    }
        
    }
    
}
