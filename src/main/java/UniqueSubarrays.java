import java.util.HashSet;

public class UniqueSubarrays {
	
	/**
	 * Counts the number of unique subarrays in a given array that sum to a target value.
	 *
	 * A subarray is defined as a contiguous sequence of elements within the array.
	 * Each subarray is represented as a unique string in a HashSet to ensure uniqueness.
	 *
	 * @param arr an integer array where the subarrays are to be considered.
	 *            The array must not be null.
	 * @param target the integer value that the subarray sums must match.
	 * @return the count of unique subarrays that sum to the target value.
	 *
	 * Edge Cases:
	 * - Returns 0 if the array is empty or if no subarray matches the target.
	 * - Handles duplicate subarrays efficiently using HashSet.
	 */
	
    public static int countUniqueSubarrays(int[] arr, int target) {
        HashSet<String> uniqueSubarrays = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
        	
            int sum = 0;
            
            
            StringBuilder currentSubarray = new StringBuilder();
            
            for (int j = i; j < arr.length; j++) {
                
            	sum += arr[j];
                
                currentSubarray.append(arr[j]).append(",");
                
                if (sum == target) {
                   
                	uniqueSubarrays.add(currentSubarray.toString());
                
                }//end of if statement
                
            }//end of inner for loop 
        
        }//end of outer for loop
        

        return uniqueSubarrays.size();
        
    }//end of countUniqueSubarrays
    
    
}//end of class 
