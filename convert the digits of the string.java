import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner s = new Scanner(System.in);
        int ch = 0;
        String a = s.nextLine();
        for(int i=0;i<a.length();i++){
            char c = a.charAt(i);
            if(Character.isDigit(c)){
                System.out.print(a.charAt(i));
                ch = 1;
            }
        }
        if(ch==0){
            System.out.print(ch);
        }
    }
}
