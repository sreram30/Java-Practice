import java.util.*;
public class ran{
	public static void main(String[] args){
		int a,b;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
		b=s.nextInt();
		int sum=0;
		for(int i=a;i<=b;i++){
			sum+=i;
		}
		System.out.println(sum);
	}
}