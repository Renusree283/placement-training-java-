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
        int i=2,count=0;
        while(a>1){
            if(a%i==0){
                count++;
                a=a/i;
            }
            else{
                if(count>=1)
                    count=0;
                i++;
            }
        }
        System.out.print(i);
    }
}
