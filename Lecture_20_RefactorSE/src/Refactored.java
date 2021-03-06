import java.util.Enumeration;
import helper.MyCollection;
import helper.Order;

public class Refactored {
	private MyCollection _orders = new MyCollection();
	private String _name = "Customer Name";
	
	void printOwing() {
		Enumeration e = _orders.elements();
		double outstanding = 0.0;
		
		// print banner
		printBanner();
		
		// calculate outstanding 
		outstanding = calculateOutstanding(e, outstanding);
		
		// print details
		printDetails(outstanding);
	}

	public double calculateOutstanding(Enumeration e, double outstanding) {
		while (e.hasMoreElements()) {
			Order each = (Order) e.nextElement();
			outstanding += each.getAmount();
		}
		return outstanding;
	}

	public void printDetails(double outstanding) {
		System.out.println("name: " + _name);
		System.out.println("amount: " + outstanding);
	}

	public void printBanner() {
		System.out.println("**************************");
		System.out.println("***** Customer Owes ******");
		System.out.println("**************************");
	}
		
}
