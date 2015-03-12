import java.util.Scanner;

/*
 * Class for input the Items' Name
 */
public class Items 
{
		private Scanner keyboard = new Scanner(System.in);
		private String[] ItemsName = new String[7];
		
		
		/*
		 * Setter for Items' Name
		 */
		public void setItemsName()
		
		{
			
			for (int i =0; i<7; i++)
			{
				ItemsName[i]=keyboard.nextLine();
			}
		}
		
		/*
		 * Getter for Items' Name
		 */
		public String [] getItemsName()
		{
			return ItemsName;
		}
		
		
}