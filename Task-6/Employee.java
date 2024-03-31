
import java.util.*;

public class Employee {

	public static void main(String[] args) {
		
		Scanner sin = new Scanner(System.in);
		
		System.out.println("Enter the joined year");
		int jy = sin.nextInt();
		sin.nextLine();
		
		System.out.println("Enter the present year");
		int py = sin.nextInt();
		
		if(py-jy>5) {
			System.out.println("An bonus of Rs5000/ is given");
		}
		else if(py-jy>=3 && py-jy<=5) {
			System.out.println("An bonus of Rs3000/ is given");
		}
		else {
			System.out.println("No bonus is given");
		}
	}

}