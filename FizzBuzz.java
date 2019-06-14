public class FizzBuzz {
	public String fizzBuzz(int number) {

		String string = "";
		if ((number % 3 == 0) && (number % 5 == 0)) {

			string = "FizzBuzz";
		} else {

			if (number % 3 == 0) {
				string = "Fizz";
			}

			if (number % 5 == 0) {
				string = "Buzz";
			}

			if (number % 2 == 0) {

				string = Integer.toString(number);

			}

		}
		return string;
	}
}
