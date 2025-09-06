import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        char[] arr = str.toCharArray();
        int left = 0, right = arr.length - 1;
        
        while (left < right) {
            if (!Character.isLetterOrDigit(arr[left])) {
                left++;
            }
            else if (!Character.isLetterOrDigit(arr[right])) {
                right--;
            }
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        
        System.out.println(new String(arr));
    }
}
