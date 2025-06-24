import java.util.*;
public class prime{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		checkprime(n);
	}
	private static void checkprime(int n){
		int count=0;
		if(n<2){
			System.out.println("is not a prime");
		}
		else{
	    for(int i=1;i<=n;i++){
			if(n%i==0){
				count+=1;
			}
		
		if(count>2){
			System.out.println(i);
		}
		
		else{
			System.out.println(i);
		}
		}
	}
}