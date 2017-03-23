import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Character Alphabet [] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' '};
        String MorseCode [] = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "   "};
        String yn;
        String input;

        System.out.print("Do you want to do some Morse Code translations? (Y/N)?");
        yn = s.next();

        while (yn.equals("y"))
        {
            System.out.print("Enter a sentence (to be translated into Morse Code): ");
            input = s.next();
            for (int i = 0; i < input.length(); i ++)
            {
                for(int j = 0; j < Alphabet.length; j++)
                {
                    if(input.charAt(i) == Alphabet[j])
                    {
                        System.out.print(MorseCode[j] + "   ");
                    }
                }
            }
            System.out.print("\n" + "Do you want to do some Morse Code translations? (Y/N)? ");
            yn = s.next();
        }
    }
}
