//Given a roman numeral, convert it to an integer.
//Level: Easy

//Runtime   130 ms
//Memory 	39.6 MB

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int romanToInt(String s) {
       Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);

        Integer result = 0;
        for(int i = 0; i<s.length(); i++){
            String romanChar;
            int romanNum = 0;
            try {
                romanChar = s.substring(i,i+2);
                romanNum = map.get(romanChar);
                i++;
            }catch(Exception e){
                romanChar = Character.toString(s.charAt(i));
                romanNum = map.get(romanChar);
            }
            result += romanNum;
        }

        return result;
    }

    public static void main(String args[]){
        String testCase = "III";
        int result = romanToInt(testCase);
        System.out.println(result);
    }
}