import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

class WriteToFile
{
	private static String filepath = "C:\\Users\\BenIII\\Desktop\\permuation.txt";
	public void Write(ArrayList<String> permuation) throws IOException
	{
		BufferedWriter out = new BufferedWriter(new FileWriter(filepath));
		
		try 
		{

		 	int increment = 0;
			while(increment != permuation.size())
			{
				out.write(permuation.get(increment));
				out.newLine();
				increment++;
			}
		}
		catch (IOException e)
		{
		    System.out.println("Exception ");

		}
		finally
		{
		    out.close();
		}
	}
}