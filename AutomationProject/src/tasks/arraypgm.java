package tasks;

import org.testng.annotations.Test;

public class arraypgm {
	@Test
	public void task1()
	{
		 int[] arr={1,2,3,4,5}; 
		 int[] arr1={12,2,32,42,25}; 
		 
		 
		
         
	        for (int i = 0; i < arr.length; i++) 
	        {
	        	 for (int j = 0; j < arr1.length; j++)
	        		 
	        		 if(arr[i]==arr1[j])
	        		 {
	        			 System.out.println("Same value is" + " " + arr[i]);
	        		 }
	        }
	}
}
