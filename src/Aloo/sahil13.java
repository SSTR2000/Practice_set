package Aloo;

import java.util.Scanner;

public class sahil13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plese enter the no. :-");
        int a = scanner.nextInt();
        int i;
        for (i = 2; i < a; i++) {
            if (a % i == 0) {
                System.out.println(a + " is not prime");
                break;
            }
        }
        if (a % i != 0) {
            System.out.println(a + " is prime");
        }
    }
}
