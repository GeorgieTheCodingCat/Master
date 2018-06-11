import java.util.ArrayList;

public class BruteForceGenerator 
{
	private String string;
	private ArrayList<String> permutations;
	
	public BruteForceGenerator(String string)
	{
		this.string = string;
		this.permutations = new ArrayList<String>();
	}

	public ArrayList<String> getPermutations() 
	{ 
		permutation("", this.string);
		return this.permutations;
	}

	private void permutation(String prefix, String str)
	{
		int n = str.length();
	    if (n == 0){this.permutations.add(prefix);} 
	    else{
	    	 for (int i = 0; i < n; i++){permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));}
	    	}
	}	
}
