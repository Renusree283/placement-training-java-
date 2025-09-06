import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int pos,data;
        int n = s.nextInt();
        int a[] = new int[n+1];
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        data = s.nextInt();
        pos = s.nextInt();
        for(int i=n;i>pos-1;i--){
            a[i] = a[i-1];    
        }
        a[pos-1] = data;
         for(int i=0;i<n+1;i++){
            System.out.print(a[i] +" ");
        }
        
    }
}
