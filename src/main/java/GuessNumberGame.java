import java.util.HashSet;
import java.util.Scanner;

public class GuessNumberGame {

    public static void main(String[] args) {
        GenerateNumber generator = new GenerateNumber();
        CompareNumber comparator = new CompareNumber();


        System.out.println("Welcome!\n");
        String result = "";
        for (int limit = 6; limit > 0; limit--) {
            System.out.println("Please input your number("+limit+"):");
            Scanner s = new Scanner(System.in);
            String guessNumber = s.next();

            HashSet<Character> unique = new HashSet<Character>(guessNumber.length());
            Boolean ifUnique = true;
            for(int i = 0; i<guessNumber.length(); i++)
            {
                if (!unique.add(guessNumber.charAt(i)))
                {
                    ifUnique = false;
                    System.out.println("Cannot input duplicate numbers!\n");
                    break;
                }
            }

            if(ifUnique)
            {
                result = comparator.compare(generator.generate(), guessNumber);
                if (result.equals("4A0B"))
                {
                    System.out.println("Congratulations!");
                    break;
                } else
                {
                    System.out.println(result+"\n");
                }
            }
        }

        System.out.println("Game Over!");

    }
}
