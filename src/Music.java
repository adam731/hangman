import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Music {


    private final String BKGD_MUSIC_PATH = "./src/assets/background.wav";
    private final String CORRECT_MUSIC_PATH = "./src/assets/correct.wav";
    private final String FAIL_SOUND_MUSIC_PATH = "./src/assets/wrongSound.wav";
    private final String WIN_MUSIC_PATH = "./src/assets/winning.wav";
    private final String LOSE_MUSIC_PATH = "./src/assets/failSound.wav";

    private Clip backgroundClip;
    private Clip soundEffectClip;
    private AudioInputStream audioBkgd;
    private AudioInputStream audioCorrect;
    private AudioInputStream audioFail;
    private AudioInputStream audioWin;
    private AudioInputStream audioLose;

    public Music () {
        try {
            audioWin = AudioSystem.getAudioInputStream(new File(WIN_MUSIC_PATH));
            audioLose = AudioSystem.getAudioInputStream(new File(LOSE_MUSIC_PATH));
            audioBkgd = AudioSystem.getAudioInputStream(new File(BKGD_MUSIC_PATH));
            audioCorrect = AudioSystem.getAudioInputStream(new File(CORRECT_MUSIC_PATH));
            audioFail = AudioSystem.getAudioInputStream(new File(FAIL_SOUND_MUSIC_PATH));
            backgroundClip = AudioSystem.getClip();
            backgroundClip.open(audioBkgd);
            backgroundClip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
            System.out.println("Error playing background music");
        }
    }


    public void CorrectSoundEffect() {
        try {
            audioCorrect = AudioSystem.getAudioInputStream(new File(CORRECT_MUSIC_PATH));
            soundEffectClip = AudioSystem.getClip();
            soundEffectClip.open(audioCorrect);
            soundEffectClip.start();
        } catch (Exception e) {
            System.out.println("Error playing sound effect");
        }
    }

    public void WrongSoundEffect () {
        try {
            audioFail = AudioSystem.getAudioInputStream(new File(FAIL_SOUND_MUSIC_PATH));
            soundEffectClip = AudioSystem.getClip();
            soundEffectClip.open(audioFail);
            soundEffectClip.start();
        } catch (Exception e) {
            System.out.println("Error playing sound effect");
        }
    }

    public void losingSoundEffect() {
        try {
            audioLose = AudioSystem.getAudioInputStream(new File(LOSE_MUSIC_PATH));
            soundEffectClip = AudioSystem.getClip();
            soundEffectClip.open(audioLose);
            soundEffectClip.start();
        } catch (Exception e) {
            System.out.println("Error playing sound effect");
        }
    }

    public void winningSoundEffect() {
        try {
            audioWin = AudioSystem.getAudioInputStream(new File(WIN_MUSIC_PATH));
            Clip soundEffectClip = AudioSystem.getClip();
            soundEffectClip.open(audioWin);
            soundEffectClip.start();
        } catch (Exception e) {
            System.out.println("Error playing sound effect");
        }
    }

}
