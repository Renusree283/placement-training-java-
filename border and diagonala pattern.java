import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n,row,col;
        n = s.nextInt();
        for(row =1;row<=2*n-1;row++){
            for(col=1;col<=2*n-1;col++){
                if(row==1||row==2*n-1||col==1||col==2*n-1||row==col||col==2*n-row)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
