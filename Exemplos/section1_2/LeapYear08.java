/**
 * This program tests whether an integer corresponds
 * to a leap year in the Gregorian calendar. A year
 * is a leap year if it is divisible by 4 (2004),
 * unless it is divisible by 100 in which case it is
 * not (1900), unless it is divisible by 400 in which
 * case it is (2000).
 * Sedgewick, Robert; Wayne, Kevin. Computer Science:
 * An Interdisciplinary Approach (p. 28). Pearson
 * Education. Edition Kindle.
 */
public class LeapYear08 { // ano bissexto
   public static void main(String[] args) {

      // variable year receive from user the value
      int year = Integer.parseInt(args[0]);
      // variable boolean
      boolean isLeapYear;

      // calculate
      isLeapYear = (year % 4 == 0); // ano é multiplo de quatro

      // ano é multiplo do 4 E (AND) não é multiplo de 100
      isLeapYear = isLeapYear && (year % 100 != 0);

      // ano é multiplo de 4 e não é multiplo de 100 OU (OR) é multiplo de 400
      isLeapYear = isLeapYear || (year % 400 == 0);

      // display
      System.out.println(year + " = ano bissexto?  " + isLeapYear);
   }
}