
package ec.com.aekmot.sga.cliente;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


public class ClientePersonaService {
    public static void main(String[] args) {
        System.out.println("iniciando llamada al ejb de clientes\n");
        try{
            Context jndi = new InitialContext();
            
        }catch(NamingException ex){
            ex.printStackTrace(System.out);
        }
    }
}
