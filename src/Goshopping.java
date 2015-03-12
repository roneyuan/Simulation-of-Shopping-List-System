import java.util.Scanner;

/*
 * Class for enter the items that are bought from user. When user enter Done, the loop will finish, and the items that are not input will return null
 */

public class Goshopping {
	
	private Scanner keyboard = new Scanner(System.in);
	private String[] Itemsbought = new String[7];
	private boolean check = true;
	private String Done = "Done";
	
	public void shopping()
	{
		System.out.println("Please enter the items, enter Done when you finish if you purchase less than 7 items");
		
		while(check == true)
		{
		for(int i =0; i < 7; i++)
		{
			Itemsbought[i] = keyboard.nextLine();
			if(Itemsbought[i].equals(Done))
				{
				i = 8;
				}
		}
		
		check = false;
		
		}
		
	}
	
	public String[] getshpping()
	{
		return Itemsbought;
	}
	
}
