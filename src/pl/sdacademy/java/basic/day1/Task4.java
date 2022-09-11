package pl.sdacademy.java.basic.day1;

import java.util.Scanner;

public class Task4 {
    private static final Scanner scanner = new Scanner(System.in);
    private static final double BMI_MIN_RANGE = 18.5;
    private static final double BMI_MAX_RANGE = 24.9;

    public static void main(String[] args) {
        float usersWeight = getWeightFromUser();
        int usersHeight = getHeightFromUser();
        float BMI = calculateUsersBMI(usersWeight, usersHeight);
        showUsersBMI(BMI);

    }

    private static float getWeightFromUser() {
        System.out.println("Please insert your current weight in kilograms: ");
        return scanner.nextFloat();
    }

    private static int getHeightFromUser() {
        System.out.println("Please insert your height in centimeters: ");
        return scanner.nextInt();
    }

    private static float calculateUsersBMI(float weight, int height) {
        System.out.println("Calculating of BMI in progress.");
        float heightInMeters = height / 100F;
        return weight / (float) Math.pow(heightInMeters, 2);
    }

    private static void showUsersBMI(float BMI) {
        if (BMI > BMI_MAX_RANGE || BMI < BMI_MIN_RANGE) {
            System.out.println("BMI is incorrect: " + BMI);
        } else {
            System.out.println("BMI is correct: " + BMI);
        }
    }
}