import java.util.ArrayList;
import java.util.List;

public class CompareNumber {
    public String compare(String randomNumber, String inputNumber) {
//        if (randomNumber.equals(inputNumber))
//            return "4A0B";
//        else
//            return "2A2B";

        int num_A = 0;
        int num_B = 0;
        for(int i=0; i<randomNumber.length(); i++) {
            if(randomNumber.charAt(i) == inputNumber.charAt(i)) {
                num_A++;
            } else if(randomNumber.indexOf(inputNumber.charAt(i)) != -1){
                num_B++;
            }
        }

        return num_A+"A"+num_B+"B";
    }
}
