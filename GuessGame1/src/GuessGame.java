import java.util.Scanner;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        Scanner in = new Scanner(System.in);

        p1 = new Player();
        p2 = new Player();
        p3 = new Player();


        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Hello it's guess game!");
        System.out.println("I'm guessing a number from 0 to 10");

        while (true) {
            System.out.println("Guess the number ");

            System.out.print("Player one guess number - ");
            int guessp1 = in.nextInt(); // Полученное значение послее ввода
            System.out.print("Player two guess number - ");
            int guessp2 = in.nextInt();
            System.out.print("Player thee guess number - ");
            int guessp3 = in.nextInt();


            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }
            if (p1isRight || p2isRight || p3isRight) {

                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);
                System.out.println("Game is over.");
                break;
            } else {
                System.out.println("Player need try again.");

            }

        }

    }

}
