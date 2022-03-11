package project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int playerChoice = 0;
        Scanner scnr = new Scanner(System.in);
        boolean playing = true;

        System.out.println("Welcome To DRAGON CAVE");
        System.out.println("-----------------------");
        System.out.println();

        while (playing) {
            System.out.println("You are in a land full of dragons. In front of you, you see two caves.");
            System.out.println("In one cave, the dragon is friendly and will share his treasure with you.");
            System.out.println("The other dragon is greedy and hungry and will eat you on sight");
            System.out.println("Which cave will you go into? (1 or 2)");

            try {
                playerChoice = scnr.nextInt();
                scnr.nextLine();
            }
            catch(InputMismatchException a) {
                System.out.println("WRONG INPUT! Please select 1 or 2");
                System.out.println();
                scnr.next();
            }

            if (playerChoice == 1) {
                System.out.println("You approach the cave...");
                System.out.println("It is dark and spooky...");
                System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
                System.out.println("Gobbles you down in one bite!");
                System.out.println();
                playing = false;
            }
            if (playerChoice == 2) {
                System.out.println("You approach the cave...");
                System.out.println("It is dark and spooky...");
                System.out.println("A large dragon out in front of you! He opens his jaws and...");
                System.out.println("The dragon welcomes you into his cave and shows you the way to his hidden treasure!");
                System.out.println("Congratulations the treasure is now yours!");
                playing = false;
            }
        }
    }
}
