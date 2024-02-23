class Minutes extends ConsoleProgram {

  /**
  * This code lets you enter a number of hours and convert it into days and hours.
  * @author: A. Emmanuel-Singh
  */
  
  public void run() {
    
    // Declare Variables 
    int intMin;
    int intHours;
    int intDays;
    int intOutputMin;

    // Input from User
    intMin = readInt("Enter the number of minutes you would like converted into Days, Hours, and Minutes: ");

    // Calculations 
    intHours = (intMin / 60);
    intOutputMin = intMin % 60;
    intDays = intHours / 24;
    intHours = intHours % 24;

    // Output
    System.out.println(intMin + " minutes is euqal to " + intDays + ", " + intHours + " and " + intOutputMin);
  }
}