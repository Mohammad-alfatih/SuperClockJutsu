package SuperClockJutsuApp;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by alfatihmukhtar on 2/16/17.
 */
public class NumbersMap {
    // FIELDS
    private Map<Integer,String[]> textNumbers = new HashMap<Integer,String[]>();
    private NumberMods modifier = new NumberMods();

    // CONSTRUCTOR
    public NumbersMap() { textNumbers = makeNumbersMap(); }

    // GETTER
    public Map<Integer, String[]> getTextNumbers() { return textNumbers; }

    // METHODS
    private Map<Integer,String[]> makeNumbersMap() {
        Map<Integer,String[]> tempMap = new HashMap<Integer, String[]>();
        int currentNumber = 0;
        for (BaseNumbers number : BaseNumbers.values()) {
            String[] currentArray = new String[3];
            currentArray[0] = "0"+currentNumber;
            currentArray[1] = ""+currentNumber;
            currentArray[2] = number.toString();
            tempMap.put(currentNumber, currentArray);
            currentNumber++;
        }
        return tempMap;
    }
    public String digitToWord(int num, int key) { return textNumbers.get(num)[key].toLowerCase(); }
    public String numberToWord(int num) {
        char[] parsedDigits = parseDigits(num);
        String wordRepresentation="";
        for(char number : parsedDigits) wordRepresentation+=digitToWord(Character.getNumericValue(number), 2)+" ";
        modify(num, wordRepresentation);
        return  wordRepresentation.substring(0,wordRepresentation.length()-1);
    }
    public String modify(int num, String words) {
        String[] splitWords = new String[2];
        char[] splitNum = parseDigits(num);
        if(num>20) splitWords = words.split(" ");
        splitWords[0] = modifier.getTensMods().get(splitNum[0]);
        if(num>9&num<20) words = modifier.getTeenMods().get(splitNum[1]);
        return words;
    }
    public char[] parseDigits(int num) { return (""+num).toCharArray(); }
    public String modifyTens() {

    }
}