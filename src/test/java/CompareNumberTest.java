import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompareNumberTest {

//    @Test
//    public void compareTwoNumbers() throws Exception {
//        String randomNumber = "1234";
//        String inputNumber = "1324";
//
//        assertEquals("2A2B", new CompareNumber.compare(randomNumber, inputNumber));
//    }


    @Test
    public void should_get_4A0B_when_two_numbers_are_same() {
        //given
        String randomNumber = "1234";
        String inputNumber = "1234";

        //when
        String expected = "4A0B";
        String actual = new CompareNumber().compare(randomNumber, inputNumber);

        //then
        assertEquals(expected, actual);
    }


    @Test
    public void should_get_2A2B_when_two_bits_both__match_and_two_bits_equals_but_position_differs() throws Exception {
        //given
        String randomNumber = "1234";
        String inputNumber = "1324";

        //when
        String expected = "2A2B";
        String actual = new CompareNumber().compare(randomNumber, inputNumber);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void should_get_0A4B_when_all_bits_are_same_but_position_are_different() {
        //given
        String randomNumber = "1234";
        String inputNumber = "4321";

        //when
        String expected = "0A4B";
        String actual = new CompareNumber().compare(randomNumber, inputNumber);

        //then
        assertEquals(expected, actual);
    }


    @Test
    public void should_get_0A0B_when_all_bits_not_equals() throws Exception {
        //given
        String randomNumber = "1234";
        String inputNumber = "6789";

        //when
        String expected = "0A0B";
        String actual = new CompareNumber().compare(randomNumber, inputNumber);

        //then
        assertEquals(expected, actual);
    }
}
