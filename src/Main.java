import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import org.apache.log4j.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scannerIn = new Scanner(System.in);
        Scanner s = new Scanner(new File('input.txt'));
        MorseCodeTranslator txtFile = new MorseCodeTranslator();

        while (s.hasNext())
        {
            txtFile.add(s.next());
        }

        ArrayList<MorseCodeSymbol> morseCodeSymbols;
	    MorseCodeTranslator decoderRing = new MorseCodeTranslator("input.txt");
        MorseCodeTranslator symbolBank = new MorseCodeTranslator(morseCodeSymbols);
	    String inputString = "";
	    String answer = "";
	    String yn = "";

	    Logger.getLogger(Main.class.getName()).debug("Beginning the main program.");

	    MorseCodeTranslator translate = new MorseCodeTranslator();



        Logger.getLogger(Main.class.getName()).debug("Exiting the main program.");

        System.out.print("Do you want to do some Morse Code translations? (Y/N)?");
        yn = scannerIn.next();

        while (yn.equals("y"))
        {
            System.out.print("Enter a sentence (to be translated into Morse Code): ");
            inputString = scannerIn.next();
            translate.translateSentence(inputString);

        }
    }
}
