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
		int[]  unq=remove_duplicates(a, n);
			for(int i=0;i<unq.length;i++)
		{
		
			System.out.print(unq[i]+" ");
		}
		sc.close() ;
	}
	public static int[] remove_duplicates (int[] a, int n){
		if(n==0)
		return new int[0];
		int[] b=new int[n];
		b[0]=a[0];
		int k=0;
		for( int i=1;i<n;i++)
		{
			boolean present=false;
		for(int j=0;j<=k;j++)
		{
			if(b[j]==a[i]){
			present=true;
			break;}}
			if(!present)
			b[++k]=a[i];}
	
		int[] unq=new int[k+1];
			for(int i=0;i<=k;i++)
		{
		
			unq[i]=b[i];
		}
			return unq;			
	}
}