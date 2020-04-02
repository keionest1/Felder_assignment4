import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCounter {
	Map<String, Integer> wordCounter;
	public void count(String dataFile)
	{
		Map<String, Integer> wordconnect = new HashMap<>();
		try {
				Scanner Input = new Scanner(new File(dataFile));
				while(Input.hasNext())
				{
					String word = Input.next();
					if(wordconnect.containsKey(word))
					{
						wordconnect.put(word, (wordconnect.get(word) + 1));
					}
					else 
					{
					wordconnect.put(word, 1);
					}
				} 
			 Input.close();
		} 
		catch (Exception e)
		{
			System.out.println("There is an Exception");
			e.printStackTrace();
		}
		
		Set<Entry<String, Integer>> wordIntro = wordconnect.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<>(wordIntro);
		wordCounter = new HashMap< String, Integer>();
		for( Map.Entry<String, Integer> entry : list)	
		{
			wordCounter.put(entry.getKey(), entry.getValue());
		}
		
	}
	public void write(String outputFile)
	{
		try
		{
			FileWriter write = new FileWriter(outputFile);
			for(Map.Entry<String, Integer> entry : new ArrayList<>(wordCounter.entrySet()))
			{
				write.write(entry.getKey() + ":" + entry.getValue() + "\n");
			}
			write.close();			
		}
		catch(Exception e)
		{
			System.out.println("There is an Exception");
			e.printStackTrace();
		}
	}
}
