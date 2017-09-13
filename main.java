
import java.util.ArrayList;
import java.util.Scanner;
//------------------------------------------------------------------------------

class main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double money;
		int acc;
		int accType;
		String Cacc;
		String Cacc2;
		String Cacc3;
		double numsDoub;
		int numsint;

		double inter;
		int withs;

		double doll;
		double timeP;

		// --saving--
		double lowmoney;
		double intreovertime = 0;
		// ------

		// --checking--
		int acT;
		int wi = 0;
		// -----

		boolean q = false;

		ArrayList<BAccount> index = new ArrayList<BAccount>();
		index.add(new BAccount(1000, 2, 0));// 0
		index.add(new Checking(100, 2, 1, wi));// 1
		index.add(new Savings(10, 2, 0, 9, 4));// 2

		System.out.println("Create New Account?  Y or N: ");
		Cacc = s.nextLine();

		if (Cacc.equals("N")) {
			System.out.println("Please Press 'Enter' Once More");
			Cacc = s.nextLine();
			q = true;

		} else if (Cacc.equals("Y")) {
			System.out.println("Checking or Savings?  C(1) or S(0): ");
			Cacc2 = s.nextLine();

			if (Cacc2.equals("C")) { // CHECKING
				System.out.println("Enter Money in Account: ");
				numsDoub = s.nextDouble();
				doll = numsDoub;

				System.out.println("Enter Time Open: ");
				numsDoub = s.nextDouble();
				timeP = numsDoub;

				System.out.println("Enter Account type: ");
				numsint = s.nextInt();
				acT = numsint;

				System.out.println("Enter Amount of Withdrawls: "); // no need set wi to 0
				numsint = s.nextInt();
				wi = numsint;

				index.add(new Checking(doll, timeP, acT, wi));

				System.out.println(index.get(2).getBal() + " , " + index.get(2).getAccType() + " , " // show acc num
						+ index.get(2).getTimeMonths());
				q = true;

			} else if (Cacc2.equals("S")) { // SAVING
				System.out.println("Enter Money in Account: ");
				numsDoub = s.nextDouble();
				doll = numsDoub;

				System.out.println("Enter Time Open: ");
				numsDoub = s.nextDouble();
				timeP = numsDoub;

				System.out.println("Enter Account type: ");
				numsint = s.nextInt();
				acT = numsint;

				System.out.println("Enter lowest Bal : ");
				numsint = s.nextInt();
				lowmoney = numsint;

				index.add(new Savings(doll, timeP, acT, lowmoney, intreovertime));
				System.out.println(index.get(2).getBal() + " , " + index.get(2).getAccType() + " , "
						+ index.get(2).getTimeMonths());
				q = true;
			}
		}

		// Checking check = new Checking(0, 0, 0, 0);

		// accType = acc.getAccType();
		String input;
		System.out.println("Enter account number: ");
		acc = s.nextInt();
		// here

		accType = index.get(acc).getAccType();

		while (q == true) { // ATM mode

			System.out.println(
					"Enter D if you want to make a deposit, W for Withdrawal, M to reset the month, or Q to quit");
			input = s.next();

			if (input.equals("D")) {
				System.out.println("Enter The Money: ");
				money = s.nextInt();
				index.get(acc).setBal(index.get(acc).getBal() + money);
				System.out.println(index.get(acc).getBal());

			} else if (input.equals("W")) {

				if (accType == 1) { // checking
					System.out.println("Enter withdraw amount: ");
					money = s.nextInt();
					index.get(acc).setBal(index.get(acc).getBal() - money);// stand with

					((Checking) index.get(acc)).setWit(wi++);

					if (wi > 3) {
						index.get(acc).setBal(index.get(acc).getBal() - 1); // HERE
					}

					withs = 3 - wi;
					System.out.println(index.get(acc).getBal());
					System.out.println(withs + " Withdrawls Before A Fee");

				} else if (accType != 1) {
					System.out.println("Enter withdraw amount: ");
					money = s.nextInt();
					index.get(acc).setBal(index.get(acc).getBal() - money);
					System.out.println(index.get(acc).getBal());
				}

			} else if (input.equals("M")) {
				System.out.println(accType);
				if (accType != 1) {
					inter = ((Savings) index.get(acc)).getLowestBal();
					((Savings) index.get(acc)).setInterBal(inter);
					System.out.println(((Savings) index.get(acc)).getLowestBal());
					System.out.println("hi");
				} else if (accType == 1) { // check
					wi = 1;
					// System.out.println(wi);
				}
			} else if (input.equals("Q")) {
				System.out.println("Thank You For Using This ATM");
				q = false;
			}

			// index.get(acc)
			// with = with + 1;// here
			/*
			 * if (withd > 3) {// here index.get(acc).setBal(index.get(acc).getBal() - 1); }
			 * if (index.get(acc).get)
			 * 
			 * System.out.println(index.get(acc).getBal()); System.out.println(withd);
			 * 
			 * }
			 */

		}
	}
}

/*
 * import java.util.Scanner;
 * //---------------------------------------------------------------------------
 * ---
 * 
 * class main { public static void main(String[] args) { Scanner s = new
 * Scanner(System.in);
 * 
 * double money; double acc;
 * 
 * BAccount acc1 = new BAccount(0, 2, 001);
 * 
 * boolean q = true; String input;
 * System.out.println("Enter da moneyz account number"); acc = s.nextInt();
 * while (q == true) { System.out.println(
 * "Enter D if you want to make a deposit, W for Withdrawal, M to reset the month, or Q to quit"
 * ); input = s.nextLine();
 * 
 * if (input.equals("D")) { System.out.println("Enter da moneyz"); money =
 * s.nextInt();
 * 
 * acc1.setBal(acc1.getBal() + money);
 * 
 * System.out.println(acc1.getBal());
 * 
 * } else if (input.equals("W")) {
 * 
 * }
 * 
 * } } }
 */