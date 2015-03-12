import java.util.Scanner;

public class Priority implements Sort
{		
	
	private Scanner keyboard = new Scanner(System.in);
	private	int[] ItemsPriority = new int[7];
	private int[] SortedItemsPriority = new int[7];
	
	/*
	 * Enter the items' priority
	 */
	
	public void setItemsPriority()
	{
	
		for(int j = 0; j<7; j++)
		{
			ItemsPriority[j]=keyboard.nextInt();
			
		}
		
	}
	
	/*
	 * Getter for the items priority that user input
	 */
	
	public int [] getItemsPriority()
	{
		return ItemsPriority;
	}
	
	/*
	 * Algorithm for sorting method 
	 */
	
	public void SortPriority() 
	{
			
	        for(int counter=0; counter<ItemsPriority.length-1; counter++) 
	        { 
	            for(int index=0; index<ItemsPriority.length-1-counter; index++) 
	            { 
	                if(ItemsPriority[index] > ItemsPriority[index+1]) 
	                { 
	                    int temp = ItemsPriority[index]; 
	                    ItemsPriority[index] = ItemsPriority[index+1];
	                    ItemsPriority[index+1] = temp;
	                }
	            }
	        }
			
		for (int c = 0; c < 7; c++)
		{
		SortedItemsPriority[c] = ItemsPriority[c];
		} 
	
	
	} 
	
	/*
	 * Getter for sorted priority
	 */
	
	public int[] SortedPriority()
	{
		return SortedItemsPriority;
	}
	
	
}
