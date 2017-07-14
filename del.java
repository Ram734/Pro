import java.util.*;
class del
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		Arrays.sort(ch);
		for(int i=0;i<2;i++)
		{
			System.out.print(String.valueOf(ch[i]));
		}
	}
}