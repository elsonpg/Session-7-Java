package Session7;

public class exceptionNull {

	public static void main(String[] args) {
		String s=null;
		
		try{
			
			System.out.println("string length is "+s.length());
			}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer Exception");
		}

	}

}
