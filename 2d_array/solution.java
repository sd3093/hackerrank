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
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
    
    int max;
        max = arr[0][0] + arr[0][1] + arr[0][2];
        max += arr[1][1];
        max += arr[2][0] + arr[2][1] + arr[2][2];

    for (int r= 0; r<4; r++){
        for (int c=0; c<4; c++){
            int sum; 
            sum=arr[r][c]+arr[r][c+1]+arr[r][c+2]; 
            sum+=arr[r+1][c+1]; 
            sum+=arr[r+2][c]+arr[r+2][c+1]+arr[r+2][c+2];

              //System.out.println(sum);
             if (sum > max)
                    max = sum;
                //sum = 0;
        }
    }

    System.out.println(max);
        scanner.close();
    }
}
