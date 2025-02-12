
class Notes {
	public static void main(String[] args) {

		//if statement

		int num;
		num = 5;

		int num3 = 0;//setup a default value for the variable
		
		if (num < 10) {
			System.out.println(num + " was printed becuase if was true.");
			num3 = 5;
			int num2 = 9; //a variable created in an if statement, only exists inside that if statement
			//this is the case for any curly brackets
		}
		//code cannot be written here.  Your program will crash
		else { //when the condition(s) above is false
			//num >= 10
			System.out.println(num + " was printed becuase if was false.");
		}

		// System.out.println(num2);
		System.out.println(num3);

	}
}
