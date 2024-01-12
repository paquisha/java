import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Areas {
    public static void main(String[] args) {
        // Cargar palabras clave y asignarles valores
        Map<String, Integer> phishingKeywords = loadPhishingKeywords();

        // Nombre del archivo a explorar
        String fileName = "C:\\andres\\java\\deberes\\src\\info.txt";  //

        // Contadores para el total de puntos y ocurrencias
        int totalPoints = 0;
        int totalOccurrences = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Verificar cada palabra clave en la línea
                for (String keyword : phishingKeywords.keySet()) {
                    int occurrences = countOccurrences(line, keyword);
                    if (occurrences > 0) {
                        int points = occurrences * phishingKeywords.get(keyword);
                        totalPoints += points;
                        totalOccurrences += occurrences;

                        // Imprimir información sobre la ocurrencia
                        System.out.println(keyword + ": " + occurrences + " concurrencia, " + points + " puntos");
                    }
                }
            }

            // Imprimir el total de puntos para todo el mensaje
            System.out.println("Total Points: " + totalPoints);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Map<String, Integer> loadPhishingKeywords() {
        Map<String, Integer> keywords = new HashMap<>();
        // Cargar las palabras clave desde el archivo
        // Cada línea del archivo debería contener una palabra clave y su valor separados por espacio
        // Ejemplo: phishing 2
        //          password 3
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\andres\\java\\deberes\\src\\phishing_keywords.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 2) {
                    String keyword = parts[0].toLowerCase();
                    int points = Integer.parseInt(parts[1]);
                    keywords.put(keyword, points);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return keywords;
    }

    private static int countOccurrences(String text, String keyword) {
        int count = 0;
        int index = text.toLowerCase().indexOf(keyword.toLowerCase());
        while (index != -1) {
            count++;
            index = text.toLowerCase().indexOf(keyword.toLowerCase(), index + 1);
        }
        return count;
    }
}
