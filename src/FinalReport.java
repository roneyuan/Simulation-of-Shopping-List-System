/*
 * Class for final report list. If the items name are matched the items, it will output the matched items' name
 */

public class FinalReport {
	
	private String[] matchitems = new String[7];
	private double[] matchprice = new double [7];
	
	
	
	public void checkitemsbought(String[] ItemsBought, String[]ItemsName, double[] newPrice)
	{
	 	
	while(ItemsBought[0]!="Done"||ItemsBought[1]!="Done"||ItemsBought[2]!="Done"||ItemsBought[3]!="Done"||ItemsBought[4]!="Done"||ItemsBought[5]!="Done"||ItemsBought[6]!="Done")
	{
		if (ItemsBought[0].equals(ItemsName[0])||ItemsBought[0].equals(ItemsName[1])||ItemsBought[0].equals(ItemsName[2])||ItemsBought[0].equals(ItemsName[3])||ItemsBought[0].equals(ItemsName[4])||ItemsBought[0].equals(ItemsName[5])||ItemsBought[0].equals(ItemsName[6]))
	 	{
	 		matchitems[0]=ItemsBought[0];
	 		matchprice[0]=newPrice[0];
	 	}
		else 
			return;
			
	 	
	 	if (ItemsBought[1].equals(ItemsName[0])||ItemsBought[1].equals(ItemsName[1])||ItemsBought[1].equals(ItemsName[2])||ItemsBought[1].equals(ItemsName[3])||ItemsBought[1].equals(ItemsName[4])||ItemsBought[1].equals(ItemsName[5])||ItemsBought[1].equals(ItemsName[6]))
	 	{
	 		matchitems[1]=ItemsBought[1];
	 		matchprice[1]=newPrice[1];
	 	}
	 	else 
			return;
	 		
	 	
	 	if (ItemsBought[2].equals(ItemsName[0])||ItemsBought[2].equals(ItemsName[1])||ItemsBought[2].equals(ItemsName[2])||ItemsBought[2].equals(ItemsName[3])||ItemsBought[2].equals(ItemsName[4])||ItemsBought[2].equals(ItemsName[5])||ItemsBought[2].equals(ItemsName[6]))
	 	{
	 		matchitems[2]=ItemsBought[2];
	 		matchprice[2]=newPrice[2];
	 	}
	 	else
			return;
	 	
	 	
	 	if (ItemsBought[3].equals(ItemsName[0])||ItemsBought[3].equals(ItemsName[1])||ItemsBought[3].equals(ItemsName[2])||ItemsBought[3].equals(ItemsName[3])||ItemsBought[3].equals(ItemsName[4])||ItemsBought[3].equals(ItemsName[5])||ItemsBought[3].equals(ItemsName[6]))
	 	{
	 		matchitems[3]=ItemsBought[3];
	 		matchprice[3]=newPrice[3];
	 	}
	 	else
			return;
	 	
	 	
	 	if (ItemsBought[4].equals(ItemsName[0])||ItemsBought[4].equals(ItemsName[1])||ItemsBought[4].equals(ItemsName[2])||ItemsBought[4].equals(ItemsName[3])||ItemsBought[4].equals(ItemsName[4])||ItemsBought[4].equals(ItemsName[5])||ItemsBought[4].equals(ItemsName[6]))
	 	{
	 		matchitems[4]=ItemsBought[4];
	 		matchprice[4]=newPrice[4];
	 	}
	 	else
			return;
	 	
	 	
	 	if (ItemsBought[5].equals(ItemsName[0])||ItemsBought[5].equals(ItemsName[1])||ItemsBought[5].equals(ItemsName[2])||ItemsBought[5].equals(ItemsName[3])||ItemsBought[5].equals(ItemsName[4])||ItemsBought[5].equals(ItemsName[5])||ItemsBought[5].equals(ItemsName[6]))
	 	{
	 		matchitems[5]=ItemsBought[5];
	 		matchprice[5]=newPrice[5];
	 	}
	 	else
			return;
	 	
	 	
	 	if (ItemsBought[6].equals(ItemsName[0])||ItemsBought[6].equals(ItemsName[1])||ItemsBought[6].equals(ItemsName[2])||ItemsBought[6].equals(ItemsName[3])||ItemsBought[6].equals(ItemsName[4])||ItemsBought[6].equals(ItemsName[5])||ItemsBought[6].equals(ItemsName[6]))
	 	{
	 		matchitems[6]=ItemsBought[6];
	 		matchprice[6]=newPrice[6];
	 	}
	 	else
			return;
	 	
	
	 	
	 	
	}
		
	}
	
	public String[] getmatchitems()
	{
		return matchitems;
	}
	
	public double[] getmatchprice()
	{
		return matchprice;
	}

}
