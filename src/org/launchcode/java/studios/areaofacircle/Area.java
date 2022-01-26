package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
       // float pi = (float) 3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = input.nextFloat();
        //float area = pi * radius * radius;
        System.out.println("The area of a circle of radius " + radius + " is: " + Circle.getArea(radius));
    }
}
