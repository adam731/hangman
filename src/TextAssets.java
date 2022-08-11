public class TextAssets {

    public static void drawHangman(int lives) {
        if (lives == 0) {
            System.out.println("      _______           ");
            System.out.println("     |/      |          ");
            System.out.println("     |                  ");
            System.out.println("     |                  ");
            System.out.println("     |                  ");
            System.out.println("     |                  ");
            System.out.println("     |                  ");
            System.out.println("     |                  ");
            System.out.println("     |___               ");
        } else if (lives == 1) {
            System.out.println("      _______           ");
            System.out.println("     |/      |          ");
            System.out.println("     |      (_)         ");
            System.out.println("     |                  ");
            System.out.println("     |                  ");
            System.out.println("     |                  ");
            System.out.println("     |                  ");
            System.out.println("     |                  ");
            System.out.println("     |___               ");

        } else if (lives == 2) {
            System.out.println("      _______           ");
            System.out.println("     |/      |          ");
            System.out.println("     |      (_)         ");
            System.out.println("     |      \\|/        ");
            System.out.println("     |                  ");
            System.out.println("     |                  ");
            System.out.println("     |                  ");
            System.out.println("     |                  ");
            System.out.println("     |___               ");
        } else if (lives == 3) {
            System.out.println("      _______           ");
            System.out.println("     |/      |          ");
            System.out.println("     |      (_)         ");
            System.out.println("     |      \\|/        ");
            System.out.println("     |       |          ");
            System.out.println("     |                  ");
            System.out.println("     |                  ");
            System.out.println("     |                  ");
            System.out.println("     |___               ");
        } else if (lives == 4) {
            System.out.println("      _______           ");
            System.out.println("     |/      |          ");
            System.out.println("     |      (_)         ");
            System.out.println("     |      \\|/        ");
            System.out.println("     |       |          ");
            System.out.println("     |       |          ");
            System.out.println("     |                  ");
            System.out.println("     |                  ");
            System.out.println("     |___               ");
        } else if (lives == 5) {
            System.out.println("      _______           ");
            System.out.println("     |/      |          ");
            System.out.println("     |      (_)         ");
            System.out.println("     |      \\|/        ");
            System.out.println("     |       |          ");
            System.out.println("     |       |          ");
            System.out.println("     |      / \\        ");
            System.out.println("     |                  ");
            System.out.println("     |___               ");
        }
    }

    public static void drawMainMenu() {
        System.out.println("Welcome to Adams Hangman Game!");
        System.out.println("Type start to play ");
        System.out.println("Type easy for easy mode ");
        System.out.println("Type medium for medium mode ");
        System.out.println("Type hard for hard mode ");
        System.out.println("Type quit to exit the game ");
    }

    public static void drawGameMenu() {
        System.out.println("1. Guess a Letter");
        System.out.println("2. Guess a Word");
        System.out.println("3. Quit");
    }
}
