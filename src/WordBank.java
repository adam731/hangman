import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class WordBank {

    private final ArrayList<String> wordListEasy;

    private final ArrayList<String> wordListMedium;

    private final ArrayList<String> wordListHard;


    private final InputStream WORD_BANK_INPUT_STREAM = getClass().getResourceAsStream("/assets/wordlist.txt");

    public WordBank() {
        wordListEasy = new ArrayList<>();
        wordListMedium = new ArrayList<>();
        wordListHard = new ArrayList<>();
        initSetup();

    }

    public void initSetup() {
        assert WORD_BANK_INPUT_STREAM != null;
        Scanner file = new Scanner(WORD_BANK_INPUT_STREAM);
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
    }

    public void refillEasy() {
        assert WORD_BANK_INPUT_STREAM != null;
        Scanner file = new Scanner(WORD_BANK_INPUT_STREAM);
        while (file.hasNext()) {
            String word = file.nextLine();
            if (word.length() <= 7) {
                wordListEasy.add(word);
            }
        }
    }

    public void refillMedium() {
        assert WORD_BANK_INPUT_STREAM != null;
        Scanner file = new Scanner(WORD_BANK_INPUT_STREAM);
        while (file.hasNext()) {
            String word = file.nextLine();
            if (word.length() >= 4 && word.length() <= 6) {
                wordListMedium.add(word);
            }
        }
    }

    public void refillHard() {
        assert WORD_BANK_INPUT_STREAM != null;
        Scanner file = new Scanner(WORD_BANK_INPUT_STREAM);
        while (file.hasNext()) {
            String word = file.nextLine();
            if (word.length() <= 3) {
                wordListHard.add(word);
            }
        }
    }


    public int getEasyLength () {
        return wordListEasy.size();
    }

    public int getMediumLength () {
        return wordListMedium.size();
    }

    public int getHardLength () {
        return wordListHard.size();
    }


    public String getEasyWord() {
        int random = (int) (Math.random() * wordListEasy.size());
        String word = wordListEasy.get(random);
        wordListEasy.remove(random);
        return word;
    }

    public String getMediumWord() {
        int random = (int) (Math.random() * wordListMedium.size());
        String word = wordListMedium.get(random);
        wordListMedium.remove(random);
        return word;
    }

    public String getHardWord() {
        int random = (int) (Math.random() * wordListHard.size());
        String word = wordListHard.get(random);
        wordListHard.remove(random);
        return word;
    }
}
