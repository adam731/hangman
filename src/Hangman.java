import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, IOException {

        int lives = 0;

        int difficulty = 0;

        boolean gameOver = false;

        boolean isWinner = false;

        String answer = "";

        ArrayList<String> guesses = new ArrayList<String>();

        String choice = "";

        WordBank wordBank = new WordBank("src/wordlist.txt");


        Scanner input = new Scanner(System.in);


        while (true) {

            TextAssets.drawMainMenu();
            choice = input.nextLine();


            if (choice.equalsIgnoreCase("start") & difficulty == 0) {
                System.out.println("Please choose a difficulty");
            } else if (choice.equalsIgnoreCase("start") & difficulty != 0) {
                Music.playMusic();
                break;
            } else if (choice.equalsIgnoreCase("easy")) {
                difficulty = 1;
                System.out.println("Difficulty set to easy");
                answer = wordBank.getEasyWord();
            } else if (choice.equalsIgnoreCase("medium")) {
                difficulty = 2;
                System.out.println("Difficulty set to medium");
                answer = wordBank.getMediumWord();
            } else if (choice.equalsIgnoreCase("hard")) {
                difficulty = 3;
                System.out.println("Difficulty set to hard");
                answer = wordBank.getHardWord();
            } else if (choice.equalsIgnoreCase("exit")) {
            } else
                System.out.println("Invalid entry try again");
        }


        while (!gameOver) {
            // print out hangman guy
            TextAssets.drawHangman(lives);
            // print blank wordbank
            printGuesses(guesses);
            // ask user if they want to guess a letter or word or quit
            printBlankAnswer(answer, guesses);
            TextAssets.drawGameMenu();
            choice = input.nextLine();
            if (choice.equals("1")) {
                System.out.println("Enter a Letter");
                char letter = input.nextLine().toLowerCase().charAt(0);
                if (answer.contains(String.valueOf(letter))) {
                    System.out.println("Correct Letter");
                    Music.CorrectSoundEffect();
                    guesses.add(String.valueOf(letter));
                    if (guesses.size() == answer.length()) {
                        gameOver = true;
                        isWinner = true;
                    }
                } else {
                    System.out.println("Incorrect letter");
                    lives += 1;
                    Music.WrongSoundEffect();
                    guesses.add(String.valueOf(letter));
                }
            } else if (choice.equals("2")) {
                System.out.println("Guess a word");
                String word = input.next();
                if (answer.equals(word)) {
                    gameOver = true;
                    isWinner = true;
                } else {
                    System.out.println("Word is incorrect");
                    Music.WrongSoundEffect();
                    lives += 1;
                }
            } else if (choice.equals("3")) {
                gameOver = true;
            } else {
                System.out.println("Invalid Entry try again!");
            }
            if (lives == 5) {
                gameOver = true;
                isWinner = false;
            }
        }
        System.out.println("End of game");
        if (isWinner) {
            Music.winningSoundEffect();
            System.out.println("Congrats you beat the game!");
            System.out.println("You guessed the word " + answer);
            System.out.println("Would you like to play again Y/N");
        } else {
            Music.losingSoundEffect();
            System.out.println("Exit program");
            System.out.println("Better Luck next time!");
            System.out.println("The word was " + answer);
            System.out.println("Would you like to play again Y/N");
            //String word = input.next();
        }
    }

    public static void printGuesses (ArrayList<String> guesses) {
        for (int i = 0; i < guesses.size(); i++) {
            System.out.print(guesses.get(i));
        }
        System.out.println();
    }

    public static void printBlankAnswer (String answer, ArrayList<String> guesses) {
        for (int i = 0; i < answer.length(); i++) {
            if (guesses.contains(String.valueOf(answer.charAt(i)))) {
                System.out.print(answer.charAt(i));
            } else {
                System.out.print("_");
            }
        }
        System.out.println();
    }
}
// if the user wants to guess a letter
// if letter in word
// tell user letter is correct
// if user guessed all letters
// set game over to true
// set isWinner to true
// else
// tell user letter is incorrect
// add plus one to lives
// else if user wants to guess a word
// if word is correct
// set game over to true
// set isWinner to true
// else word is incorrect
// tell user word is incorrect
// add plus one to lives
// else if user quits
// set gameOver to true
// else
// print invalid input try again

// if lives run out
// set gameOver true
// set isWinner to false

// print out game ending message
// print out if user won or lose
// print out word
// play again or exit

