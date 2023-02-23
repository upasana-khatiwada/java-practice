import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the age : ");
        int age= input.nextInt();
//        if(age==40)
//        {
//
//            System.out.println("Buy a new house ");
//        } else if (age==60)
//        {
//            System.out.println("retire");
//        }
//        else{
//            System.out.println("buy a old car");
//        }
        switch(age)
        {
            case 40:
                System.out.println("Buy a new house");
                break;
            case 60:
                System.out.println("retire");
                break;
            default:
                System.out.println("buy a old car");
                break;
        }
    }
}