import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter NUmber between 1 and 10");
        //int userInput = input.nextInt();

       // int [ ] maxMove = {1,2,3,4,5,6,7,8,9,10};
        Random random = new Random();
        int computerInput = random.nextInt(10)+1;
      //  int computerInput = maxMove[number]+1;
        int turns=5;
        int userInput,i;
       // while(turns>0&&turns<=5);
        for(i=0;i<5;i++)
        {
            userInput=input.nextInt();
            if(computerInput==userInput)
            {
                int t=i=1;
                System.out.println("Congratulations!!!!!!!You guessed it correctly at "+t+"try");
                break;
            }
            else if (userInput>computerInput)
            {
                if(i!=turns-1)
                {
                    System.out.println(userInput+"is too high,please guess Lower number");
                }
            }
            else if(userInput<computerInput)
            {
                if(i!=turns-1)
                {
                   System.out.println(userInput+"is too low,please guess higher number");

                }
            }
        }

        if (i == turns) {
            System.out.println(
                    "Sorry you were unable to guess the correct answer. Better luck next time :(");

            System.out.println(
                    "The number was " + computerInput);
        }

//        while(userInput!=computerInput)
//        {
//            userInput=input.nextInt();
//            if(userInput==computerInput)
//            {
//                System.out.println("Congratulations.   You guessed the number with "+ turns +" tries!");
//            }
//            if (userInput>computerInput)
//            {
//                System.out.println(userInput+"is too high,please guess Lower number");
//
//            }
//            //  else  (userInput<computerInput)
//            else
//            {
//                System.out.println(userInput+"is too low,please guess higher number");
//
//            }
//            //  if(computerInput==userInput)
////           else
////           {
////              System.out.println("You guessed  correct");
////
////            }




        }
}