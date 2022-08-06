import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Music {
    public Music() {
    }

    public static void music(Scanner StartStop) throws LineUnavailableException, UnsupportedAudioFileException, IOException {
        File soundFile = new File("src/music/background.wav");
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
        Clip clip = AudioSystem.getClip();
        clip.open(audioIn);
        clip.start();
        while (StartStop.hasNext()) {
            String command = StartStop.next();
            if (command.equals("music")) {
                if (clip.isRunning()) {
                    clip.stop();
                    System.out.println("Type 'music' to start the music.");
                } else {
                    System.out.println("Type 'music' to pause the music.");
                    clip.start();
                }
            }
        }
    }

    public static void soundEffect () throws LineUnavailableException, IOException, UnsupportedAudioFileException {
            File soundFile = new File("src/music/soundEffect.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
    }

}

