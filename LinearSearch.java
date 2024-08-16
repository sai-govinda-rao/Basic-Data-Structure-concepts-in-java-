import java.util.*;
public class LinearSearch 
{
	public static void main(String[] args) 
	{
		Scanner c = new Scanner(System.in);
		//we can take inputs by using the method of the Scanner class
		
		int target;
		System.out.print("Enter The Target Element:");
		// Taking the target variable from user
		target = c.nextInt();
		
		int[] array = {5, 25, 30, 49, 50, 79, 200, 450, 1};
		// this is our array
		
		// run the loop and check each and every element 
		// which is our target element or not
		
		int index = 0; 
		boolean find1 = true; 
		boolean find2 = false;
		// assign the index, find1 and find2 as a global variables
		
		// run the loop 
		for(int i = 0; i < array.length; i++)
		{
			// check the array[i] element is equals to target element or not 
			if(array[i] == target)
			{
				// if condition satisfies change find2 = true and index = i
				// after assign the values break the loop by using break keyword
				find2 = true;
				index = i;
				break;
				
			}
		}
		// check find1 is equals to find2
		if(find1 == find2)
		{
			// if condition satisfies then print index of the target variable
			System.out.println("Target Element Fond At location "+ index);
		}
		else
		{
			// if condition not satisfies it means element is not there in the array 
			System.out.println("Element Not Found");
		}
	}

}
