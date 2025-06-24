import java.util.*;
public class leap{
	public static void main(String[] args){
		int a;
        Scanner s=new Scanner(System.in);
		a=s.nextInt();
		if(a%400==0){
			System.out.println("a is leap year:"+a);
		}
		else if(a%4==0&&a%100!=0){
			System.out.println("a is leap year:"+a);
		}
		else{
			System.out.println("a is not a leap year:"+a);
		}
	}
}