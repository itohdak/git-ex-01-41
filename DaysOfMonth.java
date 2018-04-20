/*
 * DaysOfMonth.java
 *  Print number of days in a given month and year.
 *
 * Compile it: % javac DaysOfMonth.java
 * and exec. : % java DaysOfMonth 2019 4
 *
 */
public class DaysOfMonth {
    public static void main(String[] args){
	if (args.length < 2) {
	    System.out.printf("Error: Please enter the year and the month correctly as below.\n$ java DaysOfMonth YYYY MM\n");
	}
	else {
	    int year = Integer.parseInt(args[0]);
	    int month = Integer.parseInt(args[1]);
	    // Buggy output
	    System.out.printf("Month of %d/%d has %d days\n",
			      month, year, daysofmonth(month, year));
	}
    }
    static int daysofmonth(int month, int year) {
	if (month == 4 || month == 6 || month == 9 || month == 11) {
	    return 30;
	}
	else if (month == 2) {
	    if (year % 400 == 0)
		return 29;
	    else if (year % 100 == 0)
		return 28;
	    else if (year % 4 == 0)
		return 29;
	    else
		return 28;
	}
	else
	    return 31;
    }
}
