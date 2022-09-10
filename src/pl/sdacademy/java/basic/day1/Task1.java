package pl.sdacademy.java.basic.day1;

public class Task1 {
    public static void main(String[] args) {
        displayWordUsingDecimalFormat();
        displayWordUsingHexaFormat();
    }

    private static void displayWordUsingDecimalFormat() {
        char s = 83;
        char d = 68;
        char a = 65;

        System.out.println(s);
        System.out.println(d);
        System.out.println(a);
    }

    private static void displayWordUsingHexaFormat() {
        char s = 0x53;
        char d = 0x44;
        char a = 0x41;

        System.out.println(s);
        System.out.println(d);
        System.out.println(a);
    }

}
