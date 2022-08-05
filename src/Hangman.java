import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

class Hangman {
    Hangman() {
    }
    public static void main(String[] args) throws LineUnavailableException, UnsupportedAudioFileException, IOException {
        WordBank.main(args);
        Music.main(args);
    }
}
