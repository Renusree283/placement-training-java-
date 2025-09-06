import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n,i,k;
        n = s.nextInt();
        int a[] = new int[n];
        for(i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        k = s.nextInt();
        for(i=0;i<k%n;i++){
            int cp = a[n-1];
            for(int j=n-1;j>=1;j--){
                a[j]=a[j-1];
            }
            a[0] = cp;
        }
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
