class Cos3rd extends ConsoleProgram {

  /**
  * This program lets you enter two sides of a triangle and the contained angle, and that will use the cosine law to calculate the third side 
  * @author: A. Emmanuel-Singh
  */
  
  public void run() {
    
    // Declare Variable 
    double dblSide1;
    double dblSide2;
    double dblAngle;
    double dblSide3;

    // Get value 
    dblSide1 = readDouble("Input the lenth of the the first side of the triangle: ");
    dblSide2 = readDouble("Input the length of the second side of the triangle: ");
    dblAngle = readDouble("Enter the degree of the angle in degrees: ");

    // Calaculate 
    dblAngle = Math.toRadians(dblAngle);
    dblSide3 = Math.sqrt((dblSide1 * dblSide1) + (dblSide2 * dblSide2) - (2 * dblSide1 * dblSide2 * Math.cos(dblAngle)));
   
    // Output
    System.out.println("The length of the thrid side of the triagle is " + dblSide3);

  }
}