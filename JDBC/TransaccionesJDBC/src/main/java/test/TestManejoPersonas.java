package test;

import datos.Conexion;
import datos.PersonaJDBC;
import domain.Persona;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestManejoPersonas {
    public static void main(String[] args) {
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }
            PersonaJDBC personaJdbc = new PersonaJDBC(conexion);
            
            Persona cambioPersona = new Persona();
            cambioPersona.setIdPersona(2);
            cambioPersona.setNombre("Nathalia Iveth");
            cambioPersona.setApellido("Pachacama Banda");
            cambioPersona.setEmail("iveth@mail.com");
            cambioPersona.setTelefono("1234567890");
            personaJdbc.actualizar(cambioPersona);
            
            /*Persona nuevaPersona = new Persona();
            nuevaPersona.setNombre("Sandy");
            nuevaPersona.setApellido("Grijalva");
            nuevaPersona.setEmail("mail@mail.com");
            nuevaPersona.setTelefono("0987654321");
            personaJdbc.insertar(nuevaPersona);*/
            
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
