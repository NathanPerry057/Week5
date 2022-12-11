package ie.atu.Week5;

import java.util.Scanner;

public class ShapeApp {
    public static void main(String[] args) {
        System.out.println("Please enter length of rectangle");
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        System.out.println("You entered: " + length);

        System.out.println("Please enter width of rectangle");
        double width = input.nextDouble();
        System.out.println("You entered: " + width);
    }
}
