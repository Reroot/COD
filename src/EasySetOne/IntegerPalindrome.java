package EasySetOne;
//Write a method that checks if a given integer is a palindrome - without allocating additional heap space
//Examples:
//-1 ==> false
//0 ==> true
//1221 ==> true

//The key here is to use % and / operators to reverse the input and then simply compare it with its original form

//1. Initialize a variable called num to the input.
//
//2. Iterate till num > 0.
//
//3. In each iteration, calculate the remainder as num % 10
//
//4. Reverse number as reverse = reverse * 10 + remainder.
//
//5. Decrement num as num/10.
//
//6. At the end of the loop, compare the reverse number with the input. If they match, return true else, false.

public class IntegerPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
