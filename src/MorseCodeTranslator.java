import org.apache.log4j.Logger;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by rharris on 3/8/2017.
 */
public class MorseCodeTranslator
{
    private String sentence;
    private String translation;
    private ArrayList<MorseCodeSymbol> morseCodeSymbols;
    Scanner s;

    public MorseCodeTranslator()
    {
        sentence = "";
        translation = "";
        morseCodeSymbols = new ArrayList<MorseCodeSymbol>();
    }

    public MorseCodeTranslator(String inputFileName)
    {
        Logger.getLogger(MorseCodeTranslator.class.getName()).debug( String.format("Inside the MorseCodeTranslator's 1-arg constructor: FNAME[%s]", inputFileName));
       try
       {
           s = new Scanner(new File(inputFileName));
           morseCodeSymbols = new ArrayList<MorseCodeSymbol>();
           initializeSymbols(inputFileName);
       }
       catch (FileNotFoundException e)
       {
           System.out.println(e.toString());
       }
    }


    public void examineSymbolCollection()
    {
        for (MorseCodeSymbol symbols : morseCodeSymbols)
        {
            System.out.println(symbols.toString());
        }
    }


    public void translateSentence(String inputString)
    {
        for (int i = 0; i < inputString.length(); i++)
        {
            
        }
    }


    private void translateIndividualLetter(String inputLetter)
    {

    }


    private void initializeSymbols(String inputFileName)
    {
        String inputLine;
        String letter;
        String symbol;

        while(s.hasNext())
        {
            inputLine = s.nextLine();
            letter = inputLine.substring(0, 1);
            symbol = inputLine.substring(3);
            morseCodeSymbols.add(new MorseCodeSymbol(letter, symbol));
        }
        s.close();

    }

}
