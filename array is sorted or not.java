import java. util. *;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt() ;
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt() ;
		}
		boolean result=isSorted(a);
		System.out.print(result);
	}
	public static boolean isSorted (int[] a)
	{
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<a[i-1])
			return false;
		}
		return true;
	}
}