package programmers.lv2;

public class MatrixMultiplication {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/12949
	public static void main (String[] args){
		
		// anwer = {{22, 22, 11}, {36, 28, 18}, {29, 20, 14}}
//		int[][] arr1 = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
//		int[][] arr2 = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};
		
		// anwer = {
//			{15, 15}, 
//			{15, 15}, 
//			{15, 15}
//			}
		
		int[][] arr1 = {
				{1, 4}, 
				{3, 2}, 
				{4, 1}
				};
		
		int[][] arr2 = {
				{3, 3}, 
				{3, 3}
				};
		
//		C[0][0] = (1×3) + (4×3) = 3 + 12 = 15
//		C[0][1] = (1×3) + (4×3) = 3 + 12 = 15
//		C[1][0] = (3×3) + (2×3) = 9 + 6  = 15
//		C[1][1] = (3×3) + (2×3) = 9 + 6  = 15
//		C[2][0] = (4×3) + (1×3) = 12 + 3 = 15
//		C[2][1] = (4×3) + (1×3) = 12 + 3 = 15
		
		
		for (int i = 0; i < arr1.length; i++) {            // 행
		    for (int j = 0; j < arr2[0].length; j++) {     // 열
		    	System.out.println("["+i+"]" + "["+j+"]" );
		    }
		}
		    
		// 이렇게 하면 4중포문... 이건 진짜 아님
//		for(int i = 0; i < arr1.length; i++){
//			for (int j = 0; j < arr1[i].length; j++){
//				
//				for(int i2 = 0; i2 < arr2.length; i2++){
//					for (int j2 = 0; j2 < arr2[i2].length; j2++){
//						
//					}
//				}
//			}
//		}
		
	}

}
