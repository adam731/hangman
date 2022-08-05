public class Drawer {
    public Drawer() {
    }

    public static void hangmanDraw(int lives) {
        if (lives == 5) {
            System.out.println("      _______           ");
            System.out.println("     |/      |          ");
            System.out.println("     |                  ");
            System.out.println("     |                  ");
            System.out.println("     |                  ");
            System.out.println("     |                  ");
            System.out.println("     |                  ");
            System.out.println("     |                  ");
            System.out.println("     |___               ");
        } else if (lives == 4) {
            System.out.println("      _______           ");
            System.out.println("     |/      |          ");
            System.out.println("     |      (_)         ");
            System.out.println("     |                  ");
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
            System.out.println("     |       |          ");
            System.out.println("     |                  ");
            System.out.println("     |                  ");
            System.out.println("     |                  ");
            System.out.println("     |___               ");
        } else if (lives == 1) {
            System.out.println("      _______           ");
            System.out.println("     |/      |          ");
            System.out.println("     |      (_)         ");
            System.out.println("     |      \\|/        ");
            System.out.println("     |       |          ");
            System.out.println("     |       |          ");
            System.out.println("     |                  ");
            System.out.println("     |                  ");
            System.out.println("     |___               ");
        } else if (lives == 0) {
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
}
