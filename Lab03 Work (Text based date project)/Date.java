/**
 * Name: (redacted)
 * Date: 14/02/17
 * Summary of changes: Changed code to display dd-mm-yyyy format. Created get methods and setDate method. Added nextDay method to move the stored day forward one day.
 */

public class Date
{
    private int day; // 1-31 based on month
    private int month; // 1-12
    private int year; // any year

    private static final int[] daysPerMonth = // days in each month
        { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    // constructor: call checkMonth to confirm proper value for month;
    // call checkDay to confirm proper value for day
    public Date( int theDay, int theMonth, int theYear )
    {
        month = checkMonth( theMonth ); // validate month
        day = checkDay( theDay ); // validate day
        year = theYear; // could validate year

        System.out.printf(
            "Date object constructor for date %s\n", this );
    } // end Date constructor

    public Date() //null constructor for setDate method
    {
    }

    // utility method to confirm proper month value
    private int checkMonth( int testMonth )
    {
        if ( testMonth > 0 && testMonth <= 12 ) // validate month
            return testMonth;
        else // month is invalid
            throw new IllegalArgumentException( "month must be 1-12" );
    } // end method checkMonth

    // utility method to confirm proper day value based on month and year
    private int checkDay( int testDay )
    {
        // check if day in range for month
        if ( testDay > 0 && testDay <= daysPerMonth[ month ] )
            return testDay;

        // check for leap year
        if ( month == 2 && testDay == 29 && ( year % 400 == 0 ||
            ( year % 4 == 0 && year % 100 != 0 ) ) )
            return testDay;

        throw new IllegalArgumentException(
            "day out-of-range for the specified month and year" );
    } // end method checkDay

    // return a String of the form day-month-year
    public String toString()
    {
        return String.format( "%d-%d-%d", day, month, year );
    } // end method toString

    public int getDay() //get method for day
    {
        return day;
    }

    public int getMonth() //get method for month
    {
        return month;
    }

    public int getYear() //get method for year
    {
        return year;
    }

    public void setDate(int dd, int mm, int yyyy) //set date method
    {
        this.month = checkMonth( mm ); // validate month
        this.day = checkDay( dd ); // validate day
        this.year = yyyy; // could validate year

    }

    /**
     * Pseudo code: If the day is 31 and month is 12 then set day and month to 1 and increase year by 1. Else if a leap year increase day by 1. Else if the day is
     * equal to the days in the month then set day to 1 and increase month by 1. Else if the day is less than days in the month, increase the day by 1.
     */
    public void nextDay()
    {
        if ( day == 31 && month == 12 ) //check if end of year
        {
            day = 1;
            month = 1;
            year++;
        }
        else if ( month == 2 && day == 28 && ( year % 400 == 0 ||
            ( year % 4 == 0 && year % 100 != 0 ) ) ) //check if leap year
            day++;

        else if ( day == daysPerMonth[ month ] ) //check if end of month
        {
            day = 1;
            month++;
        }
        else if ( day < daysPerMonth[ month ] ) //check if normal day during a month
            day++;
    } // end class Date
}
