public class MultAndDivide {
	public static void main(String[] args) {   
		double subtotal = 30;
    double tax = 0.0875;
    // Create variable that holds subtotal plus the product of subtotal and tax.
    double total = subtotal + (subtotal * tax);
    // print total
    System.out.println(total);
    // Create Variable that holds total divided by 4.
    double perPerson = total / 4;
    // print perPerson
    System.out.println(perPerson);
	}
}