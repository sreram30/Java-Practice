import java.util.*;
public class bigg{
	public static void main(String[] args){
		int a,b,c;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a>b&&a>c){
			System.out.println("a is bigger:"+a);
		}
		else if(b>c){
			System.out.println("b is bigger:"+b);
		}
		else{
			System.out.println("c is bigger:"+c);
		}
	}
}