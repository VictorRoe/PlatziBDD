package org.platzi;

import org.platzi.Service.mensajeService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        do {
            System.out.println("Aplicacion de mensajes");
            System.out.println("1- Crear un mensaje");
            System.out.println("2- Listar mensaje");
            System.out.println("3- Editar mensaje");
            System.out.println("4- Eliminar mensaje");
            System.out.println("5- Salir de la aplicacion");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    mensajeService.crearMensaje();
                    break;
                case 2:
                    mensajeService.listarMensaje();
                    break;
                case 3:
                    mensajeService.editarMensaje();
                    break;
                case 4:
                    mensajeService.borrarMensaje();
                    break;
                case 5:
                    System.out.println("Cerrando aplicacion");
                    break;
                default:
                    System.out.println("Elija las opciones mostrada en pantalla");
                    break;
            }
        } while (opcion != 5);

    }
}