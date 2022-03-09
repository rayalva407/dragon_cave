package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int playerChoice;

        System.out.println("Welcome To DRAGON CAVE");
        System.out.println("-----------------------");
        System.out.println();
        System.out.println("You are in a land full of dragons. In front of you, you se two caves.");
        System.out.println("In one cave, the dragon is friendly and will share his treasure with you. The other dragon is greedy and hungry and will eat you on sight");
        System.out.println("Which cave will you go into? (1 or 2)");
        Scanner scnr = new Scanner(System.in);
        playerChoice = scnr.nextInt();
        scnr.nextLine();
        if (playerChoice == 1) {
            System.out.println("You approach the cave...");
            System.out.println("It is dark and spooky...");
            System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
            System.out.println("Gobbles you down in one bite!");
        }
        if (playerChoice == 2) {
            System.out.println("You approach the cave...");
            System.out.println("It is dark and spooky...");
            System.out.println("A large dragon out in front of you! He opens his jaws and...");
            System.out.println("The dragon welcomes you into his cave and shows you the way to his hidden treasure! Congratulations the treasure is now yours!");
        }
    }
}
