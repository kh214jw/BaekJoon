package Step02;

import java.util.*;

//#2753
public class Question03 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        
        int a = y % 4;
        int b = y % 100;
        int c = y % 400;

        if(a == 0 && b != 0){
            System.out.println(1);
        }else if(c == 0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
	}
}
