package Session7;

public class ArrayIndexOutException {

	public static void main(String[] args) {
	
		int i;
		
		int a[]={12,23,34,56,78};
		/*a[1]=22;
		a[2]=342;
		a[3]=34512;
		a[4]=1233;*/
		try
		{	
		for(i=0;i<5;i++)
		{
			System.out.println(a[5]);
		}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
	        System.out.println("Warning: ArrayIndexOutOfBoundsException");
	     }

	}

}
