//Given a roman numeral, convert it to an integer.
//Level: Easy

class Solution {
    public int romanToInt(String s) {
       Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("I", new Integer(1));
        map.put("IV", new Integer(4));
        map.put("V", new Integer(5));
        map.put("IX", new Integer(9));
        map.put("X", new Integer(10));
        map.put("XL", new Integer(40));
        map.put("L", new Integer(50));
        map.put("XC", new Integer(90));
        map.put("C", new Integer(100));
        map.put("CD", new Integer(400));
        map.put("D", new Integer(500));
        map.put("CM", new Integer(900));
        map.put("M", new Integer(1000));

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