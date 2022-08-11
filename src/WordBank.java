import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class WordBank {

    private ArrayList<String> wordListEasy;

    private ArrayList<String> wordListMedium;

    private ArrayList<String> wordListHard;

    public WordBank(String fileName) {
        wordListEasy = new ArrayList<>();
        wordListMedium = new ArrayList<>();
        wordListHard = new ArrayList<>();
        try {
            Scanner file = new Scanner(new File(fileName));
            while (file.hasNext()) {
                String word = file.nextLine();
                if (word.length() <= 3) {
                    wordListHard.add(word);
                } else if (word.length() <= 6) {
                    wordListMedium.add(word);
                } else {
                    wordListEasy.add(word);
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
