import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        int swaps=0;
        int total=0;
        for(;;){
            for (int i= 0; i<a.length-1; i++){
                if(a[i]>a[i+1]){
                    int temp= a[i];
                    a[i]=a[i+1];
                    a[i+1]= temp;
                    swaps++;
                }
            }
            if(swaps==0)
                break;
            else{
                total+=swaps;
                swaps=0;
            }
        }

    System.out.println("Array is sorted in "+ total+ " swaps.");
    System.out.println("First Element: "+ a[0]);
    System.out.println("Last Element: " + a[a.length-1]);

    }
}

