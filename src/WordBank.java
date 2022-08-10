import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class WordBank {

    ArrayList<String> wordListEasy = new ArrayList<>();

    ArrayList<String> wordListMedium = new ArrayList<>();

    ArrayList<String> wordListHard = new ArrayList<>();

    public WordBank(String fileName) {
        try {
            Scanner file = new Scanner(new File(fileName));
            while (file.hasNext()) {
                String word = file.nextLine();
                if (word.length() < 3) {
                    wordListEasy.add(word);
                } else if (word.length() < 5) {
                    wordListMedium.add(word);
                } else {
                    wordListHard.add(word);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String getEasyWord() {
        return wordListEasy.get((int) (Math.random() * wordListEasy.size()));
    }

    public String getMediumWord() {
        return wordListMedium.get((int) (Math.random() * wordListMedium.size()));
    }

    public String getHardWord() {
        return wordListHard.get((int) (Math.random() * wordListHard.size()));
    }
}
