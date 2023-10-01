/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomnumbergenerator;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 35389
 */
public class RandomNumberGenerator {

    /**
     * @param args the command line arguments
     */
   //The maximum number of guesses for the user.
   private static final int MAX_ATTEMPTS = 10;
   public static void main(String[] args) {
       //Create a random number between 0 and 99.
        Random r = new Random();
        int number = r.nextInt(100);
        //Create a scanner object to read user input.
        Scanner scanner = new Scanner(System.in);
        //Create an ArrayList to store the user Guesses.
        ArrayList<Integer> guesses = new ArrayList<Integer>();
        //Print the initial prompt.
        System.out.println("Guess the number between 0 and 99 (inclusive). You have 10 Attempts.");
        // For loop to the maximum numbers of attempts.
        for (int i = 0; i < MAX_ATTEMPTS; i++) {
        //Promt the user of their guesss.
        System.out.print("Your Try Number #" + (i+1) + ": ");
        int guess = scanner.nextInt();
            //Check if the user has alreeady guessed this number.
            if (guesses.contains(guess)) {
                //If guessed same print message and skip the rest loop.
                
            }
            //Add guess to  the list of guesses.
            guesses.add(guess);
            //Check if the guess is correct.
            if (guess == number) {
                //If correct print message and exit program.
                System.out.println("You win! ");
                return;
            } else if (guess < number) {
                // if guess is low print a messsage.
                System.out.println("Too low.");
            } else {
                //If a guess is high print a message
                System.out.println("What are you doing");
                
            }
        }
        //If the user cannot guess print the message.
        System.out.println("Hard luck! ");
    }
}