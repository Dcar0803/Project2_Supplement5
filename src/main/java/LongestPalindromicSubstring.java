public class LongestPalindromicSubstring {
	
	/**
	 * Finds the longest palindromic substring in a given input string.
	 *
	 * A palindromic substring is defined as a contiguous sequence of characters
	 * that reads the same forwards and backwards. This function uses the
	 * "expand around center" technique to efficiently locate the longest palindrome.
	 *
	 * @param s the input string to search for palindromic substrings.
	 *          The string may be empty but must not be null.
	 * @return the longest palindromic substring found within the input string.
	 *
	 * Edge Cases:
	 * - Returns an empty string if the input string is empty.
	 * - Handles single-character strings by returning the input as-is.
	 * - Considers overlapping palindromic substrings.
	 */
    
	
	public static String findLongestPalindrome(String s) {
        
		
		if (s == null || s.isEmpty()) {
			
            return "";
            
        }//end of if statement

        int start = 0, end = 0;
        
        for (int i = 0; i < s.length(); i++) {
            
        	int len1 = expandAroundCenter(s, i, i);
            
        	int len2 = expandAroundCenter(s, i, i + 1);
           
        	int len = Math.max(len1, len2);
            
        	if (len > end - start) {
        		
                start = i - (len - 1) / 2;
                
                end = i + len / 2;
                
            }//end of if statement
        	
        	
        }//end of for loop

        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        
    	while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            
    		left--;
    		
            right++;
        }
    	
        return right - left - 1;
        
    }//end of expandAroundCenter method 
    
}//end of class 
