/**
 * Name: (redacted)
 * Date: 14/02/17
 * Summary of changes: Created DateTest to test Date class for different test cases.
 */

public class DateTest
{
    public static void main(String[] args)
    {
        /*
         * Test Identifier: Test #1
         * Purpose: Check that nextDay works for the last day of the year
         * Test Input/Setup: Set date to 31-12-2016 and invoke nextDay
         * Expected Output: Date will be 1-1-2017
         */

        Date date1 = new Date();
        date1.setDate(31, 12, 2016);
        System.out.println("Test #1, Check that nextDay works for the last day of the year");
        System.out.println("Before date: " + date1 );
        date1.nextDay();
        System.out.println("After date: " + date1 );
        if (date1.toString().equals("1-1-2017") == true )
            System.out.println("Test passed\n");
        else
            System.out.println("Test failed, expected 1-1-2017\n");

        /*
         * Test Identifier: Test #2
         * Purpose: Check that nextDay works for the last day of the year
         * Test Input/Setup: Set date to 28-2-2016 and invoke nextDay
         * Expected Output: Date will be 29-2-2016
         */

        Date date2 = new Date(28, 2, 2016);
        System.out.println("Test #2, Check that nextDay works for 2016 leap year");
        System.out.println("Before date: " + date2 );
        date2.nextDay();
        System.out.println("After date: " + date2 );
        if (date2.toString().equals("29-2-2016") == true )
            System.out.println("Test passed\n");
        else
            System.out.println("Test failed, expected 29-2-2016\n");

        /*
         * Test Identifier: Test #3
         * Purpose: Check that nextDay works for random day within the same month
         * Test Input/Setup: Set date to 25-6-2017 and invoke nextDay
         * Expected Output: Date will be 26-6-2017
         */

        Date date3 = new Date();
        date3.setDate(25, 6, 2017);
        System.out.println("Test #3, Check that nextDay works for standard day passing");
        System.out.println("Before date: " + date3 );
        date3.nextDay();
        System.out.println("After date: " + date3 );
        if (date3.toString().equals("26-6-2017") == true )
            System.out.println("Test passed\n");
        else
            System.out.println("Test failed, expected 26-6-2017\n");

        /*
         * Test Identifier: Test #4
         * Purpose: Check that nextDay works for another leap year
         * Test Input/Setup: Set date to 28-2-2020 and invoke nextDay
         * Expected Output: Date will be 29-2-2020
         */

        Date date4 = new Date(28, 2, 2020);
        System.out.println("Test #4, Check that nextDay works for a future leap year");
        System.out.println("Before date: " + date4 );
        date4.nextDay();
        System.out.println("After date: " + date4 );
        if (date4.toString().equals("29-2-2020") == true )
            System.out.println("Test passed\n");
        else
            System.out.println("Test failed, expected 29-2-2020\n");

        /*
         * Test Identifier: Test #5
         * Purpose: Check that nextDay works for non-leap year
         * Test Input/Setup: Set date to 28-2-2017 and invoke nextDay
         * Expected Output: Date will be 1-3-2017
         */

        Date date5 = new Date();
        date5.setDate(28, 2, 2017);
        System.out.println("Test #5, Check that nextDay works for non-leap year");
        System.out.println("Before date: " + date5 );
        date5.nextDay();
        System.out.println("After date: " + date5 );
        if (date5.toString().equals("1-3-2017") == true )
            System.out.println("Test passed\n");
        else
            System.out.println("Test failed, expected 1-3-2017\n");

        /*
         * Test Identifier: Test #6
         * Purpose: Check that nextDay works for end of 31 day month
         * Test Input/Setup: Set date to 31-5-2017 and invoke nextDay
         * Expected Output: Date will be 1-6-2017
         */

        Date date6 = new Date(31, 5, 2017);
        System.out.println("Test #6, Check that nextDay works for end of 31 day month");
        System.out.println("Before date: " + date6 );
        date6.nextDay();
        System.out.println("After date: " + date6 );
        if (date6.toString().equals("1-6-2017") == true )
            System.out.println("Test passed\n");
        else
            System.out.println("Test failed, expected 1-6-2017\n");

        /*
         * Test Identifier: Test #7
         * Purpose: Check that nextDay works for another random day
         * Test Input/Setup: Set date to 25-10-1985 and invoke nextDay
         * Expected Output: Date will be 25-10-1985
         */

        Date date7 = new Date();
        date7.setDate(25, 10, 1985);
        System.out.println("Test #7, Check that nextDay works for another random day");
        System.out.println("Before date: " + date7 );
        date7.nextDay();
        System.out.println("After date: " + date7 );
        if (date7.toString().equals("26-10-1985") == true )
            System.out.println("Test passed\n");
        else
            System.out.println("Test failed, expected 26-10-1985\n");

        /*
         * Test Identifier: Test #8
         * Purpose: Check that nextDay works for end of 30 day month
         * Test Input/Setup: Set date to 30-09-2017 and invoke nextDay
         * Expected Output: Date will be 1-10-2017
         */

        Date date8 = new Date(30, 9, 2017);
        System.out.println("Test #8, Check that nextDay works for end of 30 day month");
        System.out.println("Before date: " + date8 );
        date8.nextDay();
        System.out.println("After date: " + date8 );
        if (date8.toString().equals("1-10-2017") == true )
            System.out.println("Test passed\n");
        else
            System.out.println("Test failed, expected 1-10-2017\n");

    }
}
