import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

class Hangman {
    Hangman() {
    }

    public static void main(String[] args) throws LineUnavailableException, UnsupportedAudioFileException, IOException {

        // make a trueLoop variable which is set to true
        boolean trueLoop = true;
        // if user stops the words quit it changes to false
        Scanner input = new Scanner(System.in);
        Drawer.startMenu();

        // if user stops the words quit it changes to false
        // check user input if
        //Drawer.hangmanDraw(5);
        //WordBank.main(args);
        //Music.music(input.nextLine());
        // make a loop that runs until the user guesses the word or runs out of guesses
        //if (input.nextLine().equals("start")) {
        //   Drawer.hangmanDraw(5);
        //  WordBank.main(args);




        //             // if the user wants to guess a letter
        //                  // if letter in word
        //                // if letter in word
        //                    // tell user letter is correct
        //                    // if user guessed all letters
                                if(gu)
        //                        // set game over to true
        //                        // set isWinner to true
        //                // else
        //                    // tell user letter is incorrect
        //                    // add plus one to lives
        //            // else if user wants to guess a word
        //                // if word is correct
        //                    // set game over to true
        //                    // set isWinner to true
        //                // else if word is incorrect
        //                    // tell user word is incorrect
        //                    // add plus one to lives
        //            // else if user quits
        //                // set gameOver to true
        //            // else
        //                // print invalid input try again
        //
        //            // if lives run out
        //                // set gameOver true
        //                // set isWinner to false
        //
        //        }
        //        // print out game ending message
        //        // print out if user won or lose
        //        // print out word
        //        // play again or exit

            if (input.nextLine().equals("start")) {
                Drawer.hangmanDraw(5);
                WordBank.main(args);
                while (trueLoop) {
                    if (input.nextLine().equals("quit")) {
                        trueLoop = false;
                    } else {
                        Drawer.hangmanDraw(5);
                        WordBank.main(args);
                    }
                }
            } else if (input.nextLine().equals("quit")) {
                trueLoop = false;
            } else {
                Drawer.hangmanDraw(5);
                WordBank.main(args);
            }
        }
}
