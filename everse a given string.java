import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        String sc = s.nextLine();
        String r ="";
        for(int i=sc.length()-1;i>=0;i--){
            r = r + sc.charAt(i);
        }
        System.out.print(r);
    }
}
