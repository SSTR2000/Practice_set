package Aloo;

import java.util.Scanner;

public class sahil15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b, c = 0, d, e = a;
        for (; a > 0; ) {
            b = a % 10;
            a = a / 10;
            c = c * 10 + b
        }
        if (c == e) {
            System.out.println("No. is pallidrome");
        }
    }
}
