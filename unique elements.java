import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n,i;
        n = s.nextInt();
        int a[] = new int[n];
        int w =0;
        for(i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        for(i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count == 1){
                System.out.print(a[i]+" ");
                w=1;
            }
        }
        if(w==0){
            System.out.print("No unique elements in the array");
        }
    }
}
