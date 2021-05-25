package selfstudy8.com.capgemini.objectArray;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			Product p=new Product();
			Product[] plist=new Product[3];
		while(true)
		{
			
			System.out.println("Enter choide\n1. create\n2. update\n3. delete\n4. display all\n5. display by id");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1 : plist=p.createList();
						break;
			case 2 : 	int id=sc.nextInt();
						p.updateById(plist,id);
						break;
			case 3 : int id2=sc.nextInt();
					p.deleteById(plist,id2);
					break;
			case 4 : p.display(plist);
						break;
			case 5 : int id1=sc.nextInt();
					p.findProductById(plist,id1);
					break;
			default : System.out.println("Wrong choice");
						break;
						
			}
			System.out.println("Continue \n1. yes\n2. no");
			ch=sc.nextInt();
			if(ch==1)
			{
				continue;
			}
			else
			{
				break;
			}
		}
	}

}
