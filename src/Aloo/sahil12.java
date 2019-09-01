package Aloo;

import java.util.Scanner;

public class sahil12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plese enter the 1st no. :-");
        int a = scanner.nextInt();
        System.out.println("Please enter the 2nd no. :-");
        int b = scanner.nextInt();
        for (; a <= b; a++) {
            System.out.println(a % 2);
        }

    }
}
