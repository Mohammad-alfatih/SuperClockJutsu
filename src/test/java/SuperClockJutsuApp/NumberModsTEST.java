package SuperClockJutsuApp;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by alfatihmukhtar on 2/17/17.
 */
public class NumberModsTEST {
    NumberMods modifier;

    @Before
    public void setUp() {
        modifier = new NumberMods();
    }

    @Test
    public void assignmentMethodsTEST() {
        String expected = "thirteen and thirty";
        String actual = modifier.getTeenMods().get('3') + " and " + modifier.getTensMods().get('3');
        assertEquals("Show the string from within the array that is paired to a key that is equal to input",expected,actual);
    }
}
