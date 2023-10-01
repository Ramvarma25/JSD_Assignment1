public class AssignmentQuestion8 {
    public static void main(String[] args) {
        //8.Print even numbers from 1 to 10 using for, while, do-while.

        // Using for loop
        for (int i=2; i<=10; i++){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // Using while loop
        int i = 2;
        while (i <= 10){
            System.out.print(i + " ");
            i +=2;
        }
        System.out.println();


        int j = 2;
        do {
            System.out.print(j + " ");
            j+= 2;
        }while (j<=10);


    }
}
