import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int count=0;
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++){
             a[i]=sc.nextInt();
            if(a[i]%2==0){
                count++;        
            }
        }   
        System.out.println("Odd = "+(n-count));
        System.out.println("Even = "+count);
    }
}
