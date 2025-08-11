import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ans = (int)Math.sqrt(n);
        int c = ans*ans;
        if(c==n)
            System.out.print("Perfect Square");
        else
            System.out.print("Not");
    }
}
