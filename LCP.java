import java.util.*;
class LCP
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String p[]=new String[100];
		for(int i=0;i<n;i++)
		{
			p[i]=sc.next();
		}
		String p1="";
		String check;
		if(p.length>0)
		p1=p[0];
	    int j;
		for(int i=1;i<p.length;i++)
		{
			check=p[i];
			for(j=0;j<p.length;j++)
			{
				if(p1.charAt(j)!=check.charAt(j))
				{
					break;
				}
			}
			p1=p[i].substring(0,j);
		}
		System.out.print("Long Prefix is" +p1);
	}
}
		