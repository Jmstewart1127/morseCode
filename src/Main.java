import org.apache.log4j.Logger;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scannerIn = new Scanner(System.in);
        String sentence;
        String translation;
        String letter;
        String symbol;
        String fileName = "input.txt";
        String yn;



        MorseCodeTranslator translator = new MorseCodeTranslator(fileName);
        translator.translateSentence(fileName);

        MorseCodeSymbol theSymbols = new MorseCodeSymbol();

        System.out.print("Do you want to do some Morse Code translations? (Y/N)?");
        yn = scannerIn.next();

        while (yn.equals("y"))
        {
            System.out.print("Enter a sentence (to be translated into Morse Code): ");
            sentence = scannerIn.next();
            translator.translateSentence(sentence);
            System.out.print("Do you want to do some Morse Code translations? (Y/N)? ");
            yn = scannerIn.next();
        }

    }
}
