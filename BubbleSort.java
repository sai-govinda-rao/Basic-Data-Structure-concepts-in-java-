

public class BubbleSort 
{
	public static void main(String[] args) 
	{
		
		int[] array = {5510, 11, 900, 25, 49, 2, 8, 450, 19, 1};
		// this is our array
		// We will have to sort it by using Bubble Sort Algorithm
		
		/*
		 * Sorting will start from the initial two elements.
		 * Let compare them to check which is greater
		 * 
		 * if 551 > 11 
		 * above condition satisfies then swap these 2 elements places else continue the with out swap
		 * after this our array is {11, 551, 900, 25, 49, 2, 8, 450, 19, 1}
		 * 
		 * next it will check 551 and 900 false 
		 * our array is {11, 551, 900, 25, 49, 2, 8, 450, 19, 1}		 
		 * .
		 * .
		 * .
		 * .
		 * .
		 * .
		 * .
		 * this process continue until two loops completed	 
		 * after complete the first phase largest element go to last index
		 * so we don't need to check it
		 */
		
		int temp = 0; // assign the temporary variable
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array.length-1-i; j++)
			{
				if(array[j] > array[j+1])
				{
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.print("Sorted Array: ");
		for(int k = 0; k < array.length; k++)
		{
			System.out.print(array[k]+ " ");
		}
		
	}
}
/*
 * Time Complexity
 * 		best case: O(1)
 * 		average case: O(n**2)
 * 		worst case: O(n**2)
 */






