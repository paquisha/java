package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.List;

public class TestManejoUsuarios {
    public static void main(String[] args) {
        UsuarioDAO usuarioDao = new UsuarioDAO();
        
        //insertar usuarios
        /*Usuario usuarioNuevo = new Usuario("sandyG", "vagina");
        usuarioDao.insertar(usuarioNuevo);*/
        
        //modificar un registro
        /*Usuario usuarioModificado = new Usuario(3, "Aime", "Chamber4aime");
        usuarioDao.actualizar(usuarioModificado);*/
        
        //borrar un usuario
        Usuario borrarUsuario = new Usuario(3);
        usuarioDao.borrar(borrarUsuario);
        
        //listar usuarios
        List<Usuario> usuarios = usuarioDao.seleccionar();        
        usuarios.forEach(usuario ->{
            System.out.println("usuarios: " + usuario);
        });
        
    }
    
}
