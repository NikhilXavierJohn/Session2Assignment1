import java.util.Scanner;

public class Voteeligibility {
	static int age = 18;
	int newage;
	int newage1;
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		 Voteeligibility ve = new Voteeligibility();
		 ve.eligibiltychecker();
	}
	
	@SuppressWarnings("resource")
	public static void eligibiltychecker() {
		Scanner vote = new Scanner(System.in);
		System.out.println("Vote Eligibility checker");
		System.out.print("Enter your current age : ");
		int newage = vote.nextInt();
		if (newage >= age ){
			System.out.println("You are eligible to vote !");
		}
		else {
			int newage1 = age - newage;
			System.out.println("You are not eligible to vote");
			System.out.println("Try again after "+newage1+" years");
			
		}
		
		
		
	}
	

}
