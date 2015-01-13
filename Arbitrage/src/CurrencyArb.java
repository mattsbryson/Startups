import java.util.ArrayList;
import java.util.Scanner;


public class CurrencyArb 
{

	public static void main(String[] args)
	{
		ArrayList <ArrayList> curList = new ArrayList<ArrayList>();
		
		
		Scanner reader = new Scanner(System.in);
		
		String cur = "";
		System.out.println("Please enter a list of currencies, enter stop to halt input: ");
		while(!((cur = reader.next()).equalsIgnoreCase("stop")))
		{
			ArrayList <String> tempCur = new ArrayList<String>();
			tempCur.add(cur);
			curList.add(tempCur);
		}
		
		System.out.println("Please enter the exchange rate ratio seperated by colons:");
		for(int i = 0; i < Math.pow(curList.size(), 2); i++)
		{
			
		}

		ArrayList <String> tempCur = new ArrayList<String>();
		for(int i = 0; i < curList.size(); i++)
		{
			
		}
		
		
	}

}
