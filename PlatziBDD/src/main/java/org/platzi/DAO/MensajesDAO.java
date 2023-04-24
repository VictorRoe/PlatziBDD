package org.platzi.DAO;

import org.platzi.Model.Mensajes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MensajesDAO {

    public static void crearMensajeDB(Mensajes mensaje) {
        Conexion db = new Conexion();
        try {
            Connection connection = db.get_connection();
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO `mensajes` (`mensaje`, `autor_mensaje`) VALUES (?,?)";
                ps = connection.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutor_mensaje());
                ps.executeUpdate();
                System.out.println("Mensaje creado");
            } catch (SQLException e) {
                System.out.println(e);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void leerMensajeDB() {

    }

    public static void borrarMensajeDB(int id_mensaje) {

    }

    public static void actualizarMensajeDB(Mensajes mensajes) {

    }
}
