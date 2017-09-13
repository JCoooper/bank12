
public class Savings extends BAccount {
	private double lowestBal;
	private double interest;

	public Savings(double moneys, double timePass, int accT, double lowBal, double inter) {
		super(moneys, timePass, accT);
		lowestBal = lowBal;
		// interest = inter;

		if (getBal() < lowBal) {
			lowBal = getBal();
		}

		interest = 0.05 * lowBal;
	}

	public double getLowestBal() {
		return lowestBal;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterBal(double IB) {
		lowestBal = IB;
	}
}