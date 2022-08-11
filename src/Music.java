import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Music {
    public Music() {
    }

    public static void playMusic() throws LineUnavailableException, UnsupportedAudioFileException, IOException {
        File soundFile = new File("src/music/background.wav");
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
        Clip clip = AudioSystem.getClip();
        clip.open(audioIn);
        clip.start();
    }

    public static void CorrectSoundEffect() throws LineUnavailableException, IOException, UnsupportedAudioFileException {
        File soundFile = new File("src/music/correct.wav");
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
        Clip clip = AudioSystem.getClip();
        clip.open(audioIn);
        clip.start();
    }
    public static void WrongSoundEffect () throws LineUnavailableException, IOException, UnsupportedAudioFileException {
        File soundFile = new File("src/music/wrongSound.wav");
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
        Clip clip = AudioSystem.getClip();
        clip.open(audioIn);
        clip.start();
    }

    public static void losingSoundEffect() throws LineUnavailableException, UnsupportedAudioFileException, IOException {
        File soundFile = new File("src/music/failsound.wav");
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
        Clip clip = AudioSystem.getClip();
        clip.open(audioIn);
        clip.stop();
    }

    public static void winningSoundEffect() throws LineUnavailableException, UnsupportedAudioFileException, IOException {
        File soundFile = new File("src/music/winning.wav");
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
        Clip clip = AudioSystem.getClip();
        clip.open(audioIn);
        clip.stop();
    }

}
