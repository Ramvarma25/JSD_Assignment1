/* 13.Initialize 2 variables and find the sum, difference, product, quotient and remainder.
      Do it using static methods and without static methods.
*/
public class AssignmentQuestion13 {
    public static int sum(int a, int b){
        return a+b;
    }

    public static int subtraction(int a, int b){
        return a-b;
    }

    public static int multiplication(int a, int b){
        return a*b;
    }

    public static int quotient(int a, int b){
        return a/b;
    }

    public static int remainder(int a, int b){
        return a%b;
    }



    public static void main(String[] args) {
        int var1 = 20;
        int var2 = 5;

        int sum = var1 + var2;
        System.out.println(sum);

        int subtraction = var1 - var2;
        System.out.println(subtraction);

        int multiplication = var1 * var2;
        System.out.println(multiplication);

        int quotient = var1 / var2;
        System.out.println(quotient);

        int remainder = var1 % var2;
        System.out.println(remainder);

        System.out.println();

        System.out.println(sum(var1, var2));
        System.out.println(subtraction(var1, var2));
        System.out.println(multiplication(var1, var2));
        System.out.println(quotient(var1, var2));
        System.out.println(remainder(var1, var2));

    }
}
