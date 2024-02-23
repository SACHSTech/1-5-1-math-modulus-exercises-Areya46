class Power extends ConsoleProgram {

  /**
  * This program lets you enter a base and an exponent and will give you the answer
  * @author:
  */
  
  public void run() {
    
    // Declare Variables
    double dblBase;
    double dblExponentt;
    double dblFinalNumber;

    // Input from users
    dblBase = readInt("Enter the base of the exponent: ");
    dblExponentt = readInt("Enter the exponent: ");

    // Calculate the Final Number 
    dblFinalNumber = Math.pow(dblBase, dblExponentt);

    // Output to user
    System.out.println(dblBase + " to the power of " + dblExponentt + " is " + dblFinalNumber);
    
  }
}