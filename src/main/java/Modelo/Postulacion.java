/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Luis
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Postulacion {
    private Date fecha;
    private String glosa;
    private boolean anulada;
    private Date fechaAnulacion;
    private Oferta oferta;
    private List<Etapa> etapas;

    public Postulacion(Date fecha, String glosa, Oferta oferta) {
        this.fecha = fecha;
        this.glosa = glosa;
        this.oferta = oferta;
        this.anulada = false;
        this.etapas = new ArrayList<>();
    }

    public void anular() {
        this.anulada = true;
        this.fechaAnulacion = new Date();
    }

    public boolean isActiva() {
        return !anulada;
    }

    public void agregarEtapa(Etapa etapa) {
        etapas.add(etapa);
    }

    public List<Etapa> getEtapas() {
        return etapas;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getGlosa() {
        return glosa;
    }

    public void setGlosa(String glosa) {
        this.glosa = glosa;
    }

    public boolean isAnulada() {
        return anulada;
    }

    public void setAnulada(boolean anulada) {
        this.anulada = anulada;
    }

    public Date getFechaAnulacion() {
        return fechaAnulacion;
    }

    public void setFechaAnulacion(Date fechaAnulacion) {
        this.fechaAnulacion = fechaAnulacion;
    }

    public Oferta getOferta() {
        return oferta;
    }

    public void setOferta(Oferta oferta) {
        this.oferta = oferta;
    }

}

