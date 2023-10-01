import java.util.Scanner;

public class AssignmentQuestion1To7 {

    public static void main(String[] args) {

        //1.Print your name, hobbies and favorite movie name.
        System.out.println("Ram Varma");
        System.out.println("Playing Chess");
        System.out.println("3 Idiots");



        //2.Add five integers (without using variables) and display their sum.
        System.out.println(5+10+15+20+25);



        //3.Add five integers (using variables) and display their sum
        int var1 = 10, var2 = 20, var3 = 30, var4 = 40, var5 = 50;
        int sum = var1 + var2 + var3 + var4 + var5;
        System.out.println("Sum of Five Integers " + sum);


        //4.Declare 2 float variables and display their sum
        float var6 = 10.5f;
        float var7 = 1.93f;
        System.out.println("Sum of two float values "+ (var6 + var7));



        //5.Declare 2 double variables and display their difference.
        double var8 = 150;
        double var9 = 51;
        System.out.println("Difference of two double variable " + (var8 - var9));




       //6.Print "PASS" if the int variable "mark" is more than or equal to 50; or prints "FAIL" otherwise
        int mark = 81;
        if (mark >= 50){
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }




        /* 7.Initialize 2 numbers and initialize 1 char variable for mathematical operator. Find the sum, difference, product and quotient and remainder
        depending on the mathematical operator value. (Use switch statement) */

        int number1 = 25;
        int number2 = 19;
        char operator;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Mathematical Operator");
        operator = sc.next().charAt(0);

        switch (operator){
            case '+' : int add = number1 + number2;
                System.out.println("Sum of Two numbers is " + add);
                break;

            case  '-' : int subtract = number1 - number2;
                System.out.println("Subtraction of two numbers is " + subtract);
                break;

            case  '*' : int product = number1 * number2;
                System.out.println("Product of two numbers is " + product);
                break;

            case  '/' : int quotient = number1 / number2;
                System.out.println("Quotient of two numbers is " + quotient);
                break;

            case  '%' : int remainder = number1 % number2;
                System.out.println("Remainder of two numbers is " + remainder);
                break;

            default:
                System.out.println("Please Enter a valid Operator....!");
        }
    }
}

