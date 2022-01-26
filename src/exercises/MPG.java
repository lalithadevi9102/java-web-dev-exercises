package exercises;

import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of miles you have driven: ");
        int miles = input.nextInt();
        System.out.println("Enter the amount of gas consumed (in gallons): ");
        int gas = input.nextInt();
        int mpg = miles / gas;
        System.out.println("miles-per-gallon = " + mpg);
    }
}
