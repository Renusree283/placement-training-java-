import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int index,min;
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
		    a[i] = s.nextInt();
		}
		for(int i=0;i<n;i++){
		    min = a[i];
		    index = i;
		    for(int j=i+1;j<n;j++){
		        if(a[j] < min){
		            index = j;
		            min = a[j];
		        }
		    }
		    int t = a[i];
		    a[i] = a[index];
		    a[index] = t;
		}
		for(int i=0;i<n;i++){
		    System.out.println(a[i]+" ");
		}
	}
}
