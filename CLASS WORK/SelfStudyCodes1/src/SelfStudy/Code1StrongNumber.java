package SelfStudy;
import java.util.Scanner;
public class Code1StrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int strongNum=0;
		int count=0;
		while(temp>0)
		{
			temp=temp/10;
			count++;
		}
		//System.out.println(count);
		int f,dig,rem;
		temp=num;
		while(count>0)
		{
			rem=temp%10;
			//System.out.println(rem);
			f=1;
			dig=rem;
			while(dig>1)
			{
				f=f*dig;
				dig--;
			}
			//System.out.println(f);
			strongNum+=f;
			temp=temp/10;
			//System.out.println(temp);
			count--;
		}
		if(num==strongNum)
		{
			System.out.println("It is a strong number");
		}
		else
		{
			System.out.println("It is not a strong number");
		}
	}
}
