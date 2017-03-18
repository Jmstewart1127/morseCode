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
    }


    // ACCESSORS

    public String getLetter()
    {
        return this.letter;
    }

    public String toString()
    {
        return String.format("Translation: %s ", letter);
    }





    // // //

}
