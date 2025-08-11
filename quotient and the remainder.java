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
        int b = s.nextInt();
        float c =(float) a/b;
        System.out.printf("%d / %d = %.6f",a,b,c);
        System.out.println();
        System.out.print(a+" % "+b+" = "+(a%b));
    }
}
