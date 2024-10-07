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
    private ArrayList<Requisitos> requisito;

    public Oferta(String puesto, String descripcion, String area, Date fechaInicio, Date fechaFinal) {
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.area = area;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.requisito = new ArrayList<Requisitos>();
    }
    
    public ArrayList<Requisitos> getRequisitos(){
        return requisito;
    }
    public boolean agregarRequisito(int orden, String descripcion, boolean estado){
        {
            return this.requisito.add(new Requisitos (orden, descripcion, estado));
        }  
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public ArrayList<Requisitos> getRequisito() {
        return requisito;
    }

    public void setRequisito(ArrayList<Requisitos> requisito) {
        this.requisito = requisito;
    }
    
    }
    
