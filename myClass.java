import java.util.Scanner;

public class myClass {

	public static void main(String[] args) {
		String number = "1899001";
		
		
		int evenCount = 0;
		int oddCount = 0;
		for ( int i=0; i < number.length(); i++) {
			System.out.println(" Digit at " + i + " value is: "+ number.charAt(i));
			int remainder = number.charAt(i)%2;
			
			if (remainder == 0) {
				System.out.println(" --- it is an even number");
				evenCount++;
			}
			
			else {
				System.out.println(" --- it is an odd number");
				oddCount++;
			}
		}
		
		System.out.println("Total even numbers: " + evenCount);
		System.out.println("Total odd numbers: " + oddCount);
		
		//System.out.println("Total digites in the number: "+ number.length());
	}

}
