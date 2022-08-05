import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

class Hangman {
    Hangman() {
    }
    public static void main(String[] args) throws LineUnavailableException, UnsupportedAudioFileException, IOException {
        Drawer.hangmanDraw(5);
        Drawer.hangmanDraw(4);
        Drawer.hangmanDraw(3);
        Drawer.hangmanDraw(2);
        Drawer.hangmanDraw(1);
        Drawer.hangmanDraw(0);
        WordBank.main(args);
        Music.main(args);
    }
}
