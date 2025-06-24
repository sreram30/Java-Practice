import java.util.*;
public class nod{
	public static void main(String[] args){
		int a;
		int count=0;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
		while(a>0){
			a=a/10;
			count++;	
		}
		System.out.println(count);
	}
}