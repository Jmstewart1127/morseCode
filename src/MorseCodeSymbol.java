import org.apache.log4j.Logger;

/**
 * Created by rharris on 3/8/2017.
 */
public class MorseCodeSymbol
{
    private String letter;
    private String symbol;

    // CONSTRUCTORS

    public MorseCodeSymbol()
    {

    }


    public MorseCodeSymbol(String letter, String symbol)
    {
        this.letter = letter;
        this.symbol = symbol;
        Logger.getLogger(MorseCodeTranslator.class.getName()).debug( String.format("Inside the MorseCodeSymbol's 2-arg constructor: L[%s] S[%s]", letter, symbol));
    }


    public String getLetter()
    {
        return this.letter;
    }

    public String getEntry()
    {
        return toString();
    }


    public String toString()
    {
        return String.format("Letter: %s Symbol: %s ", letter, symbol);
    }





    // // //

}
