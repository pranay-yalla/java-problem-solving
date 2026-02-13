import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String  text=sc.nextLine();
		char[] a=text.toCharArray();
		for(int i=0,j=a.length-1;i<j;i++,j--)
		{
			char temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	String 	tex=new String(a);
		System.out.println(tex);
		
		
		StringBuilder sb=new StringBuilder();
	//	sb.reverse(); direct method to.reverse
	for(int i=text.length()-1;i>=0;i--)
	{
		sb.append(text.charAt(i));
	}
		System.out.print(sb.toString());
	}
}