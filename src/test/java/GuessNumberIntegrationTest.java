import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GuessNumberIntegrationTest {

    @Test
    public void should_get_4A0B_when_guessNumber_is_the_same_as_generateNumber ()
    {
        //given
        GenerateNumber generator = mock(GenerateNumber.class);
        CompareNumber compare = new CompareNumber();

//        String randomNumber = generator.generate();
        when(generator.generate()).thenReturn("1234");
        String guessNumber = "1234";

        //when
        String result = compare.compare(generator.generate(), guessNumber);

        //then
        assertEquals("4A0B", result);

    }


    @Test
    public void should_get_2A2B_when_two_bits_both__match_and_two_bits_equals_but_position_differs ()
    {
        //given
        GenerateNumber generator = mock(GenerateNumber.class);
        CompareNumber compare = new CompareNumber();

//        String randomNumber = generator.generate();
        when(generator.generate()).thenReturn("1324");
        String guessNumber = "1234";

        //when
        String result = compare.compare(generator.generate(), guessNumber);

        //then
        assertEquals("2A2B", result);

    }
}
