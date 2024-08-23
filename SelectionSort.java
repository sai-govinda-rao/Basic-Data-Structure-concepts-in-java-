
public class SelectionSort 
{
	public static void main(String[] args) 
	{
		int[] array = {551, 11, 900, 25, 1, 0, 49, 2, 8, 450, 19, 1};
		// this is our array
		// We will have to sort it by using Selection Sort Algorithm
		
		/*
		 * Sorting will start from the initial two elements.
		 * Let compare them to check which is greater
		 * 
		 * if 551 > 11 
		 * above condition satisfies them small = (11 element index) 1
		 * 1st phase completed it will find the small element
		 * and swap that element to 0th index
		 * after complete the first phase smallest element placed on the 0th index
		 * .		 
		 * .
		 * .
		 * .
		 * .
		 * .
		 * .
		 * .
		 * this process continue until two loops completed	 
		 * our array will be sorted
		 * so we don't need to check it
		 */
		
		int small = 0; //set small index = 0
		for(int i = 0; i<array.length; i++) // run the First for loop
		{
			small = i; // then take small index = i
			for(int j = i+1; j < array.length; j++) // run the second for loop from i+1
			{
				if(array[small] > array[j])  // check the condition if it satisfies then small will modify the element index
				{
					small = j;
				}
			}
			
			// successfully complete the second for loop we find the small element index
			// swap that element to 0th index
			int temp = array[small];  
			array[small] = array[i];
			array[i] = temp;
			
			// this process continue until all the elements sorted 
		}
		for(int k : array)
		{
			System.out.print(k + " ");
		}
	}
}

/*
 * Time Complexity
 * 		best case: O(1)
 * 		average case: O(n**2)
 * 		worst case: O(n**2)
 * 
 */
