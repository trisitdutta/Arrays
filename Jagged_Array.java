
public class Jagged_Array {

	public static void main(String[] args) {
	  
		int[][] arr = new int[][] { {0,1,2,3},
			                         {4,5},
			                         {6,7,8} };
			    
		for(int a[] : arr)
		{
			for(int b : a)
			{
			  System.out.print(b + " ");
			}
			
			System.out.println();
		}

	}

}
