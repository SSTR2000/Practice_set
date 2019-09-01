package Aloo;

import java.util.Scanner;

public class sahil10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plese enter your gender:-male/female");
        String a = scanner.next().trim();
        System.out.println("Please enter your age:-");
        int b = scanner.nextInt();
        if (a.equals("female") & b >= 1 & b <= 58) {
            System.out.println("8.2%");
        } else if (a.equals("female") & b >= 59 & b <= 100) {
            System.out.println("9.2%");
        } else if (a.equals("male") & b >= 1 & b <= 58) {
            System.out.println("8.4%");
        } else if (a.equals("male") & b >= 59 & b <= 100) {
            System.out.println("10.5%");
        } else {
            System.out.println("hello , please enter correct format");
        }


    }
}
