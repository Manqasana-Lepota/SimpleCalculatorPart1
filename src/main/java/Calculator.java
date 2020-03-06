import java.util.Scanner;

public class Calculator {

    public static int add(int... numbers)
    {
        int sum = 0;

        for(int x = 0; x < numbers.length; x ++)
        {
            sum = sum + numbers[x];
        }
        System.out.println("The sum of numbers : " + sum);
        return sum;
    }

    public static int multiply(int... numbers)
    {
        int product = numbers[0];

        for(int x = 1; x < numbers.length; x++)
        {
            product = product * numbers[x];

        }

        System.out.println("Product of numbers : " + product);

        return product;
    }

    public static void main(String[]args) {


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
                    add(1,2,3,4,5);
                    add(1,2);
                    add(-1,-1);

                    break;
                case 2:
                    multiply(1,2,3,4,5);
                    multiply(1,3);
                    multiply(-1,3);
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







