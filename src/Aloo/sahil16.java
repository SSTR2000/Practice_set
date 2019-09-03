package Aloo;

import java.util.Scanner;

public class sahil16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the 1st character");
        char a = scanner.nextLine().trim().charAt(0);
        System.out.println("Please enter another character");
        char b = scanner.nextLine().trim().charAt(0);
        if ('a' > 'b') {
            System.out.print(a + ",");
            System.out.println(b);

        } else {
            System.out.print(b + ",");
            System.out.println(a);

        }

    }
}
