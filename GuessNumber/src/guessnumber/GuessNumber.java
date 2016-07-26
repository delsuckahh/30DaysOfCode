package guessnumber;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    
    int theNumber;
    int max;
    Scanner scanner = new Scanner(System.in);
    
    public GuessNumber() {
        Random rand = new Random();
        max = 100;
        theNumber = Math.abs(rand.nextInt()) % (max +1);   
    }
    
    public void play() {
        while(true) {
            int move = scanner.nextInt();
            if (move > theNumber) {
                System.out.println("Your number is too big");
            } else if (move < theNumber) {
                System.out.println("Your number is too small");
            } else {
                System.out.println("You got it!!!!");
                break;
            }
        }
    }
    
    public static void howBigIsNumber(int x) {
        if (x >= 0 && x <= 10) {
            System.out.println("our number is prety small");
        } else if (x >= 11 && x <= 100) {
            System.out.println("our number is pretty big");
        } else {
            System.out.println("number is out of range");
        }
    } 
    
    public static void main(String[] args) {
        GuessNumber guessGame = new GuessNumber();
        System.out.println("Welcome to my game!  Try to guess my impossible number.  It's between 0 and 100...");
        guessGame.play();
        
    }
    
}
