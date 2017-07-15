import java.util.*;
class pan
{
	public static void main(String a[])
	{
		char alp[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		int c[]=new int[ch.length];
		int d=0;
		for(int i=0;i<alp.length;i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				if(alp[i]==ch[j])
				{
					c[i]=1;
				}
			}
		}
		for(int i=0;i<alp.length;i++)
		{
			if(c[i]!=1)
			{
				d=1;
			}
		}
		if(d==0)
		{
			System.out.print("True");
		}
		if(d==1)
		{
			System.out.print("False");
		}
	}
}