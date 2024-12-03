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

}//end of class
