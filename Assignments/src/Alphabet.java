import java.util.Scanner;

public class Alphabet {
	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Please enter the letter");
//		char ch = sc.next().charAt(0);
		String inputString = sc.next(); 
		if(inputString.length() != 1)
			System.out.println("Error");
		else {
			char ch = inputString.charAt(0);
			if(ch=='a' || ch=='o' || ch=='i' || ch=='u' || ch=='y' || ch=='e') {
				System.out.println("The inputted letter is a vowel");
				}else if(ch=='b' || ch=='c' || ch=='d' || ch=='f' || ch=='g' || ch=='h' || ch=='j' ||
				ch=='k' || ch=='l' || ch=='m' || ch=='n' || ch=='p' || ch=='q' || 
				ch=='r' || ch=='s' || ch=='t' || ch=='v' || ch=='w' || ch=='x' || ch=='z') {
				System.out.println("The inputted letter is Consonant");
				}else {
				System.out.println("Error");
				}
		}
		
		
		sc.close();
	}

}