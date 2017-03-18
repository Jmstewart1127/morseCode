import org.apache.log4j.Logger;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by rharris on 3/8/2017.
 */
public class MorseCodeTranslator
{
    private String sentence;
    private String translation;
    private ArrayList<MorseCodeSymbol> morseCodeSymbols;

    public MorseCodeTranslator()
    {
        morseCodeSymbols = new ArrayList<MorseCodeSymbol>();
    }

    public MorseCodeTranslator(String sentence, String translation, ArrayList<MorseCodeSymbol> morseCodeSymbols)
    {
        this.sentence = sentence;
        this.translation = translation;
        this.morseCodeSymbols = morseCodeSymbols;
    }

    public MorseCodeTranslator(ArrayList<MorseCodeSymbol> morseCodeSymbols)
    {
        this.morseCodeSymbols = morseCodeSymbols;
    }

    public MorseCodeTranslator(String inputFileName)
    {
        Logger.getLogger(MorseCodeTranslator.class.getName()).debug( String.format("Inside the MorseCodeTranslator's 1-arg constructor: FNAME[%s]", inputFileName));

        //  SNIP SNIP SNIP

    }


    public ArrayList<MorseCodeSymbol> getMorseCodeSymbols()
    {
        return this.morseCodeSymbols;
    }

    public void examineSymbolCollection()
    {
        //  SNIP SNIP SNIP
    }


    public void translateSentence(String inputString)
    {
        MorseCodeSymbol symbol = new MorseCodeSymbol();

        Logger.getLogger(MorseCodeTranslator.class.getName()).debug("Beginning the sentence translation");

        System.out.println("Translation: " + translation);
        Logger.getLogger(MorseCodeTranslator.class.getName()).debug("Ended the sentence translation");
    }


    private void translateIndividualLetter(String inputLetter)
    {
        //MorseCodeSymbol symbol = new MorseCodeSymbol(inputLetter);
//        symbol.
    }

    private void initializeSymbols(String inputFileName)
    {
        String inputLine = "";
        String letter;
        String symbol;

        //  // // //
    }


}
