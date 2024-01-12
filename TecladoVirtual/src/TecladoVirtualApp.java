import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class TecladoVirtualApp extends JFrame implements ActionListener {
    private JTextArea textArea;
    private JLabel pangramaLabel;
    private int correctas, incorrectas;
    private Set<String> teclasIncorrectas;
    private String[] pangramas;
    private Random random;

    public TecladoVirtualApp() {
        super("Teclado Virtual App");

        // Pangramas disponibles
        pangramas = new String[]{
                "El veloz murcielago hindú comia feliz cardillo y kiwi.",
                "El pingüino Wenceslao hizo kilometros bajo exhaustiva lluvia y frío, ¡y aún le quedaban quinientas millas!",
                "El que a buen árbol se arrima, buena sombra le cobija.",
                "La cigüeña tocaba cada vez mejor el saxofón y el buho pedía kiwi y queso.",
                "El viejo Señor Gómez pedía queso, kiwi y habas, pero le ha tocado un saxofon.",
                "El jefe exégeta hirvió whisky con nuez para hacer una queimada caribeña.",
                "La jovencita se quedó extasiada al ver al zorro deambular por el jardín.",
                "El águila ágil y rápida caza zarigüeyas.",
                "El juez Jorge querría que el saxofón de Javier fuera más dulce.",
                "El whisky bueno, excita mi frágil pequeña vejez.",
                "El viejo zorro saltó sobre el rápido esquivo guepardo.",
                "El arzobispo quiso que el quiosco vendiera whisky.",
                "El quechua, quechua, quechua, quechua.",
                "El quiosco vende whisky, queso y kiwi.",
                "José compró una vieja zampoña en Perú.",
                "El cadáver de Wamba, rey godo de España, fue exhumado y trasladado en una caja de zinc que pesó un kilo."
        };

        random = new Random();
        teclasIncorrectas = new HashSet<>();

        // Componentes GUI
        textArea = new JTextArea(5, 30);
        textArea.setEditable(true);
        JScrollPane scrollPane = new JScrollPane(textArea);
        pangramaLabel = new JLabel();

        // Crear teclado virtual
        JPanel tecladoPanel = new JPanel(new GridLayout(4, 10));
        String[] teclas = {"Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P",
                "A", "S", "D", "F", "G", "H", "J", "K", "L", "Ñ",
                "Z", "X", "C", "V", "B", "N", "M", ",", ".", "-"};

        for (String tecla : teclas) {
            JButton button = new JButton(tecla);
            button.addActionListener(this);
            tecladoPanel.add(button);
        }

        // Botón de estadísticas
        JButton estadisticasButton = new JButton("Mostrar Estadísticas");
        estadisticasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarEstadisticas();
            }
        });

        // Configurar el diseño de la interfaz
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.NORTH);
        add(tecladoPanel, BorderLayout.CENTER);
        add(pangramaLabel, BorderLayout.SOUTH);
        add(estadisticasButton, BorderLayout.EAST);

        // Configuración de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        // Mostrar el primer pangrama
        mostrarPangramaAleatorio();
    }

    private void mostrarPangramaAleatorio() {
        int index = random.nextInt(pangramas.length);
        pangramaLabel.setText(pangramas[index]);
    }

    private void mostrarEstadisticas() {
        StringBuilder informe = new StringBuilder("Informe de estadísticas:\n");
        informe.append("Teclas correctas: ").append(correctas).append("\n");
        informe.append("Teclas incorrectas: ").append(incorrectas).append("\n");
        informe.append("Teclas incorrectas detalladas: ").append(teclasIncorrectas.toString()).append("\n");

        JOptionPane.showMessageDialog(this, informe.toString(), "Estadísticas", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        String teclaPresionada = source.getText();

        // Actualizar la GUI y la precisión del usuario
        if (pangramaLabel.getText().contains(teclaPresionada)) {
            correctas++;
        } else {
            incorrectas++;
            teclasIncorrectas.add(teclaPresionada);
        }

        // Actualizar el JTextArea
        textArea.append(teclaPresionada);

        // Mostrar otro pangrama aleatorio
        mostrarPangramaAleatorio();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TecladoVirtualApp::new);
    }
}