package exercise;

public class FunctionalIntrefaceLambda {
	
	public static void main (String[] args) {
		
		AddFunctionalIntreface afi = (x, y) -> { int result = x +y; return result; };
		System.out.println(afi.add(5, 2));
		
		MulFuntionalInterface mfi = (x, y) -> {int result = x * y; return result; };
		System.out.println(mfi.mul(5, 2));
		
		SubFunctionalInterface sfi = (x, y) -> {int result = x - y; return result; };
		System.out.println(sfi.sub(5, 2));
		
		PrimeNumberFunctionalInterface pnfi;
		
		pnfi = (x) -> {
			for (int i = 2; i <= x / 2; i++) {
				if ( x % i == 0 ) {
					return false;
				} // if
			} // for			
			return true;					
		};		
		System.out.println(pnfi.isPrimeNumber(14));
		
	} // main

} // end class
