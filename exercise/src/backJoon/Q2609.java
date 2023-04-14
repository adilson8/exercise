package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q2609 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] inputStringArr = br.readLine().split(" ");		
		int num1 = Integer.parseInt(inputStringArr[0]);
		int num2 = Integer.parseInt(inputStringArr[1]);
				
		List<Integer> num1YaksuList = new ArrayList<>();
		for (int i = 1; i <= num1; i++) {
			if(num1 % i ==0){
				num1YaksuList.add(i);
			} 			
		}
		
		List<Integer> num2YaksuList = new ArrayList<>();
		for (int i = 1; i <= num2; i++) {
			if(num2 % i ==0){
				num2YaksuList.add(i);
			} 			
		}
		
		List<Integer> gonyaksuList = new ArrayList<>();
		if (num1YaksuList.size() > num2YaksuList.size()){
			int i = 0;
			for( int num2Yaksu : num2YaksuList) {
				for (int num1Yaksu : num1YaksuList){
					if (num2Yaksu == num1Yaksu) {
						gonyaksuList.add(num2Yaksu);
					}					
					i++;
				}
			}			
		} else {
			int i = 0;
			for( int num1Yaksu : num1YaksuList) {
				for (int num2Yaksu : num2YaksuList){
					if (num1Yaksu == num2Yaksu) {
						gonyaksuList.add(num1Yaksu);
					}					
					i++;
				}
			}
		}
		
		System.out.println(gonyaksuList.get(gonyaksuList.size() -1));
		
		//////////////////////////////////////////////////////////////
		
//		List<Integer> num1BaesuList = new ArrayList<>();
//		List<Integer> num2BaesuList = new ArrayList<>();
//		int biggestGongbaesu = 0;
//		boolean isOver = true;
//		
//		int i = 1;
//		while(isOver){
//			if (num1 > num2) {
//				num1BaesuList.add(num1 * i);
//				num2BaesuList.add(num2 * i);
//				
//				for(int num1Baesu : num1BaesuList){
//					for (int num2Baesu : num2BaesuList){
//						if (num1Baesu == num2Baesu){
//							biggestGongbaesu = num1Baesu;
//							isOver = false;
//						} 
//					}
//				}		
//				
//				i++;
//			} else {
//				num2BaesuList.add(num2 * i);
//				num1BaesuList.add(num1 * i);
//				
//				for(int num2Baesu : num2BaesuList){
//					for (int num1Baesu : num1BaesuList){
//						if (num2Baesu == num1Baesu){
//							biggestGongbaesu = num2Baesu;
//							isOver = false;
//						} 
//					}
//				}
//				
//				i++;												
//			}
//		}
//		
//		System.out.println(biggestGongbaesu);
		
		int biggestGongbaesu = num1 * num2 / gonyaksuList.get(gonyaksuList.size() -1);
		System.out.println(biggestGongbaesu);

	}

}