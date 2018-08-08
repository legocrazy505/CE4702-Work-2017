/**
 * Name: (redacted)
 * Date: 19-02-17
 * Summary of changes: Added district, added targetSales with a check if it was achieved or missed.
 * Modified toString method to add these new additional arguments.
 */
public class CommissionEmployee
{
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private String district;
    private double targetSales; // target sales
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage
    private String targetvsgross; // string that stores if target sales was met

    // seven-argument constructor
    public CommissionEmployee( String first, String last, String ssn, String dist, double target,
    double sales, double rate )
    {
        // implicit call to Object constructor occurs here
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
        district = dist;
        setTargetSales( target );
        setGrossSales( sales ); // validate and store gross sales
        setCommissionRate( rate ); // validate and store commission rate
    } // end five-argument CommissionEmployee constructor

    // set first name
    public void setFirstName( String first )
    {
        firstName = first; // should validate
    } // end method setFirstName

    // return first name
    public String getFirstName()
    {
        return firstName;
    } // end method getFirstName

    // set last name
    public void setLastName( String last )
    {
        lastName = last; // should validate
    } // end method setLastName

    // return last name
    public String getLastName()
    {
        return lastName;
    } // end method getLastName

    // set social security number
    public void setSocialSecurityNumber( String ssn )
    {
        socialSecurityNumber = ssn; // should validate
    } // end method setSocialSecurityNumber

    // return social security number
    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    } // end method getSocialSecurityNumber

    //set district
    public void setDistrict( String dist )
    {
        district = dist;
    }

    //return district
    public String getDistrict()
    {
        return district;
    }

    //set target sales with check if valid
    public void setTargetSales( double target )
    {
        if ( target >= 0.0 )
            targetSales = target;
        else
            throw new IllegalArgumentException(
                "Target sales must be >= 0.0" );
    }

    //return targetSales
    public double getTargetSales()
    {
        return targetSales;
    }

    // set gross sales amount
    public void setGrossSales( double sales )
    {
        if ( sales >= 0.0 )
            grossSales = sales;
        else
            throw new IllegalArgumentException(
                "Gross sales must be >= 0.0" );
    } // end method setGrossSales

    // return gross sales amount
    public double getGrossSales()
    {
        return grossSales;
    } // end method getGrossSales

    // set commission rate
    public void setCommissionRate( double rate )
    {
        if ( rate > 0.0 && rate < 1.0 )
            commissionRate = rate;
        else
            throw new IllegalArgumentException(
                "Commission rate must be > 0.0 and < 1.0" );
    } // end method setCommissionRate

    // return commission rate
    public double getCommissionRate()
    {
        return commissionRate;
    } // end method getCommissionRate

    // calculate earnings
    public double earnings()
    {
        return getCommissionRate() * getGrossSales();
    } // end method earnings

    // return String representation of CommissionEmployee object
    @Override // indicates that this method overrides a superclass method
    public String toString()
    {
                if ( targetSales < grossSales ) //checks if target was achieved or missed then stores result
            targetvsgross = "missed";
        else
            targetvsgross = "achieved";

        return String.format( "%s: %s %s\n%s: %s\n%s: %s\n%s: %.2f (%s)\n%s: %.2f\n%s: %.2f",
            "commission employee", getFirstName(), getLastName(),
            "social security number", getSocialSecurityNumber(),
            "district", getDistrict(),
            "target sales", getTargetSales(),
            targetvsgross,
            "gross sales", getGrossSales(),
            "commission rate", getCommissionRate() );
    } // end method toString
} // end class CommissionEmployee
