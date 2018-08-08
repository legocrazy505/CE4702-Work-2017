/**
 * Name: (redacted)
 * Date: 19-02-17
 * Summary of changes: Updated constructor to reflect changes in the ComissionEmployee class.
 */
public class BasePlusCommissionEmployee extends CommissionEmployee
{
   private double baseSalary; // base salary per week

   // eight-argument constructor
   public BasePlusCommissionEmployee( String first, String last,
      String ssn, String dist, double target, double sales, double rate, double salary )
   {
      super( first, last, ssn, dist, target, sales, rate );
      setBaseSalary( salary ); // validate and store base salary
   } // end eight-argument BasePlusCommissionEmployee constructor

   // set base salary
   public void setBaseSalary( double salary )
   {
      if ( salary >= 0.0 )
         baseSalary = salary;
      else
         throw new IllegalArgumentException(
            "Base salary must be >= 0.0" );
   } // end method setBaseSalary

   // return base salary
   public double getBaseSalary()
   {
      return baseSalary;
   } // end method getBaseSalary

   // calculate earnings
   @Override // indicates that this method overrides a superclass method
   public double earnings()
   {
      return getBaseSalary() + super.earnings();
   } // end method earnings

   // return String representation of BasePlusCommissionEmployee
   @Override // indicates that this method overrides a superclass method
   public String toString()
   {
      return String.format( "%s %s\n%s: %.2f", "base-salaried",
         super.toString(), "base salary", getBaseSalary() );
   } // end method toString
} // end class BasePlusCommissionEmployee
