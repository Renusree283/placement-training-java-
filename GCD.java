import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int i=1,c=0;
        int a = s.nextInt();
        int b = s.nextInt();
        for(i=1;i<=b;i++){
            if(a%i==0 && b%i==0){
               if(c<i){
                c=i;
                } 
            }
        }
        System.out.print("GCD of two number is "+c);
    }
}
