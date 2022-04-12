import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String teks;
        teks = input.nextLine();
        int nilai;
        nilai = input.nextInt();

        getPergeseran(teks, nilai);
    }

    static void getPergeseran(String teks, int nilai){
        for (int a = 0; a < teks.length(); a++){
            if (teks.charAt(a) >= 65 && teks.charAt(a) <= 90){
                if (teks.charAt(a) + nilai > 90)
                    System.out.print((char)(teks.charAt(a) + nilai - 26));
                else
                    System.out.print((char)(teks.charAt(a) + nilai));
            }

            if (teks.charAt(a) >= 97 && teks.charAt(a) <= 122){
                if (teks.charAt(a) + nilai > 122)
                    System.out.print((char)(teks.charAt(a) + nilai - 26));
                else
                    System.out.print((char)(teks.charAt(a) + nilai));
            }

            if (teks.charAt(a) == ' '){
                System.out.print(' ');
            }
        }
    }
}