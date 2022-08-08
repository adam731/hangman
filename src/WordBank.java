import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {

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
            System.out.println("Welcome to Adams Hangman Game!");
            System.out.println("1. Type start to play ");
            System.out.println("2. Type easy for easy mode ");
            System.out.println("3. Type medium for hard mode ");
            System.out.println("4. Type hard for hard mode ");
            System.out.println("5. Type quit to quit ");
            choice = input.nextLine();


            if (choice.equals("1")) {
                break;
            } else if (choice.equals("2")) {
                answer = wordBank.getEasyWord();
            } else if (choice.equals("3")) {
                answer = wordBank.getMediumWord();
            } else if (choice.equals("4")) {
                answer = wordBank.getHardWord();
            } else if (choice.equals("5")) {
                // quit the game
            } else
                System.out.println("Invalid entry try again");
        }



        while (!gameOver) {
            // print out hangman guy
            System.out.println("Hanging Man");
            // print blank wordbank
            System.out.println("WordBank");
            // ask user if they want to guess a letter or word or quit
            System.out.println("1. Guess a Letter");
            System.out.println("2. Guess a Word");
            System.out.println("3. Quit");
            choice = input.nextLine();
            if (choice.equals("1")) {
                System.out.println("Enter a Letter");
                char letter = input.nextLine().charAt(0);
                if (answer.contains(String.valueOf(letter))) {
                    System.out.println("Correct Letter");
                    guesses.add(String.valueOf(letter));
                    if () {
                        gameOver = true;
                        isWinner = true;
                    }
                } else {
                    System.out.println("Incorrect letter");
                    lives += 1;
                }
            } else if (choice.equals("2")) {
                System.out.println("Guess a word");
                String word = input.next();
                if (answer.equals(word)) {
                    gameOver = true;
                    isWinner = true;
                } else {
                    System.out.println("Word is incorrect");
                    lives += 1;
                }
            } else if (choice.equals("3")) {
                gameOver = true;
            } else {
                System.out.println("Invalid Entry try again!");
            }
            if (lives == 6) {
                gameOver = true;
                isWinner = false;
            }
        }
        System.out.println("End of game");
        if (isWinner) {
            System.out.println("Congrats you beat the game!");
            System.out.println("You guessed the word " + answer);
            System.out.println("Would you like to play again Y/N");
        } else {
            System.out.println("Exit program");
            System.out.println("Better Luck next time!");
            System.out.println("The word was" + answer);
            System.out.println("Would you like to play again Y/N");
            String word = input.next();
        }
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

