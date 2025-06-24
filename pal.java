import java.util.*;
public class pal{
	public static void main(String[] args){
		int a;
        Scanner s=new Scanner(System.in);
		a=s.nextInt();
		int temp=a;
		int rev=0;
		while(a>0){
			rev=a%10;
			a=a/10;
		}
		if(temp==rev){
			System.out.println("palindrom");
		}
		else{
			System.out.println("not a palindrom");
		}
	}
}