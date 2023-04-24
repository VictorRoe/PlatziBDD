package org.platzi.Service;

import org.platzi.DAO.MensajesDAO;
import org.platzi.Model.Mensajes;

import java.util.Scanner;

public class mensajeService {
    public static void crearMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();

        System.out.println("Cual es el autor?");
        String nombre = sc.nextLine();

        Mensajes ms = new Mensajes();
        ms.setMensaje(mensaje);
        ms.setAutor_mensaje(nombre);
        MensajesDAO.crearMensajeDB(ms);
    }

    public static void listarMensaje() {

    }

    public static void borrarMensaje() {

    }

    public static void editarMensaje() {

    }
}
