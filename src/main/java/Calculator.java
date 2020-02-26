import java.util.Scanner;

public class Calculator {

    public static int add(int num1, int num2)
    {
        int sum = num1+num2;
        return sum;
    }
    public static int multiply(int num1,int num2)
    {
        int product = num1*num2;
        return product;
    }

    public static void main(String[]args) {
        int num1 = 20;
        int num2 = 30;

        int choice = 0;
        char repeat = 0;
        String input;
        Scanner sc = new Scanner(System.in);

        do {
            //Menu options
            System.out.println("*********************************");
            System.out.println("*         CALCULATOR            *");
            System.out.println("*********************************");
            System.out.println("*       1. Add                  *");
            System.out.println("*       2. Multiply             *");
            System.out.println("*********************************");
            System.out.println("Enter Your Menu Choice: ");
            choice = sc.nextInt();


            switch (choice) {

                case 1:

                    System.out.println("The sum of 2 numbers :"+add(num1,num2));

                    break;
                case 2:


                    System.out.println("The product of 2 numbers : " +multiply(num1,num2));
                    break;

                default:
                    System.out.println("Invalid menu choice , try again.");
                    break;
            }
            System.out.println("Would you like to use my calculator again ?");
            System.out.println("Enter Y for yes or N for no :");
            input = sc.next();
            repeat = input.charAt(0);



        }while (repeat == 'Y' || repeat == 'y');
    }


}







