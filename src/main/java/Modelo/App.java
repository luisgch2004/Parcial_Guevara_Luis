/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Luis
 */
import java.util.Date;

public class App {

    public static void main(String[] args) {
        cliente cliente1 = new cliente("123456789", "Empresa A", "contacto@empresaA.com", "999999999", "pass123");
        cliente cliente2 = new cliente("987654321", "Empresa B", "contacto@empresaB.com", "888888888", "pass456");

        Oferta oferta1 = new Oferta("Desarrollador Java", "Desarrollo backend en Java", "TI", new Date(), new Date());
        oferta1.agregarRequisito(1, "Experiencia mínima de 2 años", true);
        oferta1.agregarRequisito(2, "Conocimientos en bases de datos", true);

        cliente1.agregarOferta(oferta1);


        Postulante postulante1 = new Postulante("12345678", "postulante1@gmail.com", "Juan", "Pérez", "Av. Siempre Viva 123", new Date(), "clave123");

        postulante1.postular(oferta1, "Me gustaría trabajar en su empresa.");


        System.out.println("Detalles de la oferta:");
        System.out.println(oferta1);

        System.out.println("\nRequisitos:");
        for (Requisitos req : oferta1.getRequisitos()) {
            System.out.println(req.getOrden() + ". " + req.getDescripcion());
        }

    }
}

