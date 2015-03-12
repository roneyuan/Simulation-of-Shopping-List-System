/*
 * Class for check items to see if items are input more than two times 
 */

public class CheckItems extends Items{
	
	
	public void checkitemsname(String[]ItemsName)
	{
		
	 	if (ItemsName[0].equals(ItemsName[1])||ItemsName[0].equals(ItemsName[2])||ItemsName[0].equals(ItemsName[3])||ItemsName[0].equals(ItemsName[4])||ItemsName[0].equals(ItemsName[5])||ItemsName[0].equals(ItemsName[6]))
			{
	 		System.out.println("You have enter the "+ItemsName[0]+" two times");
	 		System.out.println("Please run the application again");
			}
	 	
	 	if (ItemsName[1].equals(ItemsName[2])||ItemsName[1].equals(ItemsName[3])||ItemsName[1].equals(ItemsName[4])||ItemsName[1].equals(ItemsName[5])||ItemsName[1].equals(ItemsName[6]))
	 		{
	 		System.out.println("You have enter the "+ItemsName[1]+" two times");
	 		System.out.println("Please run the application again");
	 		}
	 	
	 	if (ItemsName[2].equals(ItemsName[3])||ItemsName[2].equals(ItemsName[4])||ItemsName[2].equals(ItemsName[5])||ItemsName[2].equals(ItemsName[6]))
	 		{
	 		System.out.println("You have enter the "+ItemsName[2]+" two times");
	 		System.out.println("Please run the application again");
	 		}
	 	
	 	if (ItemsName[3].equals(ItemsName[4])||ItemsName[3].equals(ItemsName[5])||ItemsName[3].equals(ItemsName[6]))
	 		{
	 		System.out.println("You have enter the "+ItemsName[3]+" two times");
	 		System.out.println("Please run the application again");
	 		}
	 	
	 	if (ItemsName[4].equals(ItemsName[5])||ItemsName[4].equals(ItemsName[6]))
	 		{
	 		System.out.println("You have enter the "+ItemsName[4]+" two times");
	 		System.out.println("Please run the application again");
	 		}
	 	
	 	if (ItemsName[5].equals(ItemsName[6]))
	 		{
	 		System.out.println("You have enter the "+ItemsName[5]+" two times");
	 		System.out.println("Please run the application again");
	 		}
		
		return;

	}
	



}
