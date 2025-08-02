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
        String[] m = {"","January","February","March","April","May","June","July","August","September","October","November","December"};
        if(a<0 || a>12){
            System.out.print("Invalid");
        }
        else{
            System.out.print(m[a]);
        }
    }
}
