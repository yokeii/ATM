package ATM_Project;

import java.util.*;

public class ATM_Compleate_Project {

	public static void main(String[] args) {

		int pin = 1234;
		int balance = 10000;

		int AddAmount = 0;
		int TakeAmount = 0;

		String name;

		Scanner scanner = new Scanner(System.in);

		// we have to take an input by an user

		System.out.println("Enter Your Pin Number");

		int password = scanner.nextInt();
		if (password == pin) {
			System.out.println("Enter Your Name");
			name = scanner.next();
			System.out.println("welcome  " + name);

			while (true) {

				System.out.println("Press 1 to check your Balance");
				System.out.println("Press 2 to add Amount");
				System.out.println("Press 3 to take Amount");
				System.out.println("press 4 to take Resipt");
				System.out.println("Press 5 to Exit");

				int opt = scanner.nextInt();

				switch (opt) {

				case 1:
					System.out.println("your current balance is" + balance);
					break;

				case 2:
					System.out.println("How much amount did you want to ADD to your Account");
					AddAmount = scanner.nextInt();
					System.out.println("Successfully credited");
					balance = AddAmount + balance;

					break;

				case 3:
					System.out.println("How much amount did you want to take amount");
					TakeAmount = scanner.nextInt();
					if (TakeAmount > balance) {

						System.out.println("your balance is insufficient balance");
						System.out.println("Try less than yur available balance");
					} else {
						System.out.println("successfully taken");
						balance = balance - TakeAmount;

					}
					break;

				case 4:

					System.out.println("Welcome to All is One mini ATM");
					System.out.println("Available balance is  " + balance);
					System.out.println("Amount Deposited  " + AddAmount);
					System.out.println("Amount taken  " + TakeAmount);
					System.out.println("Thanks for Coming");

					break;
			
				}
				if (opt == 5) {
					System.out.println("Thankyou");
					break;
				}
				

			}

		} else {
			System.out.println("Worng pin Number");
		}

	}

}
