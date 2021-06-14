package jdbccrudeecample;

import java.util.Scanner;

public class ProductManagement 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ProductManagementSystem pms= new ProductManagementSystem();
		pms.dbConnection();
		char cont='y';
		int transaction;
		while(true)
		{
			System.out.println("Enter the choice : ");
			System.out.println("1. insert : to insert product");
			System.out.println("2. update : to update product");
			System.out.println("3. delete : to delete product");
			System.out.println("4. getProduct : to get a product");
			System.out.println("5. get all product : to get all products");
			System.out.println("6. exit");
			transaction=sc.nextInt();
			switch(transaction)
			{
				case 1:		pms.insertIntoProductUsingPS();
							break;
				case 2:		pms.updateDataByUsingId();
							break;
				case 3:		pms.deleteProductUsingId();
							break;
				case 4:		pms.getProductById();
							break;
				case 5:		pms.getAllProducts();
							break;
				case 6:		System.out.println("Thank you for visiting");
							System.out.println("Please visit again");
							System.exit(0);
							break;
			}
			System.out.print("do you want to continue : ");
			cont=sc.next().trim().charAt(0);
			if(cont=='y')
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
