package Session7;

public class NumberFormat 
{
	public static void main(String[] args) {
		
	int a;	
	try
	{	
	a=Integer.parseInt(null);
	System.out.println(a);
	}
	catch(NumberFormatException e)
	{
        System.out.println("Warning: NumberFormatException");
     }

}
}


