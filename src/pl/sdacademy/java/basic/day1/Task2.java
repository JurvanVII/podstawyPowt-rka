package pl.sdacademy.java.basic.day1;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Task2 {
    public static void main(String[] args) {
        float radius = getDiameterFromUser() / 2;
        float area = calculateArea(radius);
        float circumreference = calculateCircumreference(radius);
        System.out.println("Pole wynosi " + area + " a obwod " + circumreference);
    }

    private static float getDiameterFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert diameter: ");
//        float diameter =  scanner.nextFloat();
//        return diameter;
        return scanner.nextFloat();

    }

    private static float calculateArea(float radius) {
        return (float)(PI * Math.pow(radius, 2));
    }

    private static float calculateCircumreference(float radius) {
        return 2 * (float)PI * radius;
    }
}
