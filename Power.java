class Power extends ConsoleProgram {

  /**
  * This program lets you enter a base and an exponent and will give you the answer
  * @author:
  */
  
  public void run() {
    
    // Declare Variables
    double dblA;
    double dblB;
    double dblFinalNumber;

    // Input from Users
    dblA = readInt("Enter the base of the exponent: ");
    dblB = readInt("Enter the exponent: ");

    // Calulations 
    dblFinalNumber = Math.pow(dblA, dblB);

    // Output
    System.out.println(dblA + " to the power of " + dblB + " is " + dblFinalNumber);
    
  }
}