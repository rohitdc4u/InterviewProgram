package programs3;

public class PrimeNumberDemo {

	public static boolean isPrimeNumber(int num) {

		if (num <= 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void getPrimeNumbers(int num) {
		for (int i = 2; i <= num; i++) {
			if (isPrimeNumber(i))
				System.out.print(i + " ");

		}
		System.out.println();
	}

	public static void getPrimeNumbers1(int num1, int num2) {
		for (int i = num1; i <= num2; i++) {
			if (isPrimeNumber(i))
				System.out.print(i + " ");

		}
		System.out.println();
	}

	public static int findPrime(int num) {
		while (true) {
			boolean isPrime = true;
			num = num + 1;
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;

				}
			}
			if (isPrime)
				return num;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("2 is a prime number " + isPrimeNumber(2));
		// System.out.println("3 is a prime number " + isPrimeNumber(3));
		// System.out.println("10 is a prime number " + isPrimeNumber(10));
		// System.out.println("0 is a prime number " + isPrimeNumber(0));
		//
		// getPrimeNumbers(7);
		// getPrimeNumbers1(10, 20);
		System.out.println(findPrime(11));

	}

}
