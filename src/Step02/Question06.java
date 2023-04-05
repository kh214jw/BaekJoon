package Step02;

import java.util.Scanner;

//#2525
public class Question06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();
        
        m = m + c;
        
        if( m >= 60 ){
            int i = m / 60;
            h = h + i;
            m = m % 60;
            
            if(h > 24){
                h = h % 24;
                System.out.println(h + " " + m);
            }else if(h == 24){
                h = 0;
                System.out.println(h + " " + m);
            }else{
                System.out.println(h + " " + m); 
            }
        }else{
            System.out.println(h + " " + m);
        }

	}

}
