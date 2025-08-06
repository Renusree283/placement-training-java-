import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int a=sc.nextInt();
        int b[]=new int[a];
        for(int i=0;i<a;i++)
        {
            b[i]=sc.nextInt();
            sum=sum+b[i];
        }
        for(int i=0;i<a;i++)
        {
            int c=sum-b[i];
            System.out.print(c+" ");
        }
    }
}
