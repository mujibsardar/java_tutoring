import java.util.Scanner;

public class Alphabet2 {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the letter");
		String iL = sc.nextLine();
		if(iL.length() != 1) {
			System.out.println("Please type only one letter");
		} else {
//			char single_char = iL.charAt(0);
			if(iL=="a" || iL=="o" || iL=="i" || iL=="u" || iL=="y" || iL.equalsIgnoreCase("e")){
				System.out.println("The inputted letter is a vowel");
				}else if(iL=="b" || iL=="c" || iL=="d" || iL=="f" || iL=="g" || iL=="h" || iL=="j" ||
				iL=="k" || iL=="l" || iL=="m" || iL=="n" || iL=="p" || iL=="q" || 
				iL=="r" || iL=="s" || iL=="t" || iL=="v" || iL=="w" || iL=="x" || iL=="z") {
					System.out.println("The inputted letter is Consonant");
				}
		}
//		String foo = "a"; 
//		Comment Added
//		System.out.println(foo == "a");
	}

}