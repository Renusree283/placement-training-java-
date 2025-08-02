import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String ds = sc.next();
        String[] a = ds.split("/");
        int y = Integer.parseInt(a[2]);
        int m = Integer.parseInt(a[1]);
        int da = Integer.parseInt(a[0]);
        if((y>=1900 && y<=9999) && (m<=12 && m>0)){
            if(m==1||m==3||m==5||m==7||m==8||m==10||m==12){
                if(da>0 && da<=31){
                    System.out.println("Valid");
                }
            }
            else if(m==2 && da>0 && da<28){
                System.out.println("Valid");
            }
            else if(m==4||m==6||m==9||m==11 && da>0 &&da<=30){
                System.out.println("Valid");
            }
            else{
                System.out.println("Invalid");
            }
        }
        else{
            System.out.println("Invalid");
        }
    }
}
