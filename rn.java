import java.util.*;
class rn
{
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		Arrays.sort(b);
		for(int i=n;i>0;i--)
		{
			System.out.println(b[i-1]);
		}
	}
}