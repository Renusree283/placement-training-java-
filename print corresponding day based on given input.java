import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        String[] ar = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int a = s.nextInt();
        if(a >=0 && a<7){
            System.out.println(ar[a]);
        }
        else{
            System.out.println("Invalid");
        }
    }
}
