// STUDENT NAME: Nayan Gomez
// DATE: 05/12/2025

public class Main 
{
  public static void main(String[] args) 
	{
		/***** DECLARATION SECTION *****/
		int monthToday, dayToday, yearToday, jdnToday;
		int monthBday, dayBday, yearBday, jdnBday;
		int diff, approxAge;
		int a, m, y;

		monthToday = 2;
		dayToday = 2;
		yearToday = 2020;

		monthBday = 8;
		dayBday = 26;
		yearBday = 1918;




		/***** INITIALIZATION SECTION *****/
		
		/***** INPUT SECTION *****/
		// N/A (no input for this lab)
		
		/***** CALCULATION & PROCESSING SECTION *****/
	

		a = (14 - monthToday) / 12;
		m = monthToday + 12 * a - 3;
		y = yearToday + 4800 - a;

		//then calculate jdn
		
		jdnToday = dayToday + (153 * m + 2) / 5 + 365 * y 
							+ y / 4 - y / 100 + y / 400 - 32045;

		a = (14 - monthBday) / 12;
		m = monthBday + 12 * a - 3;
		y = yearBday + 4800 - a;
		
		jdnBday = dayBday + (153 * m + 2) / 5 + 365 * y 
							+ y / 4 - y / 100 + y / 400 - 32045;

		diff = jdnToday - jdnBday;

		approxAge = diff / 365;

		/***** OUTPUT SECTION *****/
		System.out.println("Julian Day Number for today's date, " +
				monthToday + "/" + dayToday + "/" + yearToday + ", is " + jdnToday);
		System.out.println();
		System.out.println("Julian Day Number for birthday, " +
				monthBday + "/" + dayBday + "/" + yearBday + ", is " + jdnBday);
		System.out.println();
		System.out.println("The difference in days is " + diff +
				", which makes you approximately " + approxAge + " years old!");
		



  }
}