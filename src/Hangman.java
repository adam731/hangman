import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

class Hangman {
    Hangman() {
    }

    public static void main(String[] args) throws LineUnavailableException, UnsupportedAudioFileException, IOException {
        // scanner for user input music class and start/stop music
        Scanner StartStop = new Scanner(System.in);
        Drawer.hangmanDraw(5);
        WordBank.main(args);
        Music.music(StartStop.nextLine());
        // running the program
        while(true) {
        }
    }
}
