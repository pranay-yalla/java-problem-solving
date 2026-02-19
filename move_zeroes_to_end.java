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
		int[]  result=movezeroes(a);
			for(int i=0;i<n;i++)
		{
		System.out.print(	a[i]+" ") ;
		}
	}
	public static int[] movezeroes (int[] a )
	{
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				j++;
			}
}
return a;
	}}