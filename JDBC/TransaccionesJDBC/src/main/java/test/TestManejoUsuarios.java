package test;

import datos.Conexion;
import datos.UsuarioJDBC;
import domain.Usuario;
import java.sql.*;
import java.util.List;

public class TestManejoUsuarios {
    public static void main(String[] args) {
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }
            UsuarioJDBC personaJdbc = new UsuarioJDBC(conexion);
            
            Usuario cambioUsuario = new Usuario();
            cambioUsuario.setIdUsuario(2);
            cambioUsuario.setUsuario("Nathalia");
            cambioUsuario.setPassword("Pachacama");
            personaJdbc.actualizar(cambioUsuario);
            
            Usuario nuevausuario = new Usuario();
            nuevausuario.setUsuario("Sandy");
            nuevausuario.setPassword("Grijalva");
            personaJdbc.insertar(nuevausuario);
            
            conexion.commit();
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("entramos en el rollback");
            try {
                conexion.rollback();
            } catch (SQLException exc) {
                exc.printStackTrace(System.out);
            }
        }        
    }
}
