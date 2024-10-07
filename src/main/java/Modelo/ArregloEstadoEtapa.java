/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Luis
 */
import java.util.ArrayList;
import java.util.List;

public class ArregloEstadoEtapa{
    private List<EstadoEtapa> estadosEtapa;

    public ArregloEstadoEtapa() {
        estadosEtapa = new ArrayList<>();
    }

    public boolean agregar(EstadoEtapa estado) {
        return estadosEtapa.add(estado);
    }

}