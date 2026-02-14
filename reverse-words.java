import java. util. *;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String sentence=sc.nextLine(). trim();
		String[]  words=sentence.split("\\s+ ");
		for(int i=words.length-1;i>=0;i--)
		System.out.print(a[i]+" ");
		sc.close() ;
	}
}
