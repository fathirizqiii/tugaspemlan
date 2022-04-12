import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int angka = input.nextInt();

        cekSelde(angka);
        }

    static void cekSelde (int angka) {
        String newAngka = angka + "";

        if (newAngka.length() % 2 == 0) {
            int counter = 0;
            for (int a = 0, b = newAngka.length() - 1; a - b != 1; a++, b--) {
                if (newAngka.charAt(a) != newAngka.charAt(b)) {
                    counter++;
                }
            }
            if (counter == 0) {
                System.out.println(angka + " adalah selde.");
            } else
                System.out.println(angka + " bukan selde.");

        } else {
            int counter = 0;
            for (int a = 0, b = newAngka.length() - 1; a - b != 2; a++, b--) {
                if (newAngka.charAt(a) != newAngka.charAt(b)) {
                    counter++;
                }
            }

            if (counter == 0) {
                System.out.println(angka + " adalah selde.");
            } else
                System.out.println(angka + " bukan selde.");
        }
    }
}