
public class Anonymous_Array {
	
	 public int add(int[] arr)
	 {
	   int result = 0;
	   for(int i : arr)
	   {
		 result = result + i;
	   }
	     return result;
	 }

	public static void main(String[] args) {
	 
	 Anonymous_Array obj = new Anonymous_Array();
	 int result = obj.add(new int[] {4,5,6,7,8});   /* This is called Anonymous Array(An Array without
	                                                   name is called anonymous array) */
	 System.out.println(result);

	}

}
