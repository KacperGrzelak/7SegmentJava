/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segment;

/**
 *
 * @author dell
 */
public class Binary {
    
    
    public static final boolean[][] CLOCKBIN = 
		{
			 new boolean[] { true, true, true, true, true, true, false, false }, 			// 0
			 new boolean[] { false, true, true, false, false, false, false, false }, 		// 1	
			 new boolean[] { true, true, false, true, true, false, true, false },			// 2
			 new boolean[] { true, true, true, true, false, false, true, false },			// 3
			 new boolean[] { false, true, true, false, false, true, true, false },			// 4
			 new boolean[] { true, false, true, true, false, true, true, false },			// 5
			 new boolean[] { true, false, true, true, true, true, true, false },			// 6
			 new boolean[] { true, true, true, false, false, false, false, false },                 // 7
			 new boolean[] { true, true, true, true, true, true, true, false },			// 8
			 new boolean[] { true, true, true, true, false, true, true, false },			// 9
                         
                };
	
	public static int getNthDigit(int number, int base, int n) { return (int) ((number / Math.pow(base, n - 1)) % base); }
        
        public static final boolean[][] LETTERBIN =
        {
                        new boolean[] { true, false, false, true, true, true, true, false },                    // E
                        new boolean[] { true, true, false, false, true, true, false, false },                   // R
                        new boolean[] { false, false, false, false, false, false, true, false },                 // -
                        new boolean[] { false, false, false, false, false, false, false, false }
        };
        public static int getEDigit()
        {
            return 0;
        }
        public static int getRDigit()
        {
            return 1;
        }
        public static int getMDigit()
        {
            return 2;
        }
        public static int getFDigit()
        {
            return 3;
        }
}
