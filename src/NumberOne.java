import java.util.Scanner;

public class NumberOne {

	public NumberOne() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("input a string to check if the string is palindrom or not :");
		String input;
		input = scan.nextLine();
		
		char[] result = new char[input.length()];
		String answer = "";
		
		for(int i = 0; i < input.length(); i++) {
			answer += input.charAt(input.length()-1-i);
			
		}
		
		
		if(input.equals(answer)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
	}

	public static void main(String[] args) {
		new NumberOne();

	}

}
