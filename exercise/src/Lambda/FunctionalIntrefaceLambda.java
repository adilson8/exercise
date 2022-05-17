package Lambda;

public class FunctionalIntrefaceLambda {
	
	public static void main (String[] args) {
		
//		AddFunctionalIntreface afi = (x, y) -> { int result = x +y; return result; };
//		AddFunctionalIntreface afi = (x, y) -> { return x +y; };
		AddFunctionalIntreface afi = (x, y) -> x + y; 
		System.out.println(afi.add(10, 3));
		
//		MulFuntionalInterface mfi = (x, y) -> {int result = x * y; return result; };
		MulFuntionalInterface mfi = (x, y) -> x * y;
		System.out.println(mfi.mul(10, 3));
		
//		SubFunctionalInterface sfi = (x, y) -> {int result = x - y; return result; };
		SubFunctionalInterface sfi = (x, y) -> x - y;
		System.out.println(sfi.sub(10, 3));
		
		
		PrimeNumberFunctionalInterface pnfi;
//		pnfi = (x) -> {
		pnfi = x -> {
			
			if (x==1) {
				return false;
			} // if
			
			for (int i = 2; i <= x / 2; i++) {
				if ( x % i == 0 ) {
					return false;
				} // if
			} // for
			return true;					
		};		
		System.out.println(pnfi.isPrimeNumber(10));
		System.out.println(pnfi.isPrimeNumber(3));
		
	} // main

} // end class
