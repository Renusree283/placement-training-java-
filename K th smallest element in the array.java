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
        int pos = s.nextInt();
        for(i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        Arrays.sort(a);
        if(pos>n){
            System.out.print("Out of Range");
        }
        else{
            System.out.print(a[pos-1]);
        }
    }
}
