import java.util.*;
public class rev{
	public static void main(String[] args){
		int a;
        Scanner s=new Scanner(System.in);
		a=s.nextInt();
		while(a>0){
			int b = a%10;
			System.out.print(b);
			a=a/10;
		}
	}
}