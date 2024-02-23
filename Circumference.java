class Circumference extends ConsoleProgram {

  /**
  * A program that computes the curumference of a circle given a radius from the user 
  * @author: A. Emmanuel-Singh
  */
  
  public void run() {
    
    // Declare variables
    double dblRadius;
    double dblCircumfrence;

    // Get radious 
    dblRadius = readDouble("Enter the radious: ");

    // Calculate curcumference 
    dblCircumfrence = 2 * Math.PI * dblRadius;

    // Output Results
    System.out.println("The circumfrence of a ciccle with radius " + dblRadius + " is " + dblCircumfrence);
    
  }
}