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

    public static void music(String input) throws LineUnavailableException, UnsupportedAudioFileException, IOException {
        File soundFile = new File("src/music/background.wav");
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
        Clip clip = AudioSystem.getClip();
        clip.open(audioIn);
        clip.start();
        if (clip.isRunning()) {
             clip.stop();
        } else {
            clip.start();
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

