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
        int flag = 0;
        int data = s.nextInt();
        for(int i=0;i<n;i++){
            if(a[i]==data){
                System.out.print("Found");
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.print("Not found");
        }
    }
}
