package Aloo;

import java.util.Scanner;

public class sahil14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b, c = 0, d;
        for (; a > 0; ) {
            b = a % 10;
            a = a / 10;
            c = c + b;
        }
        System.out.println(c);
    }
}
