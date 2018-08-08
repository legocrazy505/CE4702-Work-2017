/**
 * Name: (redacted)
 * Date: 19-02-17
 * Summary of changes: Updated test case 1 to include new paramters such as district.
 * Added two more cases one with and one without a base salary.
 */
public class EmployeeTest
{
    public static void main( String[] args )
    {
        // instantiate BasePlusCommissionEmployee object
        BasePlusCommissionEmployee employee =
            new BasePlusCommissionEmployee(
                "Bob", "Lewis", "333-33-3333", "Tipperary", 4000, 5000, .04, 300 );

        // get base-salaried commission employee data
        System.out.println(
            "Employee information obtained by get methods: \n" );
        System.out.printf( "%s %s\n", "First name is",
            employee.getFirstName() );
        System.out.printf( "%s %s\n", "Last name is",
            employee.getLastName() );
        System.out.printf( "%s %s\n", "Social security number is",
            employee.getSocialSecurityNumber() );
        System.out.printf( "%s %s\n", "District is",
            employee.getDistrict() );
        System.out.printf( "%s %.2f\n", "Target sales is",
            employee.getTargetSales() );
        System.out.printf( "%s %.2f\n", "Gross sales is",
            employee.getGrossSales() );
        System.out.printf( "%s %.2f\n", "Commission rate is",
            employee.getCommissionRate() );
        System.out.printf( "%s %.2f\n", "Base salary is",
            employee.getBaseSalary() );

        employee.setBaseSalary( 1000 ); // set base salary

        System.out.printf( "\n%s:\n\n%s\n",
            "Updated employee information obtained by toString",
            employee.toString() );

        /*
         * Test Identifier: Test #2
         * Purpose: Test ComissionEmployee class without a base salary
         * Test Input/Setup: Set variables with the constructor and don't set a base
         * salary
         */
        CommissionEmployee commEmployee =
            new CommissionEmployee(
                "Murdo", "Mackenzie", "16152522", "Dublin", 3000, 2000, .06 );

        // get comission employee data
        System.out.println(
            "\nEmployee information obtained by get methods: \n" );
        System.out.printf( "%s %s\n", "First name is",
            commEmployee.getFirstName() );
        System.out.printf( "%s %s\n", "Last name is",
            commEmployee.getLastName() );
        System.out.printf( "%s %s\n", "Social security number is",
            commEmployee.getSocialSecurityNumber() );
        System.out.printf( "%s %s\n", "District is",
            commEmployee.getDistrict() );
        System.out.printf( "%s %.2f\n", "Target sales is",
            commEmployee.getTargetSales() );
        System.out.printf( "%s %.2f\n", "Gross sales is",
            commEmployee.getGrossSales() );
        System.out.printf( "%s %.2f\n", "Commission rate is",
            commEmployee.getCommissionRate() );

        System.out.printf( "\n%s:\n\n%s\n",
            "Updated employee information obtained by toString",
            commEmployee.toString() );

        /*
         * Test Identifier: Test #3
         * Purpose: Test BasePlusComissionEmployee with base salary
         * Test Input/Setup: Set variables with the construct and set baseSalary to 2000
         */
        BasePlusCommissionEmployee employee1 =
            new BasePlusCommissionEmployee(
                "Murdo", "Mackenzie", "16152522", "Down", 6000, 8000, .04, 400 );

        // get base-salaried commission employee data
        System.out.println(
            "\nEmployee information obtained by get methods: \n" );
        System.out.printf( "%s %s\n", "First name is",
            employee1.getFirstName() );
        System.out.printf( "%s %s\n", "Last name is",
            employee1.getLastName() );
        System.out.printf( "%s %s\n", "Social security number is",
            employee1.getSocialSecurityNumber() );
        System.out.printf( "%s %s\n", "District is",
            employee1.getDistrict() );
        System.out.printf( "%s %.2f\n", "Target sales is",
            employee1.getTargetSales() );
        System.out.printf( "%s %.2f\n", "Gross sales is",
            employee1.getGrossSales() );
        System.out.printf( "%s %.2f\n", "Commission rate is",
            employee1.getCommissionRate() );
        System.out.printf( "%s %.2f\n", "Base salary is",
            employee1.getBaseSalary() );

        employee1.setBaseSalary( 2000 ); // set base salary

        System.out.printf( "\n%s:\n\n%s\n",
            "Updated employee information obtained by toString",
            employee1.toString() );
    } // end main
} // end class BasePlusCommissionEmployeeTest
