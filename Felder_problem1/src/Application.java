
public class Application {

	public static void main(String[] args)
	{
		DuplicateRemover noDoubles = new DuplicateRemover();
		try {
				noDoubles.remove("problem1.txt");
				noDoubles.write("unique_words.txt");		
	        }
		    catch(Exception ex) 
		    {
	        	ex.printStackTrace();
	        }
    }
}
