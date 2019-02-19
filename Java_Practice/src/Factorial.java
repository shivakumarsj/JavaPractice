
public class Factorial {

	void fact()
	{
		int s = 1; 
		for(int i = 1; i<=5; i++)
		{
			s = s*i; 
		}
		System.out.println("Factotial no :"+ s);
	}
	
	public static void main(String[] args)
	{
		Factorial f = new Factorial(); 
		f.fact();
				

	}

}
