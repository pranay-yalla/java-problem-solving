import java. util. *;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String s=sc.nextLine(). trim();
		String[]  a=s.split("\\s+ ");
		for(int i=a.length-1;i>=0;i--)
		System.out.print(a[i]+" ");
		
	}
}