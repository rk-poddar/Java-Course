package Projects._01_GuesserGame_2;

import java.util.Scanner;

class PlayGame{
    public void Display(){
        
        Scanner scanner = new Scanner(System.in);
        
        // Generate a random number between 1 and 10
        int secretNumber = (int) (Math.random() * 10) + 1;
        
        // Initialize player scores to zero
        int player1Score = 0;
        int player2Score = 0;
        int player3Score = 0;
        
        // Game Play rounds
        System.out.print("Enter the number of Round's you want to play: ");
        int num = scanner.nextInt();
        
        System.out.println("Guess the number between 0 to 9: ");
        
        for (int round = 1; round <= num; round++) {
            System.out.println("Round " + round + ":");
            
            // Player 1's turn
            System.out.print("Player 1, enter your guess: ");
            int player1Guess = scanner.nextInt();
            if (player1Guess == secretNumber) {
                System.out.println("Player 1 guessed correctly!");
                player1Score++;
            } else {
                System.out.println("Player 1 guessed wrong.");
            }
            
            // Player 2's turn
            System.out.print("Player 2, enter your guess: ");
            int player2Guess = scanner.nextInt();
            if (player2Guess == secretNumber) {
                System.out.println("Player 2 guessed correctly!");
                player2Score++;
            } else {
                System.out.println("Player 2 guessed wrong.");
            }
            
            // Player 3's turn
            System.out.print("Player 3, enter your guess: ");
            int player3Guess = scanner.nextInt();
            if (player3Guess == secretNumber) {
                System.out.println("Player 3 guessed correctly!");
                player3Score++;
            } else {
                System.out.println("Player 3 guessed wrong.");
            }
            
            System.out.println("The secret number was " + secretNumber);
            System.out.println("Player 1 score: " + player1Score);
            System.out.println("Player 2 score: " + player2Score);
            System.out.println("Player 3 score: " + player3Score);
        }
        
        // Determine the winner
        if(player1Score==player2Score){
            if(player2Score==player3Score){
                System.out.println("It's a tie!");
            }
            else if(player1Score<player3Score && player2Score<player3Score){
                System.out.println("Player 3 wins!");
            }
            else{
                System.out.println("Player 1 and Player 2 wins!");
            }
        }
        else if(player2Score==player3Score){
            if(player2Score==player1Score){
                System.out.println("It's a tie!");
            }
            else if(player2Score<player1Score && player3Score<player1Score){
                System.out.println("Player 1 wins!");
            }
            else{
                System.out.println("Player 2 and Player 3 wins!");
            }
        }
        else if(player3Score==player1Score){
            if(player3Score==player2Score){
                System.out.println("It's a tie!");
            }
            else if(player3Score<player2Score && player1Score<player2Score){
                System.out.println("Player 2 wins!");
            }
            else{
                System.out.println("Player 3 and Player 1 wins!");
            }
        }
        else{
            if (player1Score > player2Score && player1Score > player3Score) {
                System.out.println("Player 1 wins!");
            } else if (player2Score > player1Score && player2Score > player3Score) {
                System.out.println("Player 2 wins!");
            } else if (player3Score > player1Score && player3Score > player2Score) {
                System.out.println("Player 3 wins!");
            } else {
                System.out.println("It's a tie!");
            }
        }
        
        scanner.close();
    }
}

public class Main {
    public static void main(String[] args) {
        
        System.out.println("--------------- The Game Will Be Started ---------------");
        System.out.println();
        
        PlayGame pg = new PlayGame();
        pg.Display();
        
    }
}

