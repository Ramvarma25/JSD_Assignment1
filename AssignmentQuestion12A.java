import java.util.Scanner;
public class AssignmentQuestion12A {
    public static void main(String[] args) {
            System.out.println("Enter character you want to check :");
            Scanner sc=new Scanner(System.in);
            char ch = sc.next().charAt(0);
            if(ch =='a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                System.out.println(ch +" character  is vowel");
            }
            else
            {
                System.out.println(ch+"  character is consonant");
            }
    }
}
