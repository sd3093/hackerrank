import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int fine=0;
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String [] actual = s1.split("\\s");
        String [] due= in.nextLine().split("\\s");

        //System.out.println(actual.length);

        
        int aYear= Integer.parseInt(actual[2]);
        int dYear= Integer.parseInt(due[2]);
        int aMonth = Integer.parseInt(actual[1]);
        int dMonth = Integer.parseInt(due[1]);
        int aDay= Integer.parseInt(actual[0]);
        int dDay = Integer.parseInt(due[0]);
        

        
        if (aYear>dYear){
            fine= 10000;
        }
        else if(aMonth>dMonth && aYear==dYear){
            fine= 500*(aMonth-dMonth);
        }
        else if(aDay>dDay && aMonth==dMonth && aYear==dYear){
            fine= 15*(aDay-dDay);
        }
        else 
            fine=0;

        System.out.println(fine+"");
        
    }
}

