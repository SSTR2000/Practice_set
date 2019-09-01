package Aloo;

import java.util.Scanner;

public class sahil8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        if (inputNumber == 0) {
            System.out.println("Zero");
        } else if (inputNumber > 0) {
            System.out.println("positive");
        } else {
            System.out.println("Negative");
        }
    }
}
