
public class Commission extends Hourly {
	
	private double total;
	double commrate;
	public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double comrate) {
		super(eName, eAddress, ePhone, socSecNumber, rate, comrate);
		commrate = comrate;
		total = 0;
	}
	
	public void addSales (double totalSales) {
		total += totalSales;
	}
	public double pay() {
		double payment = super.pay();
		payment += total*commrate;
		return payment;
	}
	
	public String toString() {
		String result = super.toString();
		result += "\nsale: " + total;
		return result;
	}

}
