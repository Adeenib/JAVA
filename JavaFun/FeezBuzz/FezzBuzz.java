public class FezzBuzz{
	
	public static void fizzBuzz(int number){
		
		if(number % 3 == 0){
			System.out.print("Fizz ");
		}
		if(number % 5 == 0){
			System.out.print("Buzz ");
		}
		else if ( number % 3 != 0 &&  number % 5 != 0) {
			System.out.print(number);
		}
		
	}
	public static void main(String[] args){
		fizzBuzz(3);
	}
}