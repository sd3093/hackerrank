import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String n_bin= Integer.toBinaryString(n);
        int conseq= 1; 
        int max=0;
        //System.out.println(n_bin);

        for (int i=0; i<n_bin.length()-1; i++){

            if(n_bin.charAt(i)=='1' && n_bin.charAt(i+1)=='1'){
                conseq++;
            }
            else if (n_bin.charAt(i)=='1' && n_bin.charAt(i+1)=='0'){
                conseq= 1;
            }

            if (conseq > max)
                max = conseq;
        }

        System.out.println(""+ max);


        scanner.close();
    }
}
