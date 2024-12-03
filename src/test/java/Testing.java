import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testing {

	@Test
    public void testIsMagicSquare() {
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

        assertTrue(MagicSquare.isMagicSquare(magicSquare));
        assertFalse(MagicSquare.isMagicSquare(nonMagicSquare));
    
	}//end of testIsMagicSquare
	
	@Test
    public void testCountUniqueSubarrays() {
        int[] arr = {1, 2, 3, 4, 2};
        assertEquals(2, UniqueSubarrays.countUniqueSubarrays(arr, 6));
        assertEquals(0, UniqueSubarrays.countUniqueSubarrays(arr, 20));
    }//end of test
	
	
	@Test
    public void testFindLongestPalindrome() {
		
        assertEquals("aba", LongestPalindromicSubstring.findLongestPalindrome("babad"));
        assertEquals("bb", LongestPalindromicSubstring.findLongestPalindrome("cbbd"));
        assertEquals("a", LongestPalindromicSubstring.findLongestPalindrome("a"));
        assertEquals("", LongestPalindromicSubstring.findLongestPalindrome(""));
    
	}//end of testFindLongestPalindrome

}//end of class
