package SuperClockJutsuApp;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by alfatihmukhtar on 2/17/17.
 */
public class NumberMods {
    // FIELDS
    private Map<Character,String> teenMods = new HashMap<Character, String>();
    private Map<Character,String> tensMods = new HashMap<Character, String>();

    // CONSTRUCTORS
    NumberMods() {
        assignTeenMods();
        assignTensMods();
    }

    // GETTERS
    public Map<Character, String> getTeenMods() { return teenMods; }
    public Map<Character, String> getTensMods() { return tensMods; }

    // METHODS
    private Map<Character,String> assignTeenMods() {
        Map<Character,String> tempMap = new HashMap<Character, String>();
        teenMods.put('1',"eleven");
        teenMods.put('2',"twelve");
        teenMods.put('3',"thirteen");
        teenMods.put('4',"fourteen");
        teenMods.put('5',"fifteen");
        teenMods.put('6',"sixteen");
        teenMods.put('7',"seventeen");
        teenMods.put('8',"eighteen");
        teenMods.put('9',"nineteen");
        return tempMap;
    }
    private Map<Character,String> assignTensMods() {
        Map<Character,String> tempMap = new HashMap<Character, String>();
        tensMods.put('1',"ten");
        tensMods.put('2',"twenty");
        tensMods.put('3',"thirty");
        tensMods.put('4',"forty");
        tensMods.put('5',"fifty");
        tensMods.put('6',"sixty");
        return tempMap;
    }
}
