package backJoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2501 {
   
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String inputStr = br.readLine();
      // Arrays.asList : 크기가 변하지 않음, .add 불가 
      List<String> inputStrList = Arrays.asList( inputStr.split(" "));
            
      int N = Integer.parseInt(inputStrList.get(0));
      int K = Integer.parseInt(inputStrList.get(1));
            
//      Scanner sc = new Scanner(System.in);      
//      int N = sc.nextInt();
//      int K = sc.nextInt();

      // new ArrayList<>() : 크기 변할 수 있음, .add 가능      
      List<Integer> divisorList = new ArrayList<>();
      for (int i = 1; i <= N; i++){
         
         int remainder = N % i;         
         if(remainder == 0){
            divisorList.add(i);
         }
      }
      
      if(divisorList.size() < K){
         System.out.println(0);
      } else {
         System.out.println(divisorList.get(K-1));
      }
      
   }
}