
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        float result;

        System.out.println(" 1 - Addition ");
        System.out.println(" 2 - Subtraction ");
        System.out.println(" 3 - Division ");
        System.out.println(" 4 - Multiplication ");

        thirdNumber = scanner.nextInt();
         if (thirdNumber == 1) {



            System.out.println("Enter First Number");
            firstNumber = scanner.nextInt();
            System.out.println("Enter Second Number");
            secondNumber = scanner.nextInt();
            result = secondNumber + firstNumber;
            System.out.println(result); }

            else if ( thirdNumber == 2 ){

            System.out.println("Enter First Number");
            firstNumber = scanner.nextInt();
            System.out.println("Enter Second Number");
            secondNumber = scanner.nextInt();
            result = firstNumber - secondNumber;
            System.out.println(result); }

            else if (thirdNumber == 3){

            System.out.println("Enter First Number");
            firstNumber = scanner.nextInt();
            System.out.println("Enter Second Number");
            secondNumber = scanner.nextInt();
            result = firstNumber / secondNumber;
            System.out.println(result); }

            else if (thirdNumber == 4 ){

            System.out.println("Enter First Number");
            firstNumber = scanner.nextInt();
            System.out.println("Enter Second Number");
            secondNumber = scanner.nextInt();
            System.out.println("The Result is..");
            result = firstNumber*secondNumber;

            System.out.println(result); }

            else
        System.out.println("Error");
        }}








