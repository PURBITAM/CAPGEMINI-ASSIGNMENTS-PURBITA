package SelfStudy;

public class Code4AbundantDeficientPerfectNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Abundant Number : ");
		for(int num=1;num<=10000;num++)
		{
			int sum=0;
			for(int i=1;i<num;i++)
			{
				if(num%i==0)
				{
					//System.out.println(i);
					sum=sum+i;
				}
			}
			if(sum>num)
			{
				if(num<10000)
				{
					System.out.print(num+",");
				}
				else
				{
					System.out.println(num);
				}
			}
		}
		System.out.print("Deficient Number : ");
		for(int num=1;num<=10000;num++)
		{
			//int num=21;
			int sum=0;
			for(int i=1;i<num;i++)
			{
				if(num%i==0)
				{
					//System.out.println(i);
					sum=sum+i;
				}
			}
			if(sum<num)
			{
				if(num<10000)
				{
					System.out.println(num);
				}
			}
		}
		System.out.println("Parfect Number : ");
		for(int num=1;num<=10000;num++)
		{
			int sum=0;
			for(int i=1;i<num;i++)
			{
				if(num%i==0)
				{
					sum=sum+i;
				}
			}
			if(sum==num)
			{
				System.out.println(num);
			}
		}
	}
}
