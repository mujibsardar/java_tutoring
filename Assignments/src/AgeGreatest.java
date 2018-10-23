import java.util.Scanner;

public class AgeGreatest {
	public int getGreatest(int num1, int num2, int num3) {
		if(num1>num2) {
			if (num1>num3) {
				return num1;
		}
		} else if (num2 > num3){
			return num2;
		} return num3;
	}
	
 public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 
	 AgeGreatest foo = new AgeGreatest();
	 System.out.println("Enter your 1st numer");
	 int n1= scan.nextInt();
	 
	 System.out.println("Enter the 2nd number");
	 int n2 = scan.nextInt();
	 
	 System.out.println("Enter the 3rd number");
	 int n3 = scan.nextInt();
	 
	 System.out.println("The greatest number is: "+ foo.getGreatest(n1, n2, n3));
	 scan.close();
//	 getGreatest(3,4,5);
	 
 }
}
