package chapter2;
import java.util.Scanner;
/**
 *
 * @author Fefe
 */


public class ComputeArea {
    public static void main(String[] args) {
        double radius;
        double area;
        Scanner input = new Scanner(System.in);
        // Step 1: read in radius
        System.out.println("What is the radius of your circle?");
        radius = input.nextDouble();
        // Step 2: compute area
        area = Math.pow(radius, 2) * Math.PI;
        // Step 3: Print area
        System.out.println("The area for circle of radius " + radius + " is " +  area);
    }
}
