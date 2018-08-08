/**
 * Name: (redacted)
 * Date Modified: 23-02-2017
 * Description of changes: Added 3 new tests (1 for hourly, 2 for piece)
 * and updated array to include these new employees.
 */
public class PayrollSystemTest
{
    public static void main( String[] args )
    {
        // create subclass objects
        SalariedEmployee salariedEmployee =
            new SalariedEmployee( "John", "Smith", "111-11-1111", 800.00 );
        HourlyEmployee hourlyEmployee =
            new HourlyEmployee( "Karen", "Price", "222-22-2222", 16.75, 40 );
        CommissionEmployee commissionEmployee =
            new CommissionEmployee(
                "Sue", "Jones", "333-33-3333", 10000, .06 );
        BasePlusCommissionEmployee basePlusCommissionEmployee =
            new BasePlusCommissionEmployee(
                "Bob", "Lewis", "444-44-4444", 5000, .04, 300 );
        PieceWorker pieceWorker =
            new PieceWorker(
                "Di", "Gress", "555-55-5555", 3.25, 40 );
        HourlyEmployee hourlyEmployee1 =
            new HourlyEmployee(
                "Per", "Pear", "111-22-3333", 20.50, 38 );
        PieceWorker pieceWorker1 =
            new PieceWorker(
                "Murdo", "Mackenzie", "16152522", 5.50, 30 );

        System.out.println( "Employees processed individually:\n" );
        System.out.printf( "%s\n%s: €%,.2f\n\n",
            salariedEmployee, "earned", salariedEmployee.earnings() );
        System.out.printf( "%s\n%s: €%,.2f\n\n",
            hourlyEmployee, "earned", hourlyEmployee.earnings() );
        System.out.printf( "%s\n%s: €%,.2f\n\n",
            commissionEmployee, "earned", commissionEmployee.earnings() );
        System.out.printf( "%s\n%s: €%,.2f\n\n",
            basePlusCommissionEmployee,
            "earned", basePlusCommissionEmployee.earnings() );
        System.out.printf( "%s\n%s: €%,.2f\n\n",
            pieceWorker,
            "earned", pieceWorker.earnings() );
        System.out.printf( "%s\n%s: €%,.2f\n\n",
            hourlyEmployee1,
            "earned", hourlyEmployee1.earnings() );
        System.out.printf( "%s\n%s: €%,.2f\n\n",
            pieceWorker1,
            "earned", pieceWorker1.earnings() );

        // create four-element Employee array
        Employee[] employees = new Employee[ 7 ];

        // initialize array with Employees
        employees[ 0 ] = salariedEmployee;
        employees[ 1 ] = hourlyEmployee;
        employees[ 2 ] = commissionEmployee;
        employees[ 3 ] = basePlusCommissionEmployee;
        employees[ 4 ] = pieceWorker;
        employees[ 5 ] = hourlyEmployee1;
        employees[ 6 ] = pieceWorker1;

        System.out.println( "Employees processed polymorphically:\n" );

        // generically process each element in array employees
        for ( Employee currentEmployee : employees )
        {
            System.out.println( currentEmployee ); // invokes toString

            // determine whether element is a BasePlusCommissionEmployee
            if ( currentEmployee instanceof BasePlusCommissionEmployee )
            {
                // downcast Employee reference to
                // BasePlusCommissionEmployee reference
                BasePlusCommissionEmployee employee =
                    ( BasePlusCommissionEmployee ) currentEmployee;

                employee.setBaseSalary( 1.10 * employee.getBaseSalary() );

                System.out.printf(
                    "new base salary with 10%% increase is: €%,.2f\n",
                    employee.getBaseSalary() );
            } // end if

            System.out.printf(
                "earned €%,.2f\n\n", currentEmployee.earnings() );
        } // end for

        // get type name of each object in employees array
        for ( int j = 0; j < employees.length; j++ )
            System.out.printf( "Employee %d is a %s\n", j,
                employees[ j ].getClass().getName() );
    } // end main
} // end class PayrollSystemTest
