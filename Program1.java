class Program1 extends ConsoleProgram {

  /**
  * This program les you enter a distance in kilometers and that covertsit into miles
  * @author: A. Emmanuel-Singh
  */
  
  public void run() {
    // Declare variables 
    double dblKm;
    double dblMiles;

    // Input from user 
    dblKm = readDouble("Please enter the distance (in Kilomiters) that you would like to convert into miles: ");

    // Calculations                                                                                                     
    dblMiles = dblKm * 0.621371;

    // Output
    System.out.println(dblKm + " in Miles is " + dblMiles);
    
  }
}
