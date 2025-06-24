import java.util.*;
public class largear{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ar[]=new int[n];
		
		
		for(int i=0;i<n;i++){
			ar[i]=s.nextInt();
		}
		int a=0;
		for(int i=0;i<n;i++){
			a=a+ar[i];
		}
		System.out.println(a);
	}
}