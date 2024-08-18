import java.util.Scanner;

public class BinarySearch 
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
		
		
		
		int index = 0; 
		boolean find1 = true; 
		boolean find2 = false;
		// assign the index, find1 and find2 as a global variables
		
		int low = 0; // assign the starting index
		int high = array.length;
		
		// run the loop until low < high
		 while(low<=high)
		 {
			 int mid = (low+high)/2;
			 
			 // check if array[mid] == target then assign find2 = false
			 if(array[mid] == target)
			 {
				 find2 = true;
				 index = mid;
				 break;
			 }
			 else if(array[mid] < target)
			 {
				 low = mid+1;
			 }
			 else
			 {
				 high = mid-1;
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
