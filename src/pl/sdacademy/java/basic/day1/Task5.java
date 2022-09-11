package pl.sdacademy.java.basic.day1;

import java.util.Scanner;

public class Task5 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int firstDigit = insertFirstDigit();
        int secondDigit = insertSecondDigit();
        System.out.println("Sum between digits: " + countSumBetweenDigits(firstDigit, secondDigit));

    }

    private static int insertFirstDigit() {
        System.out.println("Insert first digit: ");
        return scanner.nextInt();
    }

    private static int insertSecondDigit() {
        System.out.println("Insert second digit: ");
        return scanner.nextInt();
    }

    private static int countSumBetweenDigits(int firstDigit, int secondDigit) {
        if (firstDigit > secondDigit) {
            int temp = secondDigit;
            secondDigit = firstDigit;
            firstDigit = temp;
        }
        int sum = 0;
        do {
            sum += firstDigit;
            firstDigit++;
        }
        while (firstDigit <= secondDigit);
        return sum;
    }
}
