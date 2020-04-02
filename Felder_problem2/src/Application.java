
public class Application {

	public static void main(String[] args) 
	{
		DuplicateCounter noDoubles = new DuplicateCounter();
		try
		{
			noDoubles.count("problem2.txt");
			noDoubles.write("unique_word_counts.txt");
		}
		catch(Exception ex) 
		{
			ex.printStackTrace();
		}

	}

}
