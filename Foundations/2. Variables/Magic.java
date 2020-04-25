public class Magic {
	public static void main(String[] args) {
    /* Create an int variable called myNumber. 
    Set it equal to any integer other than 0. */
    int myNumber = 5; // Original number
    
    /* Create an int variable called stepOne. 
    Set it equal to the original number 
    (myNumber) multiplied by itself. */
    int stepOne = myNumber * myNumber;
    
    /* Create an int variable called stepTwo. 
    Set it equal to the previous result 
    (stepOne) plus the original number 
    (myNumber).*/
    int stepTwo = stepOne + myNumber;
    
    /* Create an int variable called stepThree. 
    Set it equal to the previous result (stepTwo) 
    divided by the original number. */
    int stepThree = stepTwo / myNumber;
    
    /* Create an int variable called stepFour. 
    Set it equal to the previous result (stepThree) 
    plus 17. */
    int stepFour = stepThree + 17;
    
    /* Create an int variable called stepFive. 
    Set it equal to the previous result (stepFour) 
    minus the original number. */
    int stepFive = stepFour - myNumber;
    
    /* Create an int variable called stepSix. 
    Set it equal to the previous result (stepFive) 
    divided by 6. */
    int stepSix = stepFive / 6;
    
    // Print step 6
    System.out.println(stepSix);
	}
}