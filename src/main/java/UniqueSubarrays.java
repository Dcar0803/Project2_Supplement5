import java.util.HashSet;

public class UniqueSubarrays {
	
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
