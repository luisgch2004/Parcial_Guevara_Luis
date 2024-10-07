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

public class ArregloRubro {
    private List<Rubro> rubros;

    public ArregloRubro() {
        rubros = new ArrayList<Rubro>();
    }

    public boolean agregar(Rubro rubro) {
        return rubros.add(rubro);
    }

    public Rubro buscarPorNombre(String nombre) {
        for (Rubro rubro : rubros) {
            if (rubro.getNombre().equals(nombre)) {
                return rubro;
            }
        }
        return null;
    }

    public List<Rubro> getRubros() {
        return rubros;
    }
}

