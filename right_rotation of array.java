import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt() ;
		int[] a=new int [n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int k=sc.nextInt() ;
		a=right_rotate(a,k);
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
	}
	public static int[] right_rotate(int[] a, int k)
	{
		if(a.length==0)
		return a;
		
		k=k%a.length;
		if(k==0){
		return a;}
		
		reverse(a,0,a.length-1);
		reverse(a,0, k-1);
		reverse(a,k,a.length-1);
		return a;
		
	}
	public static void reverse(int[] a, int i, int j)
	{
		for(int k=i,l=j;k<l;k++,l--) 
		{
			int temp=a[k];
			a[k]=a[l];
			a[l]=temp;
		}
	}
}