import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int o = s.nextInt();
        int p = s.nextInt();

        int a[] = new int[n];
        int b[] = new int[o];
        int c[] = new int[p];

        for (int i = 0; i < n; i++)
            a[i] = s.nextInt();
        for (int j = 0; j < o; j++)
            b[j] = s.nextInt();
        for (int k = 0; k < p; k++)
            c[k] = s.nextInt();

        int i = 0, j = 0, k = 0;
        boolean found = false;

        while (i < n && j < o && k < p) {
            if (a[i] == b[j] && b[j] == c[k]) {
                System.out.print(a[i] + " ");
                found = true;
                i++;
                j++;
                k++;
            } else if (a[i] < b[j]) {
                i++;
            } else if (b[j] < c[k]) {
                j++;
            } else {
                k++;
            }
        }

        if (!found) {
            System.out.print("No common elements");
        }
        System.out.println();
    }
}
