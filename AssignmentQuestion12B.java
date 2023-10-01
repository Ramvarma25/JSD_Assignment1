import java.util.Scanner;

/*
12.Check if the given character is a vowel or consonant without using methods.
   Do the same program by passing the char to a static method and returning the result.
*/
public class AssignmentQuestion12B {

    public static String vowel(char ch) {

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

            return ch+" character is vowel";
        }
        else {

            return ch+" character is consonant";
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter character you want to check :");
        char ch = sc.next().charAt(0);
        System.out.println(vowel(ch));

    }
}
