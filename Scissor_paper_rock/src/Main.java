import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //take user input
        //S,P or R
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter S, P or R");
        char userMove = input.next().charAt(0);
       // char userMove1 = userMove.toUpperCase();
     //  char userMove = Character.toUpperCase(userMove);
      //  System.out.println("User move>>>>>"+userMove1);
        System.out.println("User move>>>>>"+userMove);



        char[ ] maxMove = {'S','P','R'};
        Random random = new Random();

        int number = random.nextInt(3);
        char computerMove = maxMove[number];
        System.out.println("Computer move >>>>"+computerMove);
        if (computerMove== userMove){
            System.out.println("Draw match");
        }

        if(computerMove == maxMove[0])
        {
            if (userMove== maxMove[1])
            {
                System.out.println("You loose. Computer wins");//s vs p
            }
            else {
                System.out.println("You win");//s vs r
            }
        }
        if(computerMove == maxMove[1])
        {
            if (userMove== maxMove[0])
            {

                System.out.println("You win"); //p vs s
            }
            else {
                System.out.println("You loose. Computer wins");//p vs r
            }
        }
        if(computerMove == maxMove[2])
        {
            if (userMove== maxMove[0])
            {
                System.out.println("You loose. Computer wins");//r vs s
            }
            else {
                System.out.println("You win");//r vs p
            }
        }

    }
}