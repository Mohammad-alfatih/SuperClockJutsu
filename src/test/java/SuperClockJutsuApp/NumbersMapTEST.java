package SuperClockJutsuApp;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by alfatihmukhtar on 2/16/17.
 */
public class NumbersMapTEST {
    NumbersMap numbersMap;

    @Before
    public void setUp() {
        numbersMap = new NumbersMap();
    }

    @Test
    public void makeNumbersMapTEST() {
        int expected = 10;
        int actual = numbersMap.getTextNumbers().size();
        String[] sample = numbersMap.getTextNumbers().get(7);
        System.out.println(sample[2]);
        System.out.println(numbersMap.getTextNumbers().get(5)[2]);
        assertEquals("This should be returning a Map object, then finding out it's size",expected,actual);
    }

    @Test
    public void digitToWordTEST() {
        String expected = "seven";
        String actual = numbersMap.digitToWord(7,2);
        assertEquals("This method should return the number being input represented as a word",expected,actual);
    }

    @Test
    public void parseDigitsTEST() {
        String expected = new String(new char[] {'3','5'});
        String actual = new String(numbersMap.parseDigits(35));
        assertEquals("Returns a char[] representing the input, with each digit as element in the array",expected,actual);
    }

    @Test
    public void numberToWordTEST() {
        String expected = "three five";
        String actual = numbersMap.numberToWord(35);
        System.out.println(actual);
        assertEquals("Print out the int sent to the method as words",expected,actual);
    }

//    @Test
//    public void formatTensDigit() {
//        String expected = "thirty five";
//        String actual = numbersMap.formatTensDigit(35);
//        System.out.println(actual);
//        assertEquals("Output a string representing the tens digit as a string with normally formatted words",expected,actual);
//    }

}
