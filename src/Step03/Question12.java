package Step03;

import java.util.Scanner;

//#10951
public class Question12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      
	      while(true){
	        if(sc.hasNext()){
	            int a = sc.nextInt();
	            int b = sc.nextInt();
	            sc.nextLine();
	            
	            System.out.println( a + b ); 
	        }else{
	            break;
	        }
	      }
	}

}
