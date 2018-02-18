import java.util.Random;
import java.util.Scanner;

/**
 * Date: 2018-02-16
 * Unit: [1], Question:[1]
 * By: Woojin Park
 * To:Ms. Harris
 * Edits: None
 * Description:None
 **/
public class WoojinPU1A1Q1 {
    public static void main(String[] args) {
        //displays what the program is used for to the user
        System.out.println("This is a program that plays rock scissors paper\n"+ "enter a number 0, 1, or 2\n" + "0=Rock, 1=Scissor, 2=Paper");
        Scanner input= new Scanner(System.in);//Scanner for the input
        boolean PlayOneMore=true;//Boolean to check if the player wants to continue the game or not
        int Playerscore=0;//player's total score
        int Computerscore=0;//computer's total score
        int RoundNum=0;//The number of rounds of the game
        String[] RockScissorPaper={"Rock" , "Scissor" , "Paper"};

        while(PlayOneMore){
            int Player= input.nextInt();//player's input

            if(Player<3 && Player>-1){
                int computer=RandInt(0,2);//choose computer's random integer by using the function RandInt
                RoundNum++;
                System.out.println("Player: " + RockScissorPaper[Player] + ", Computer: " + RockScissorPaper[computer]);//outputs the player's and computer's choice
                if(Player==computer) {
                    System.out.println("It is a tie!");//outputs tie on the console
                }
                else if(computer!=0&&Player<computer||Player==2&&computer==0) {
                    System.out.println("Player won the game!");//outputs that player won the game on the console
                    Playerscore++;
                }
                else {
                    System.out.println("Computer won the game!");//outputs that computer won the game in the console
                    Computerscore++;
                }
                Scoreboard(Playerscore,Computerscore,RoundNum);//call a function that displays the scoreboard in the console
            }
            else
                System.out.println("You input invalid number\n");

            System.out.println("To exit the game input 3\n" + "To play again enter any integer except 3\n");//ask the user if they want to play the game again
            int OutOfTheGame=input.nextInt();
            if(OutOfTheGame==3)//if the user inputs 3 the game ends
                PlayOneMore=false;
            else {
                PlayOneMore = true;
                System.out.println("enter a number 0, 1, or 2\n");//tells the user what to input for the next round
            }
        }
    }
    //Produces Random integer between 0 to 2; a code written by TJ_Fischer in stack overflow
    public static int RandInt(int min, int max) {
        Random rand;
        int randomNum =min + (int)(Math.random() * ((max - min) + min));// Produces a random integer between minimum and maximum value input
        return randomNum;
    }

    //A scoreboard to display the number of rounds and the number of wins that the player and computer have
    public static void Scoreboard(int Playerscore, int Computerscore, int RoundNum){
        System.out.println("--------- Round: " + RoundNum + " ---------");//Output the round number
        System.out.println("|   Player   |  Computer  |");//Output the the Player row and the Computer row
        System.out.println("|     " + Playerscore + "      |     " + Computerscore + "      |\n");//Output the Player's score and the Computer's score
    }
}
