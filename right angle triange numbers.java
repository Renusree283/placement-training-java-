import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n,col,row;
        n = s.nextInt();
        for(row=1;row<=n;row++){
            int val;
            if(row%2==1){
                val = 1;
            }
            else{
                val = 2;
            }
            for(col=1;col<=row;col++){
                System.out.print(val);
                val+=2;
            }
            System.out.println();
        }
    }
}
