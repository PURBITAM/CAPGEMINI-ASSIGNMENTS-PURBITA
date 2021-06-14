package SelfStudy;

public class Code5KaprekarNumber 
{
	public static void main(String[] args) 
	{
		for(int num=1;num<1000;num++)
		{
			int sq= (int) Math.pow(num,2);
			
			int temp=sq,count=0;
			while(temp>0)
			{
				temp=temp/10;
				count++;
			}
			int val = 0;
			
			if(count%2==0 || count==1)
			{
				
				val=(int) (sq%Math.pow(10,count/2)+sq/Math.pow(10,count/2));
			}
			else
			{
				val=(int) (sq%Math.pow(10,(int)(count/2)+1)+sq/Math.pow(10,(int)(count/2)+1));
			}
			
			String sqString=Integer.toString(sq);
			String sq1=sqString.substring(0,(int)(count/2));
			String sq2=sqString.substring((int)(count/2));
			if(val==num)
			{
				if(count==1)
				{
					sq2=sqString.substring((int)(count/2));
					System.out.println(num+" "+sq+" "+'0'+"+"+sq2);
				}
				else if(count%2==0)
				{
					sq1=sqString.substring(0,(int)(count/2));
					sq2=sqString.substring((int)(count/2));
					System.out.println(num+" "+sq+" "+sq1+"+"+sq2);
					//System.out.println(num+" "+sq+" "+(int)(sq/Math.pow(10,(int)(count/2)))+"+"+(int)(sq%Math.pow(10,(int)(count/2))));
				}
				else
				{
					sq1=sqString.substring(0,(int)(count/2)+1);
					sq2=sqString.substring((int)(count/2)+1);
					System.out.println(num+" "+sq+" "+sq1+"+"+sq2);
					//System.out.println(num+" "+sq+" "+(int)(sq/Math.pow(10,(int)(count/2)+1))+"+"+(int)(sq%Math.pow(10,(int)(count/2)+1)));
				}
			}
			
		}
	}
}
