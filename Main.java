import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float firstLineSlope, secondLineSlope;
		
		System.out.println("Enter Cords of First Line(x1 y1 x2 y2): ");
		int firstLinex1 = input.nextInt(), firstLiney1 = input.nextInt(),
				firstLinex2 = input.nextInt(),firstLiney2 = input.nextInt();
		System.out.println("Enter Cords of First Line(x1 y1 x2 y2): ");
		int secondLinex1 = input.nextInt(), secondLiney1 = input.nextInt(),
				secondLinex2 = input.nextInt(),secondLiney2 = input.nextInt();
		
		firstLineSlope = (firstLiney2 - firstLiney1) / (firstLinex2 - firstLinex1);
		secondLineSlope = (secondLiney2 - secondLiney1) / (secondLinex2 - secondLinex1);
		System.out.println(firstLineSlope);
		System.out.println(secondLineSlope);
		if(firstLineSlope == secondLineSlope) {
			System.out.println("Paralell");
		}
		else {
			System.out.println("Intersecting");
		}
		if(firstLinex1 == firstLinex2 && secondLinex1 == secondLinex2) {
			System.out.print(" - Both Vertical");
		}
		else if(firstLiney1 == firstLiney2 || secondLiney1 == secondLiney2) {
			System.out.print(" - One Vertical");
		}
		
		input.close();
	}

}
