
import javax.lang.model.util.ElementScanner14;

// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operations
	    System.out.println(plus(2,3));   // 2 + 3
	    System.out.println(minus(7,2));  // 7 - 2
   		System.out.println(minus(2,7));  // 2 - 7
 		System.out.println(times(3,4));  // 3 * 4
   		System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
   		System.out.println(pow(5,3));      // 5^3
   		System.out.println(pow(3,5));      // 3^5
   		System.out.println(div(12,3));   // 12 / 3    
   		System.out.println(div(5,5));    // 5 / 5  
   		System.out.println(div(25,7));   // 25 / 7
   		System.out.println(mod(25,7));   // 25 % 7
   		System.out.println(mod(120,6));  // 120 % 6    
   		System.out.println(sqrt(25));
		System.out.println(sqrt(10000));
   		System.out.println(sqrt(76123));
	}  

	// Returns x1 + x2
	public static int plus(int x1, int x2) 
		{
			if (x2 >=0)
				{
				for (int i=0; i<x2 ; i++)
						{
							x1 ++;
						}
		}
		else 
			{
			for (int i=0; i>x2 ; i--)
				{
					x1 --;
				}
		}
		return x1;
	}
	// Returns x1 - x2
	public static int minus(int x1, int x2) 
	{
		if (x2 >=0)
	{
		for (int i=0; i<x2 ; i++)
			{
				x1 --;
			}
		}
		else 
			{
			for (int i=0; i>x2 ; i--)
			{
				x1 ++;
			}
		}
		return x1;
		}

	// Returns x1 * x2
	public static int times(int x1, int x2) 
	{	
		int y = 0;
		if(x1==0 || x2==0)
			{	
				y = 0;
			}
			if (x2 > 0) 
				{ 
					 for (int i = 0; i < x2; i++) 
						{
						 y = plus(y, x1);
						}
					} else { 
        
        for (int i = 0; i > x2; i--) 
			{
            y = minus(y, x1);
		}
    }
    return y;
}
	// Returns x^n (for n >= 0)
	public static int pow(int x, int n)
	{
			int y = x;
			if (n==0)
			{
			y =1;  
			}
			else 
			{
				for (int i = 1; i < n; i++) {
					y = times(y, x);
				}
			}
			return y ;
		}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2)
	{
    if (x2 == 0) {
        return 0;
    }
	int count = 0; 
    int result = 0; 
    
    boolean resultIsNegative = false;
    if ((x1 < 0 && x2 > 0) || (x1 > 0 && x2 < 0)) {
        resultIsNegative = true;
    }
	int x1_abs = x1;
    if (x1 < 0) {
        x1_abs = minus(0, x1);
    }
    int x2_abs = x2;
    if (x2 < 0) {
        x2_abs = minus(0, x2);
    }
    while (x1_abs >= count) {
        count = plus(count, x2_abs);
        result = plus(result, 1); 
    }       
    if (x1_abs != count) {
        result = minus(result, 1);
    } 
    if (resultIsNegative) {
        return minus(0, result);
    } else {
        return result;
    }
}
	// Returns x1 % x2
	public static int mod(int x1, int x2) 
	{
        if (x2 == 0) {
           System.out.println("Division by zero");
        }
        int q = div(x1, x2); 
        int y = minus(x1, times(q, x2)); 
        return y;
    }

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) 
	{
    int y = x;
		for (int i = 1; y >= i; i++) 
			{	
				y = div(x, i);
			}
		return y;
	}	  	  
}



