
public class BAccount { // PAR
	private double bal;
	private double timeMonths;
	private int accTy;

	public BAccount(double moneys, double timePass, int accT) {
		bal = moneys;
		timeMonths = timePass;
		accTy = accT;
	}

	public double getBal() {
		return bal;
	}

	public double getTimeMonths() {
		return timeMonths;
	}

	public int getAccType() {
		return accTy;
	}

	public void setBal(double bal2) {
		bal = bal2;
	}

}