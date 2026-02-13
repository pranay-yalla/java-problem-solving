import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String  text=sc.nextLine();
		String  rev=reverse(text);
		System.out.println(rev);
		String  revwithsb=reversewithsb(text);
		System.out.println(revwithsb);
	}
	public static String reverse(String text){
		char[] a=text.toCharArray();
		for(int i=0,j=a.length-1;i<j;i++,j--)
		{
			char temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		return new String(a);
	}
	public static String reversewithsb(String text){
		StringBuilder sb=new StringBuilder();
		//sb.reverse(); direct method to.reverse
		for(int i=text.length()-1;i>=0;i--)
		{
			sb.append(text.charAt(i));
		}
		return sb.toString();
	}  
}