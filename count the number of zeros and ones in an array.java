import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b[]=new int[a];
        int count=0;
        for(int i=0;i<a;i++){
            b[i]=sc.nextInt();
            if(b[i]==0)
                count++;
        }
        System.out.println("zc = "+count);
        System.out.println("oc = "+(a-count));
    }
}
