
class Notes {
	public static void main(String[] args) {

		int num;
		num = -1;

		int num2 = 0; //default value given to num2

		if (num < 10 && num > 0) {
			//any code written in an if statement is skipped when that condition is false
			System.out.println(num + " was less than 10");
			num2 = 9; 
			//a variable created in an if statement, can only be used inside that if statement
		}
		// System.out.println();
		//YOU CANNOT CODE BETWEEN AN IF AND AN ELSE
		// num >= 10 || num <= 0
		else { //gets skipped when the if statement was true
			System.out.println("This runs when the condition is false");
		}

		System.out.println(num2);
		System.out.println("after the if");



	}
}
