public class Main {
	
    public static void main(String[] args) {
        
    	
        int[][] magicSquare = {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 8}
        };
        
        
        int[][] nonMagicSquare = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Magic Square Test:");
        System.out.println("Is magicSquare a magic square? " + MagicSquare.isMagicSquare(magicSquare));
        System.out.println("Is nonMagicSquare a magic square? " + MagicSquare.isMagicSquare(nonMagicSquare));

        
        int[] array = {1, 2, 3, 4, 2};
        int targetSum = 6;
        System.out.println("\nUnique Subarrays Test:");
        System.out.println("Number of unique subarrays with sum " + targetSum + ": " +
                UniqueSubarrays.countUniqueSubarrays(array, targetSum));

        
        String inputString1 = "babad";
        String inputString2 = "cbbd";
        
        System.out.println("\nLongest Palindromic Substring Test:");
        System.out.println("Longest palindrome in \"" + inputString1 + "\": " +
                LongestPalindromicSubstring.findLongestPalindrome(inputString1));
        
        System.out.println("Longest palindrome in \"" + inputString2 + "\": " +
                LongestPalindromicSubstring.findLongestPalindrome(inputString2));
    
    }//end of main method 
    
    
}//end of Main class
