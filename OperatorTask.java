package day1_Java;

public class OperatorTask {
	public static void main(String[] args) {
		// Arithmetic Operators
		int firstNum = 10;
		int secondNum = 20;

		int  addition         =         firstNum + secondNum;
		int subraction       =         firstNum - secondNum;
		int multiplication   =         firstNum * secondNum;
		int modulo           =         firstNum % secondNum;

		System.out.println(" Arithmetic Operators ");
		System.out.println();

		System.out.println("Addition : " + addition);
		System.out.println("Subraction : " + subraction);
		System.out.println("Multiplication : " + multiplication);
		System.out.println("Modulo : " + modulo);
		System.out.println();

		//  Relational  Operators
		System.out.println(" Relational Operators ");
		System.out.println();
		
		boolean Greaterthan         =     firstNum > secondNum;
		boolean Lessthan            =     firstNum < secondNum;
		boolean GreaterthanOrEqualto =    firstNum >= secondNum;
		boolean LessthanOrEqualto   =     firstNum <= secondNum;
		boolean EqualToo            =     firstNum == secondNum;
		boolean NotEqualto          =     firstNum != secondNum;

		System.out.println("Greaterthan 10 > 20: " + Greaterthan);
		System.out.println("Lessthan 10 < 20: " + Lessthan);
		System.out.println("Greaterthan Or Equal to 10 <= 20: " + GreaterthanOrEqualto);
		System.out.println("Lessthan Or Equal to 10 >= 20: " + LessthanOrEqualto);
		System.out.println("Equal Too 10 == 20: " + (firstNum == secondNum));
		System.out.println("Not Equal to 10 != 20: " + (firstNum != secondNum));

	
	}
}