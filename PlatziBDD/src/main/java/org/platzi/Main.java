package org.platzi;

public class Main {
    public static void main(String[] args) {
    Conexion conexion = new Conexion();

    try {
        conexion.get_connection();
    }catch (Exception e){
        System.out.println("No se pudo conectar la BDD en la main " + e);
    }
    }
}