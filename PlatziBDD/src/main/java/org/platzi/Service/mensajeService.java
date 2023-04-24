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
        MensajesDAO.leerMensajeDB();
    }

    public static void borrarMensaje() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica el ID del mensaje a borrar");
        int id_mensaje=scanner.nextInt();
        MensajesDAO.borrarMensajeDB(id_mensaje);
    }

    public static void editarMensaje() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Actualizar mensajes: ");
        String mensaje = scanner.next();
        System.out.println("Indica el ID del mensaje a actualizar");
        int id_mensaje= scanner.nextInt();
        Mensajes actualizar = new Mensajes();
        actualizar.setMensaje(mensaje);
        actualizar.setId_mensaje(id_mensaje);
        MensajesDAO.actualizarMensajeDB(actualizar);
    }
}
