import java.util.Scanner;

public class TwoPointersSearch 
{

	public static void main(String[] args) 
	{
		Scanner c = new Scanner(System.in);
		//we can take inputs by using the method of the Scanner class
		
		int target;
		System.out.print("Enter The Target Element:");
		// Taking the target variable from user
		target = c.nextInt();
		
		int[] array = {5, 8, 11, 19, 25, 49, 200, 450, 900};
		// this is our array
		// in Binary search our array my be in ascending order
		
		
		int point1 = 0; //set one point in 0th index
		int point2 = array.length-1; //set another point at last index
		boolean result = false;
		int index = 0;
		
		// run the loop until point1 is less then or equal to point2
		while(point1 <= point2)
		{
			// point1 checking block
			if(array[point1] == target) // if condition satisfies then break the loop 
			{
				result = true;  // result set to true
				index = point1; // target element index = point1
				break;
			}
			else
			{
				point1 += 1; // else increment the point1
			}
			
			// point2 checking block
			if(array[point2] == target) // if condition satisfies then break the loop 
			{
				result = true;  // result set to true
				index = point2; // target element index = point2
				break;
			}
			else
			{
				point2 -= 1; // else decrement the point2
			}
		}
		// result block
		if(result == true)
		{
			System.out.println("Target found at index number "+ index);
		}
		else
		{
			System.out.println("Target not found it means target element is not there in the array..!!!");
		}

	}

}
