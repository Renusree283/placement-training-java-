import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int sp = 0;
        String sc = s.nextLine();
        for(int i=0;i<sc.length();i++){
            char c = sc.charAt(i);
            if(!Character.isLetterOrDigit(c))
                sp++;
        }
        System.out.print(sp);
    }
}
