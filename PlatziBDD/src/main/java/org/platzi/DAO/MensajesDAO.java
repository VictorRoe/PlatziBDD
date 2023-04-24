package org.platzi.DAO;

import org.platzi.Model.Mensajes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MensajesDAO {

    public static void crearMensajeDB(Mensajes mensaje) {
        Conexion db = new Conexion();
        try {
            Connection connection = db.get_connection();
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO `mensajes` (`mensaje`, `autor_mensaje`, `fecha_mensaje`) VALUES (?,?, CURRENT_TIMESTAMP)";
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
        Conexion db = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Connection connection = db.get_connection();
            final String query = "SELECT * FROM mensajes";
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id_mensaje"));
                System.out.println("MENSAJE: " + rs.getString("mensaje"));
                System.out.println("AUTOR: " + rs.getString("autor_mensaje"));
                System.out.println("FECHA: " + rs.getString("fecha_mensaje"));
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void borrarMensajeDB(int id_mensaje) {
        Conexion db = new Conexion();

        try {
            Connection connection = db.get_connection();
            PreparedStatement ps = null;

            try {
                String query =  "DELETE FROM mensajes WHERE (`id_mensaje` = ?)";
                ps = connection.prepareStatement(query);
                ps.setInt(1, id_mensaje);
                ps.executeUpdate();
                System.out.println("Fue borrado con exito");
            } catch (SQLException e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void actualizarMensajeDB(Mensajes mensajes) {
        Conexion db = new Conexion();

        try {
            Connection  connection = db.get_connection();
            PreparedStatement ps = null;

            try {
                String query = "UPDATE `mensajes` SET `mensaje` = ? WHERE (`id_mensaje` = ?);";
                ps = connection.prepareStatement(query);
                ps.setString(1, mensajes.getMensaje());
                ps.setInt(2,mensajes.getId_mensaje());
                ps.executeUpdate();
                System.out.println("Se actualizo con exito");
            } catch (SQLException e){
                System.out.println(e);
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
