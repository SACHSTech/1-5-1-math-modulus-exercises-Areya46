class FtoC extends ConsoleProgram {

  /**
  * This code lets the user enter a degree measure in Fahrenheit, and that prints the result in Celsius degree measure
  * @author: A. Emmanuel-Singh 
  */
  
  public void run() {
    
    // Declare Variables
    double dblF;
    double dblC;

    // Get values 
    dblF = readDouble("What is the temperature in Fahrenheit? ");

    // Calculations 
    dblC = ((dblF - 32) * 5 / 9);

    // Output
    System.out.println("The temperature in Celsius is " + dblC);

  }
}