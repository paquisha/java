import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PhishingCheck {

    private static final String KEYWORDS_FILE = "C:\\andres\\java\\deberes\\src\\phishing.txt";
    private static final String MESSAGE_FILE = "C:\\andres\\java\\deberes\\src\\informacion.txt";

    public static void main(String[] args) {
        Map<String, Integer> phishingKeywords = loadPhishingKeywords();
        String fileName = MESSAGE_FILE;

        int totalPoints = 0;
        int totalOccurrences = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                processLine(phishingKeywords, line, totalPoints, totalOccurrences);
            }

            System.out.println("Total Points: " + totalPoints);
        } catch (IOException e) {
            handleIOException(e);
        }
    }

    private static void processLine(Map<String, Integer> phishingKeywords, String line, int totalPoints, int totalOccurrences) {
        for (String keyword : phishingKeywords.keySet()) {
            int occurrences = countOccurrences(line, keyword);
            if (occurrences > 0) {
                int points = occurrences * phishingKeywords.get(keyword);
                totalPoints += points;
                totalOccurrences += occurrences;
                printOccurrenceInfo(keyword, occurrences, points);
            }
        }
    }

    private static Map<String, Integer> loadPhishingKeywords() {
        Map<String, Integer> keywords = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(KEYWORDS_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                processKeywordLine(keywords, line);
            }
        } catch (IOException e) {
            handleIOException(e);
        }

        return keywords;
    }

    private static void printOccurrenceInfo(String keyword, int occurrences, int points) {
        System.out.printf("%s: %d occurrences, %d points%n", keyword, occurrences, points);
    }

    private static void handleIOException(IOException e) {
        e.printStackTrace();
    }

    private static void processKeywordLine(Map<String, Integer> keywords, String line) {
        String[] parts = line.split(" ");
        if (parts.length == 2) {
            String keyword = parts[0].toLowerCase();
            int points = Integer.parseInt(parts[1]);
            keywords.put(keyword, points);
        }
    }

    private static int countOccurrences(String text, String keyword) {
        text = text.toLowerCase();
        keyword = keyword.toLowerCase();
        int count = 0;
        int index = text.indexOf(keyword);
        while (index != -1) {
            count++;
            index = text.indexOf(keyword, index + 1);
        }
        return count;
    }
}