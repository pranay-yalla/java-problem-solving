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
		int[] result=remove_duplicates_from_sorted(a);
			for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		}
	public static int[] remove_duplicates_from_sorted(int[] a) 
	{
		int i=0;
		for(int j=0;j<a.length;j++)
		{
			if(a[i]==a[j])
			j++;
			else
			{
				i++;
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
				}			
	}
	return a;
}}