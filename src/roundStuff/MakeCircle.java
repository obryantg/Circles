package roundStuff;

import java.util.Scanner;

import shapes.Circle;

public class MakeCircle {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Validator val = new Validator();
		String reply = "";
		System.out.println("Lets make a Circle!");
		System.out.println();
		
		//fix while statement
		while (!reply.equalsIgnoreCase("n")){
		System.out.print("Enter radius: ");
		//enter validator bruh. 
		System.out.println();
		double input = val.getValidDouble(1, Double.MAX_VALUE);
		
		
		Circle c1 = new Circle(input);
		System.out.println("Circumference: " + c1.getFormattedCircumference());		
		System.out.println("Area: " + c1.getFormattedArea());
		System.out.println();
		System.out.println("Continue? y/n");
		reply = readValidString("y", "n");
		} 
		System.out.println("Bye Bruh.");
				
		sc.close();
	}
	public static String readValidString(String x, String y){
		String input = sc.nextLine();
		while (!(input.equalsIgnoreCase(x) || input.equalsIgnoreCase(y))){
			
			System.out.println("Use your peekholes and follow directions (y/n):");
			input=sc.nextLine();
		} 
			return input;
			
	}
}
