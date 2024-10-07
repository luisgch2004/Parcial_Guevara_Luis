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
public class Postulacion {
    private Date fecha;
    private String glosa;
    private boolean anulada;
    private Date fechaAnulacion;
    private Oferta oferta;

    public Postulacion(Date fecha, String glosa, Oferta oferta) {
        this.fecha = fecha;
        this.glosa = glosa;
        this.oferta = oferta;
        this.anulada = false;
    }

    public void anular() {
        this.anulada = true;
        this.fechaAnulacion = new Date();
    }

    public boolean isActiva() {
        return !anulada;
    }
}
