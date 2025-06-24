import java.util.*;
public class nat{
	public static void main(String[] args){
		int a;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
		int sum=0;
		for(int i=0;i<a;i++){
			sum+=i;
		}
		System.out.println(sum);
	}
}