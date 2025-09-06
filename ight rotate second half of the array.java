import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        int d = n/2;
        int e = n - d;
        int k = s.nextInt();
        int f = k%e;
        for(int i=d+1;i<=d+f;i++){
            int copy = a[d];
            for(int j=d;j<n-1;j++){
                a[j] = a[j+1];
            }
            a[n-1] = copy;
        }
        for(int j=0;j<n;j++){
            System.out.print(a[j] + " ");
        }
        System.out.println();
    }
}
