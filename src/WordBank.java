import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class WordBank {
    public static void main(String[] args) {
        // make a method called getwordlist that returns a list of words
        String fileName = "src/wordlist.txt";
        String[] words = new String[50];
        int wordCount = 0;
        try {
            Scanner input = new Scanner(new File(fileName));
            while (input.hasNext()) {
                words[wordCount] = input.nextLine();
                wordCount++;
            }
        } catch (IOException e) {
            System.out.println("File not found.");
        }
        // make an array called easy words that contains only the easy words
        String[] easyWords = new String[50];
        // go through the words array and if the word is under 5 letters, add it to the easy words array
        int easyWordCount = 0;
        for (int i = 0; i < wordCount; i++) {
            if (words[i].length() < 5) {
                easyWords[easyWordCount] = words[i];
                easyWordCount++;
            }
        }
        // pick a random word from the easy words array
        int randomWord = (int) (Math.random() * easyWordCount);
        String word = easyWords[randomWord];
        System.out.println(word);

    }
}
