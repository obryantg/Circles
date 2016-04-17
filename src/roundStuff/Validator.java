package roundStuff;

import java.util.Scanner;

public class Validator {
		static Scanner sc = new Scanner (System.in);
		public Validator (){
		}
		
		public double readValidDouble()
		{
			while (!sc.hasNextDouble()){
				sc.nextLine();
				System.out.println("Yoooooo try again: ");
			}
			double x = sc.nextDouble();
			sc.nextLine();
			return x;
			}
		public double getValidDouble(double min, double max)
		{
			double i = readValidDouble();
			while (i < min || i > max)
			{
				i = readValidDouble();
				System.out.println("Please put a number within range!");
				
			}
			return i;
		}
		}

