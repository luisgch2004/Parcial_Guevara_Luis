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

public class ArregloCliente {
    private List<cliente> clientes;

    public ArregloCliente() {
        clientes = new ArrayList<>();
    }

    public boolean agregar(cliente cliente) {
        return clientes.add(cliente);
    }

    public cliente buscarPorRUC(String RUC) {
        for (cliente cliente : clientes) {
            if (cliente.getRUC().equals(RUC)) {
                return cliente;
            }
        }
        return null;
    }

    public List<cliente> getClientes() {
        return clientes;
    }
}

