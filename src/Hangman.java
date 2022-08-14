import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {

        final String WORD_LIST_FINAL = "./src/assets/wordlist.txt";

        Music music = new Music();
        WordBank wordBank = new WordBank(WORD_LIST_FINAL);
        Scanner input = new Scanner(System.in);
        boolean playing = true;

        int lives;
        int difficulty;
        boolean gameOver;
        boolean isWinner;
        String answer;
        ArrayList<String> guesses;
        String choice;

        while(playing) {

            lives = 0;
            difficulty = 0;
            gameOver = false;
            isWinner = false;
            answer = "";
            guesses = new ArrayList<>();

            while (true) {

                TextAssets.drawMainMenu();
                choice = input.nextLine();


                if (choice.equalsIgnoreCase("start") & difficulty == 0) {
                    System.out.println("Please choose a difficulty");
                } else if (choice.equalsIgnoreCase("start") & difficulty != 0) {
                    break;
                } else if (choice.equalsIgnoreCase("easy")) {
                    difficulty = 1;
                    System.out.println("Difficulty set to easy");
                } else if (choice.equalsIgnoreCase("medium")) {
                    difficulty = 2;
                    System.out.println("Difficulty set to medium");
                } else if (choice.equalsIgnoreCase("hard")) {
                    difficulty = 3;
                    System.out.println("Difficulty set to hard");
                } else if (choice.equalsIgnoreCase("quit")) {
                    System.out.println("Goodbye");
                    playing = false;
                    gameOver = true;
                    answer = "";
                    difficulty = 0;
                    break;
                } else
                    System.out.println("Invalid entry try again");
            }

            if (difficulty == 1) {
                if (wordBank.getEasyLength() == 0)
                    wordBank.refillEasy(WORD_LIST_FINAL);
                answer = wordBank.getEasyWord();
            } else if (difficulty == 2) {
                if (wordBank.getMediumLength() == 0)
                    wordBank.refillMedium(WORD_LIST_FINAL);
                answer = wordBank.getMediumWord();
            } else if (difficulty == 3) {
                if (wordBank.getHardLength() == 0)
                    wordBank.refillHard(WORD_LIST_FINAL);
                answer = wordBank.getHardWord();
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
                switch (choice) {
                    case "1" -> {
                        System.out.println("Enter a Letter");
                        char letter = input.nextLine().toLowerCase().charAt(0);
                        while (!(letter >= 'a' && letter <= 'z')) {
                            System.out.println("Enter a valid letter");
                            letter = input.nextLine().toLowerCase().charAt(0);
                        }
                        if (guesses.contains(String.valueOf(letter))) {
                            System.out.println("Letter already guessed try again");
                            guesses.remove(String.valueOf(letter));
                        }
                        if (answer.contains(String.valueOf(letter))) {
                            System.out.println("Correct Letter");
                            music.CorrectSoundEffect();
                            guesses.add(String.valueOf(letter));
                            if (guesses.size() == answer.length()) {
                                gameOver = true;
                                isWinner = true;
                            }
                        } else {
                            System.out.println("Incorrect letter");
                            lives += 1;
                            music.WrongSoundEffect();
                            guesses.add(String.valueOf(letter));
                        }
                    }
                    case "2" -> {
                        System.out.println("Guess a word");
                        String word = input.nextLine();
                        if (answer.equals(word)) {
                            gameOver = true;
                            isWinner = true;
                        } else {
                            System.out.println("Word is incorrect");
                            music.WrongSoundEffect();
                            lives += 1;
                        }
                    }
                    case "3" -> gameOver = true;
                    default -> System.out.println("Invalid Entry try again!");
                }
                    if (lives == 5) {
                        TextAssets.drawHangman(lives);
                        gameOver = true;
                    }
                }
                if (isWinner & answer.length() > 1) {
                    music.winningSoundEffect();
                    System.out.println("Congrats you beat the game!");
                    System.out.println("You guessed the word " + answer);
                } else if (!isWinner & answer.length() > 1) {
                    music.losingSoundEffect();
                    System.out.println("Exit program");
                    System.out.println("Better Luck next time!");
                    System.out.println("The word was " + answer);
                }
                System.out.println("Would you like to play again Y/N");
                char word = input.nextLine().toLowerCase().charAt(0);
                if (word == 'y') {
                    System.out.println("Starting new game");
                } else {
                    System.out.println("Exiting program");
                    playing = false;
                }
        }
    }


    public static void printGuesses (ArrayList<String> guesses) {
        for (String guess : guesses) {
            System.out.print("[" + guess + "]");
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
