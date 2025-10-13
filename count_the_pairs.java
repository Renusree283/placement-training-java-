import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = 0;
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
		    a[i] = s.nextInt();
		}
		for(int i=0;i<n;i++){
		    if(a[i]!=-1){
		        for(int j=i+1;j<n;j++){
		            if(a[i]==a[j]){
		                a[i]=-1;
		                a[j]=-1;
		                count++;
		                break;
		            }
		        }
		    }
		}
		System.out.print(count);
	}
}
