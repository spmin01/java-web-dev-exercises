package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        double area;

        System.out.println("Enter radius of circle");
        do {
            radius = input.nextDouble();
            if(radius <= 0) {
                System.out.println("Please enter a radius greater than 0!");
            }
        } while (radius <= 0);

        input.close();

        area = Circle.getArea(radius);
        System.out.println("Area of circle: " + area);
    }
}