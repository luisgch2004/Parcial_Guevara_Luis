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

public class ArregloGradoEstudio {
    private List<GradoEstudio> gradosEstudio;

    public ArregloGradoEstudio() {
        gradosEstudio = new ArrayList<>();
    }

    public boolean agregar(GradoEstudio grado) {
        return gradosEstudio.add(grado);
    }

    public GradoEstudio buscarPorDescripcion(String descripcion) {
        for (GradoEstudio grado : gradosEstudio) {
            if (grado.getDescripcion().equals(descripcion)) {
                return grado;
            }
        }
        return null;
    }

    public List<GradoEstudio> getGradosEstudio() {
        return gradosEstudio;
    }
}

