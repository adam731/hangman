import javax.sound.sampled.*;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Objects;

public class Music {


    private final URL CORRECT_MUSIC_PATH = this.getClass().getResource("/assets/correct.wav");
    private final URL WRONG_SOUND_PATH = this.getClass().getResource("/assets/wrongSound.wav");
    private final URL WINNING_SOUND_PATH = this.getClass().getResource("/assets/winning.wav");
    private final URL LOSING_SOUND_PATH = this.getClass().getResource("/assets/failsound.wav");


    public Music () {
        try {
            InputStream BKGD_MUSIC_PATH = new BufferedInputStream(Objects.requireNonNull(this.getClass().getResourceAsStream("/assets/background.wav")));
            AudioInputStream audioBkgd = AudioSystem.getAudioInputStream(BKGD_MUSIC_PATH);
            Clip backgroundClip = AudioSystem.getClip();
            backgroundClip.open(audioBkgd);
            backgroundClip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
            System.out.println("Error playing background music");
        }
    }


    public void playSoundEffect(int effect) {
        try {
            AudioInputStream audioInputStream = null;

            if (effect == 1) {
                assert CORRECT_MUSIC_PATH != null;
                audioInputStream = AudioSystem.getAudioInputStream(new BufferedInputStream(CORRECT_MUSIC_PATH.openStream()));
            }
            if (effect == 2) {
                assert WRONG_SOUND_PATH != null;
                audioInputStream = AudioSystem.getAudioInputStream(new BufferedInputStream(WRONG_SOUND_PATH.openStream()));
            }
            if (effect == 3) {
                assert WINNING_SOUND_PATH != null;
                audioInputStream = AudioSystem.getAudioInputStream(new BufferedInputStream(WINNING_SOUND_PATH.openStream()));
            }
            if (effect == 4) {
                assert LOSING_SOUND_PATH != null;
                audioInputStream = AudioSystem.getAudioInputStream(new BufferedInputStream(LOSING_SOUND_PATH.openStream()));
            }
            Clip soundEffectClip = AudioSystem.getClip();
            soundEffectClip.open(audioInputStream);
            soundEffectClip.start();
        } catch (Exception e) {
            System.out.println("Error playing sound effect");
        }
    }



}
