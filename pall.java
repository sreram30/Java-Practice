import java.util.*;
class pall{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		String rev="";
		int len=a.length();
		for(int i=(len-1);i>=0;--i){
			rev=rev+a.charAt(i);
		}
		if(a.toLowerCase().equals(rev.toLowerCase())){
			System.out.println("palindrom");
		}
		else{
			System.out.println("noo palindrom");
		}
	}
}