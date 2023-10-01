/* 10.Find area and circumference of a circle, given its radius.
      Do this once without using methods and once using static methods for
      area & circumference. */

public class AssignmentQuestion10 {

    public static double radius = 6;
    public static void Area(){
        System.out.println("Area of a Circle From static method "+ Math.PI * radius * radius);
    }

    public static void Circumference(){
        System.out.println("Circumference of a Circle From static method " + 2 * Math.PI * radius);
    }
    public static void main(String[] args) {

        // Without using method
        double radius = 6;
        double areaOfCircle = Math.PI * radius * radius;
        double circumferenceOfCircle = 2 * Math.PI * radius;


        System.out.println("Area of a Circle " + areaOfCircle);
        System.out.println("Circumference of a Circle " + circumferenceOfCircle);


        // Extra blank line
        System.out.println();


        // Using static method
        Area();
        Circumference();

    }
}
