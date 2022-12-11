package ie.atu.Week5;

import java.util.Scanner;

public class ShapeApp {
    public static void main(String[] args) {
        System.out.println("Please enter width of rectangle");
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        System.out.println("You entered: " + length);
    }
}
