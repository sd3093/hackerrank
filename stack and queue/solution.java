import java.io.*;
import java.util.*;

public class Solution {

    // Write your code here.
    public ArrayList<Character> stack; 
    public ArrayList<Character> queue; 

    public Solution(){
        stack= new ArrayList<Character>();
        queue= new ArrayList<Character>();
    }

    void pushCharacter(char ch){
        stack.add(0, ch);
    }

    char popCharacter(){
        char temp= stack.get(0);
        stack.remove(0);
        return temp;
    }

    void enqueueCharacter(char ch){
        queue.add(ch);
    }

    char dequeueCharacter(){
        char temp = queue.get(0);
        queue.remove(0);
        return temp;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}