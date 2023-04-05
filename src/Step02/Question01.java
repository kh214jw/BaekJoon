package Step02;

import java.util.*;

//#1330
public class Question01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b){
            System.out.println("==");
        }else if(a > b){
            System.out.println(">");
        }else{
            System.out.println("<");
        }

	}

}
