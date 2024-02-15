class AreaSin extends ConsoleProgram {

    /**
  * This program uses the Math.Sin() function to calculate the area of a triangle, given two sides and the contained angle.
  * @author: A. Emmanuel-Singh
  */
  
  public void run() {
    
    // Declare Variables
    int intA;
    int intB;
    double dblC;
    double dblTotalArea;

    // Get values 
    intA = readInt("What is the length of the first side of the triangle? ");
    intB = readInt("What is the length of the second side of the triangle? ");
    dblC = readInt("What is the angle of the triangle? ");

    // Calculations 
    dblTotalArea = (intA * intB * Math.sin(dblC) / 2);

    // Output
    System.out.println("The area is " + dblTotalArea);
  }
}