/**
 * CS180 - Lab 06
 *
 * Game class , used to play rock, paper, scissors against a computer player
 *
 * @author Jarrett Andrulis, jandruli@purdue.edu, section B09
 *
 * @version 09/27/16
 */
import java.util.Random;
import java.util.Scanner;
public class Game {
    private final static int ROCK = 1;
    private final static int PAPER = 2;
    private final static int SCISSORS = 3;
    //Main method, creates a game object and runs the runGame method
    public static void main(String[] args)
    {
        new Game().runGame();
    }

    /**
     * runGame() method, runs the entire game
     * it takes input from the player and computer and prints out a winner
     * it plays for as many games as the player wants to before exiting
     */
    public void runGame()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome");
        while(true)
        {
            System.out.println("Please enter an option:\n1. Rock\n2. Paper\n3. Scissors\n4. Exit");
            int option = input.nextInt();
            while(option > 4 && option < 1)
            {
                System.out.println("Please enter an option between 1 and 4");
                option = input.nextInt();
            }
            switch(option)
            {
                case ROCK:
                    System.out.println("You played rock!");
                    break;
                case SCISSORS:
                    System.out.println("You played scissors!");
                    break;
                case PAPER:
                    System.out.println("You played paper!");
                    break;
            }
            if(option == 4)
            {
                System.out.println("Thanks for playing");
                break;
            }
            int cpuInput = simulateComputerMove();
            switch(cpuInput)
            {
                case ROCK:
                    System.out.println("The computer played rock!");
                    break;
                case SCISSORS:
                    System.out.println("The computer played scissors!");
                    break;
                case PAPER:
                    System.out.println("The computer played paper!");
                    break;
            }
            int winner = checkWinner(option,cpuInput);
            switch (winner)
            {
                case 1:
                    System.out.println("You Win!");
                    break;
                case 2:
                    System.out.println("You Lose");
                    break;
                case 0:
                    System.out.println("Draw");
                    break;
            }



        }
    }

    /**
     *
     * @param move1 the first move, 1 is rock, 2 is paper, 3 is scissors
     * @param move2 the second move, 1 is rock, 2 is paper, 3 is scissors
     * @return 1 for move1 winning, 2 for move2 winning, or 0 for draw
     */
    private int checkWinner(int move1, int move2)
    {
        if(move1 == move2) //If the two throws are equal
            return 0;
        //We can assume that if the method gets to this point,
        // move1 does not equal move2
        if(move1 == PAPER)
        {
            if (move2 > move1) //Scissors is always greater than paper
                return 2;
            if (move2 < move1) //Rock is always less than paper
                return 1;
        }
        if(move2 == PAPER)
        {
            if (move1 < move2) //Rock is always less than paper
                return 2;
            if (move1 > move2) //Scissors is always greater than paper
                return 1;
        }
        //We can assume at this point that move1 and move2 do not equal paper
        //or each other
        if(move1 > move2) //Scissors is always greater than rock
            return 2;
        if(move2 > move1) //Rock is always less than scissors
            return 1;

        return 0;
    }

    /**
     *
     * @return a random number from 1 to 3
     */
    private int simulateComputerMove()
    {
        Random rand = new Random();
        return rand.nextInt(3)+1;
    }
}
