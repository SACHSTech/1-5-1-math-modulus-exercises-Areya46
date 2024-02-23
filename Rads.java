class Rads extends ConsoleProgram {

  /**
  * This program converts degree to radients once given user input
  * @author:
  */
  
  public void run() {
    //Declare Variables 
    double dblRadians;
    double dblDegrees;

    // Calaculate conversion 
    dblDegrees = readDouble("Input a measurement for degrees: ");
    dblRadians = Math.toRadians(dblDegrees);

    // Output Radians
    System.out.print("A degree value of " + dblDegrees + " is equal to a radians value of " + dblRadians);
    
  }
}