import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = a % 3;
        if(b == 0){
            System.out.println("The number is divisible by 3");
        }
        else{
            System.out.println("The number is not divisible by 3 and gives a remainder "+b);
        }
    }
}
