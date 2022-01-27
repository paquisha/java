package proyectoventas;

import Views.Sistema;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.UIManager;

/**
 *
 * @author aekmot
 */
public class ProyectoVentas {
    
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sum.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception ex) {
            System.out.println("error: " + ex.getMessage());
        }
        Sistema sistema = new Sistema();
        sistema.setVisible(true);
        sistema.setExtendedState(MAXIMIZED_BOTH);
        
    }
    
}
