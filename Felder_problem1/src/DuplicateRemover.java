import java.io.File;
import java.io.FileWriter;
import java.util.*;
public class DuplicateRemover
{
	HashSet<String> uniqueWords = new HashSet<String>();
	public void remove(String dataFile)
	{
		
		   Scanner Input = null;
		try 
		{
			 	Input = new Scanner(new File(dataFile));
			 	while(Input.hasNext())
			 	{
			 		uniqueWords.add(Input.next());
			 	}
		}
		catch(Exception ex) 
		{
			System.err.println("There a problem reading this file.");
			ex.printStackTrace();
		}
		finally 
		{
			if(Input != null) 
			{
				try 
				{
					Input.close();
				}
				catch(Exception e) 
				{
					System.err.println("This file will not close.");
					e.printStackTrace();
				}
			}
		}
		
		Input.close();
	}
	public void write(String outputFile) 
	{
		FileWriter write = null;
		try 
		{
			write = new FileWriter(outputFile);
			for(String word : uniqueWords) 
			{
				 write.write(word +"\n");
			}
		}
		catch(Exception ex) 
		{
			System.err.println("There a problem reading this file.");
			ex.printStackTrace();
		}
		finally 
		{
			if(write != null) 
			{
				try 
				{
					write.close();
				}
				catch(Exception e) 
				{
					System.err.println("This file will not close.");
				}
			}
		}
	}
}
