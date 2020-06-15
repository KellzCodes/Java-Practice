public class GreaterLessThan {
	public static void main(String[] args) {   
		double creditsEarned = 176.5;
    double creditsOfSeminar = 8;
    double creditsToGraduate = 180;
    // Print whether credits earned greater than credits to graduate
    System.out.println(creditsEarned > creditsToGraduate);
    // declare varable that holds the amount of credits earned after taking a seminar
    double creditsAfterSeminar = creditsEarned + creditsOfSeminar;

    // Print out whether credits To Graduate is less than credits After Seminar.
    System.out.println(creditsToGraduate < creditsAfterSeminar);
	}
}