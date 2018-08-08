/**
 * Name: (redacted)
 * Date modified: 23-02-2017
 * Description of class: This class creates a new type of employee
 * called piece worker with earnings calculated by rate multiplied by
 * piece.
 */
public class PieceWorker extends Employee
{
    private double rate; //rate per piece
    private int pieces; //number of pieces completed

    //constructor for the class
    public PieceWorker( String first, String last, String ssn,
    double pieceRate, int numOfPieces )
    {
        super( first, last, ssn );
        setRate( pieceRate ); //validate and store piece rate
        setPieces( numOfPieces ); //validate and store number of pieces
    }

    //set rate
    public void setRate( double pieceRate )
    {
        if ( pieceRate >= 0.0 )
            rate = pieceRate;
        else
            throw new IllegalArgumentException(
                "Piece rate must be >= 0.0" );
    }

    //get rate
    public double getRate()
    {
        return rate;
    }

    //set pieces
    public void setPieces( int numOfPieces )
    {
        if ( numOfPieces >= 0 )
            pieces = numOfPieces;
        else
            throw new IllegalArgumentException(
                "Number of pieces must be >= 0" );
    }

    //get pieces
    public int getPieces()
    {
        return pieces;
    }

    //calculate earnings; ovveride abstract method earnings in Employee
    @Override
    public double earnings()
    {
        return getRate() * getPieces(); //multiply rate by pieces
    }

    //return String representation of PieceWorker object
    @Override
    public String toString()
    {
        return String.format( "piece worker: %s\n%s: €%,.2f; %s: %d",
            super.toString(), "piece rate", getRate(),
            "number of pieces", getPieces() );
    }
} //end class
