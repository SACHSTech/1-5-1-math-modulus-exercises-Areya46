class Hours extends ConsoleProgram {

  /**
  * This program lets you enter a number of hours, and  converts it to day and hours.
  * @author: A. Emmanuel-Singh
  */
  
  public void run() {
    
    // Declare variables
    int intHours;
    int intDays;
    int intMod;

    // Input form users
    intHours = readInt("Enter the number of hours you would like to convert to days: ");

    // Calculations 
    intDays = (intHours / 24);
    intMod = (intHours % 24);

    // Output
    System.out.println( intHours + " hours is " + intDays + " and " + intMod + " hours."); 

  }
}