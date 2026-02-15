import java. util. *;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		int n=sc.nextInt() ;
		if(n==0)
		{
			System.out.println("no elements provided so no larger numbers");
			return ;
		}
		int[] a=new int [n];
		for( int i=0;i<n;i++)
		{
			a[i]=sc.nextInt() ;
	}
	if(n<2)
	{
		System.out.println("largest is "+a[0]+"  no second largest");
		return ;
	}
	largest(a, n);
	sc.close() ;
	}
	public static void largest(int[] a, int n){
	int largest=Integer.MIN_VALUE;
	int second_largest=Integer.MIN_VALUE;
	for(int i=0;i<n;i++)
	{
		if(a[i]>largest)
		{
			second_largest=largest;;
			largest=a[i];
		}
		else if(a[i]<largest && a[i]>second_largest)
		{
			second_largest=a[i];
		}
	}
	if(second_largest==Integer.MIN_VALUE)
	{
		System.out.println("largest is "+largest+"\n all are equal no second largest");
		return ;
	}
	System.out.print("largest:"+largest+"\nsecond largest:"+second_largest);
	
}}