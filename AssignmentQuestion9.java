public class AssignmentQuestion9 {
    public static void main(String[] args) {
        //9.Print odd numbers from 1 to 10 using for, while, do-while.

        // Using for Loop
        for (int i=1; i<=10; i++){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();


       // Using while loop
        int i = 1;
       while (i<=10){
           System.out.print(i + " ");
           i +=2;
       }
        System.out.println();



       // Using do-while loop
        int j = 1;
        do {
            System.out.print(j + " ");
            j += 2;
        }while (j<=10);
    }

}
