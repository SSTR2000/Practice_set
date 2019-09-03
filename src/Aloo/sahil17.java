package Aloo;

import java.util.Scanner;

public class sahil17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the character");
        char a = scanner.nextLine().trim().charAt(0);
        if (a >= 65 & a <= 90) {
            System.out.println("ALPHABET");
        } else if (a >= 97 & a <= 122) {
            System.out.println("ALPHABET");
        } else if (a >= 48 & a <= 57) {
            System.out.println("DIGIT");
        } else {
            System.out.println("SPECIAL CHARACTER");
        }
    }
}
