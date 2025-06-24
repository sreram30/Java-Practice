import java.util.*;
public class big{
	public static void main(String[] args){
		int a,b;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
		b=s.nextInt();
		if(a<b){
			System.out.println("b is bigger:"+b);
		}
		else{
			System.out.println("a is bigger:"+a);
		}
	}
}