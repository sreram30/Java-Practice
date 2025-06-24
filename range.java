import java.util.*;
class range{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		isprime(a,b);
	}
	private static void isprime(int a,int b){
		int count=0;
		for(int i=a;i<=b;i++){
			if(a%i==0){
				System.out.println(i);
			}
			
		}
	}
}