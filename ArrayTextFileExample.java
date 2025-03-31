import java.io.*;
import java.util.*;

public class ArrayTextFileExample {
    public static void main(String[] args) {
        String[] words = {"Hello", "World", "Java"};

        // Save array to text file
        try (PrintWriter writer = new PrintWriter(new FileWriter("array.txt"))) {
            for (String word : words) {
                writer.println(word);
            }
            System.out.println("Array saved to text file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read array from text file
        try (BufferedReader reader = new BufferedReader(new FileReader("array.txt"))) {
            List<String> wordList = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                wordList.add(line);
            }
            String[] loadedWords = wordList.toArray(new String[0]);

            System.out.println("Array loaded: " + Arrays.toString(loadedWords));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

