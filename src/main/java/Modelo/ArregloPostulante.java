/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis
 */
public class ArregloPostulante {
    private List<Postulante> postulantes;

    public ArregloPostulante() {
        postulantes = new ArrayList<>();
    }

    public boolean agregar(Postulante postulante) {
        return postulantes.add(postulante);
    }

}

