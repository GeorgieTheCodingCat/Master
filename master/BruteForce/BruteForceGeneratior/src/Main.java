import java.io.IOException;
import java.util.ArrayList;

public class Main
{

	public static void main(String[] args) throws IOException 
	{
		String combo = "4321";
		// TODO Auto-generated method stub
		BruteForceGenerator generator = new BruteForceGenerator(combo);
		ArrayList<String> permutations = generator.getPermutations();
		WriteToFile permuation = new WriteToFile();
		permuation.Write(permutations);

	}

}
