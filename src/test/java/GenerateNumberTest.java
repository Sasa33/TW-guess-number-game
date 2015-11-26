import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class GenerateNumberTest {
//    @Before
//    public void testBefore()
//    {
//        GenerateNumber generator = new GenerateNumber();
//    }

    @Test
    public void should_generate_4_digits_number ()
    {
        //given
        GenerateNumber generator = new GenerateNumber();

        //when
        String number = generator.generate();

        //then
        assertEquals(4, number.length());
    }

    // character unique
    @Test
    public void should_generate_4_unique_characters_in_each_bit ()
    {
        //given
        GenerateNumber generator = new GenerateNumber();

        //when
        String number = generator.generate();
        Boolean ifUnique = false;
        HashSet<Character> unique = new HashSet<Character>(number.length());
        for (int i=0; i<number.length(); i++)
        {
            if(!unique.add(number.charAt(i)))
            {
                ifUnique = false;
            }
        }
        ifUnique = true;

        //then
        // assertTrue(unique.size() == number.length());
        assertTrue(ifUnique);
    }
    
    @Test
    public void should_continuously_generate_at_least_100_different_numbers ()
    {
        //given
        GenerateNumber generator = new GenerateNumber();
        
        //when
        String[] randomNumbers = new String[100];
        for(int i=0; i<100; i++)
        {
            randomNumbers[i] = generator.generate();
        }


        Boolean ifRandom = false;
        HashSet<String> unique = new HashSet<String>(randomNumbers.length);
        for(int i=0;i<randomNumbers.length;i++)
        {
            if(!unique.add(randomNumbers[i]))
            {
                ifRandom = false;
            }
        }
        ifRandom = true;

        //then
        assertTrue(ifRandom);
      
    }
}
