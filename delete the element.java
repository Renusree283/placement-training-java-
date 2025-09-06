import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        int pos =-1;
        int data = s.nextInt();
        for(int i=0;i<n;i++){
            if(a[i]==data)
                pos=i;
        }
        if(pos!=-1){
            for(int j=pos;j<n-1;j++){
                a[j] =a[j+1];
            } 
            n--;
            for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }
        }
        else{
            System.out.print("Deletion not possible.");
        }
    }
}
