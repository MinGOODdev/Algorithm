package net.acmicpc.구현;

import java.util.Scanner;

/**
 * 별찍기 - 4
 */
@SuppressWarnings("Duplicates")
public class P2441_별찍기4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for (int i = a; i > 0; --i) {
            for (int j = a; j > i; --j) {
                System.out.print(" ");
            }
            for (int k = a - i; k < a; ++k) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
