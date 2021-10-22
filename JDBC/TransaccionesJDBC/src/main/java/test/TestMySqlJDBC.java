package test;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestMySqlJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrival=true";
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");//por si acaso
            Connection conexion = DriverManager.getConnection(url, "root", "Chamber4aime");
            Statement instruccion = conexion.createStatement();
            String sql = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
            ResultSet resultado= instruccion.executeQuery(sql);
            while(resultado.next()){
                System.out.print("Id persona: " + resultado.getInt("id_persona"));
                System.out.print(" Nombre: " + resultado.getString("nombre"));
                System.out.print(" Apellido: " + resultado.getString("apellido"));
                System.out.print(" Email: " + resultado.getString("email"));
                System.out.print(" Telefono: " + resultado.getString("telefono"));
                System.out.println("");
            }
            resultado.close();
            instruccion.close();
            conexion.close();
        /*} catch (ClassNotFoundException ex) {
            //Logger.getLogger(TestMySqlJDBC.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace(System.out);*/ //aqui por si acaso la primera sentencia
        } catch (SQLException ex) {
            Logger.getLogger(TestMySqlJDBC.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace(System.out);
        }
    }
}
