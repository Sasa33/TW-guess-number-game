import java.util.Date;
import java.util.Random;

public class GenerateNumber {

    public String generate() {
        String number = "";
        Date date = new Date();

        long timeMill = date.getTime();
        Random random = new Random(timeMill);

        for (int i=0; i<4; i++) {
            number += random.nextInt(10);
        }

        return number;
    }
}
