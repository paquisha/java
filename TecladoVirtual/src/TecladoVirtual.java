import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TecladoVirtual extends JFrame {

    private JPanel panel;
    private JTextArea texto;
    private JButton[] teclas;
    private String[] pangramas;
    private int teclaActual;
    private int pulsacionesCorrectas;
    private int pulsacionesIncorrectas;
    private Map<Character, Integer> teclasDificiles;

    public TecladoVirtual() {
        super("Teclado Virtual");

        // Inicializa el panel
        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 10));

        // Inicializa las teclas
        teclas = new JButton[26];
        for (int i = 0; i < teclas.length; i++) {
            teclas[i] = new JButton(Character.toString((char) ('a' + i)));
            panel.add(teclas[i]);
        }

        // Inicializa el texto
        texto = new JTextArea();
        texto.setEditable(false);
        texto.setLineWrap(true);
        panel.add(texto);

        // Agrega eventos a las teclas
        for (JButton tecla : teclas) {
            tecla.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    teclaActual = tecla.getText().charAt(0);
                    texto.append(String.valueOf(teclaActual));
                }
            });
        }

        // Inicializa los pangramas
        pangramas = new String[]{
                "El veloz murciélago hindú comía feliz cardillo y kiwi.",
                "El pingüino Wenceslao hizo kilómetros bajo exhaustiva lluvia y frío, ¡y aún le quedaban quinientas millas!",
                "El que a buen árbol se arrima, buena sombra le cobija.",
                "La cigüeña tocaba cada vez mejor el saxofón y el búho pedía kiwi y queso.",
                "El viejo Señor Gómez pedía queso, kiwi y habas, pero le ha tocado un saxofón.",
                "El jefe exégeta hirvió whisky con nuez para hacer una queimada caribeña.",
                "La jovencita se quedó extasiada al ver al zorro deambular por el jardín.",
                "El águila ágil y rápida caza zarigüeyas.",
                "El juez Jorge querría que el saxofón de Javier fuera más dulce.",
                "El whisky bueno, excita mi frágil pequeña vejez."
        };

        // Inicializa las estadísticas
        teclasDificiles = new HashMap<>();
        pulsacionesCorrectas = 0;
        pulsacionesIncorrectas = 0;

        // Agrega la pantalla principal
        add(panel);
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void mostrarPangrama() {
        // Obtiene un pangrama aleatorio
        int pangramaAleatorio = new Random().nextInt(pangramas.length);

        // Muestra el pangrama en la pantalla
        texto.setText(pangramas[pangramaAleatorio]);
    }

    private void actualizarEstadisticas() {

        // Obtiene la posición de la tecla en el pangrama
        int posicion = pangramas[teclaActual - 'a'].indexOf(teclaActual);

        // Verifica si la tecla está en la posición correcta
        if (posicion == 0) {
            pulsacionesCorrectas++;
        } else {
            pulsacionesIncorrectas++;

            // Agrega la tecla a la lista de teclas difíciles
            if (!teclasDificiles.containsKey(teclaActual)) {
                teclasDificiles.put((char) teclaActual, 1);
            } else {
                teclasDificiles.put((char) teclaActual, teclasDificiles.get(teclaActual) + 1);
            }
        }

        // Muestra las estadísticas en la pantalla
        JOptionPane.showMessageDialog(this, "Pulsaciones correctas: " + pulsacionesCorrectas + "\nPulsaciones incorrectas: " + pulsacionesIncorrectas + "\nPulsaciones totales: " + (pulsacionesCorrectas + pulsacionesIncorrectas));
    }


    public static void main(String[] args) {

        // Crea una nueva instancia de la aplicación
        TecladoVirtual tecladoVirtual = new TecladoVirtual();

        // Repite el ciclo hasta que el usuario cierre la aplicación
        while (tecladoVirtual.isVisible()) {

            // Muestra un pangrama aleatorio
            tecladoVirtual.mostrarPangrama();

            // Espera a que el usuario presione una tecla
            System.out.println("Presione una tecla");
            tecladoVirtual.esperarTecla();

            // Actualiza las estadísticas
            tecladoVirtual.actualizarEstadisticas();
        }
    }

    private char esperarTecla() {

        // Create a volatile boolean flag to signal when a key is pressed
        final boolean[] keyPressed = {false};
        final char[] pressedChar = {' '}; // Variable to store the pressed character

        // Create a KeyListener to capture key events
        KeyListener listener = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                keyPressed[0] = true;
                pressedChar[0] = e.getKeyChar();
            }
        };

        // Add the KeyListener to the virtual keyboard
        this.addKeyListener(listener);

        // Wait until a key is pressed
        while (!keyPressed[0]) {
            try {
                Thread.sleep(100); // Check for key press every 100 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Remove the KeyListener
        this.removeKeyListener(listener);

        // Return the pressed character
        return pressedChar[0];
    }


}