

import java.util.*;

public class Division {

	public static void main(String[] args) {
	
		Scanner sin = new Scanner(System.in);
		
		System.out.println("Enter a number:.....");
		int number = sin.nextInt();
		sin.nextLine();
		
		int s1 = number%7;
		int s2 = number%13;
		
		if((s1==0) && (s2==0)){
			System.out.println("The quotients when divided by 7 and 13 are :"+number/7+" "+number/13);
			System.out.println("The remainder when divided by 7 and 13 are :"+number%7+" "+number%13);
			System.out.println("The number is divisible by  both the numbers");
		}else if(s1==0){
			System.out.println("The number is divisible by 7");
		}else if(s2==0) {
			System.out.println("The number is divisible by 13");
		}else {
			System.out.println("Not divisble");
		}
	}

}