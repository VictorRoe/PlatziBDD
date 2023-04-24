package org.platzi;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    public Connection get_connection(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "a8582218");
            if (connection != null){
                System.out.println("Conexion exitosa");
            }
        }catch (Exception e){
            System.out.println("Hubo un error al conectar la BDD " + e);
        }

        return connection;
    }
}
