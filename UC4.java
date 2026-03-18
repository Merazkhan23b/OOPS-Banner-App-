/**
 * OOPSBannerApp UC4 - Render OOPS as Banner using String Array and Loop
 * This use case improves upon UC3 by using a String array to store banner lines
 * and iterating through them with a for-each loop, eliminating hardcoded print
 * statements and improving modularity and reusability.
 *
 * @author Developer
 * @version 4
 */

// Extend the user story 3 to further develop the OOPS Banner Application
// by using String arrays to hold banner lines and printing them in a loop.
// This use case improves upon UC3 by using a String array to store banner lines
// and iterating through them with a for-each loop, eliminating hardcoded print
// statements and improving modularity and reusability.


public class UC4 {

    // Main method to run the banner display
    public static void main(String[] args) {
		//Define array to store bannner lines
	   String[] lines = new String[9];
	   //Populate the array using String.join()
	   
        lines[0] = String.join(" ","  ***  " , "   ***  " , " ****** " , "       ***** ");
        lines[1] = String.join(" "," ** ** " , "  ** ** " , " **    ** " , "   **    ");
        lines[2] = String.join(" ","**   **" , " **   **" , " **     ** " , " **    ");
        lines[3] = String.join(" ","**   **" , " **   **" , " **    ** " , "   **    ");
        lines[4] = String.join(" ","**   **" , " **   **" , " ****** " , "       ***    ");
        lines[5] = String.join(" ","**   **" , " **   **" , " **     " , "          **  ");
        lines[6] = String.join(" ","**   **" , " **   **" , " **     " , "           ** ");
        lines[7] = String.join(" "," ** ** " , "  ** ** " , " **     " , "          ** ");
        lines[8] = String.join(" ","  ***  " , "   ***  " , " **     " , "      ***** ");
   
   //Then use for-each loop to print each line 
   for (String line : lines){
     System.out.println(line);
   }
   }
}