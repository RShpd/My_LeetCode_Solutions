//Write a function to find the longest common prefix string amongst an array of strings.
//Level: easy

//Runtime: 7 ms
//Memory Usage: 39.4 MB

public class LongestCommonPrefixSolution {
    public static String longestCommonPrefix(String[] strs) {
        String pattern = strs[0];

        for (int j = 1; j < strs.length; j++) {
            int i;
            for (i = 0; i < pattern.length(); i++) {
                if (i < strs[j].length() && pattern.charAt(i) != strs[j].charAt(i)) {
                    break;
                } else if (i >= strs[j].length()){
                    break;
                }
            }
            pattern = pattern.substring(0, i);
            //if can't find any match at any point, it's not necessary to continue to search
            if (pattern.isEmpty()) return "";
        }
        return pattern;
    }

    public static void main(String args[]) {
        String[] testCase = {"dog","racecar","car"};
        String result = longestCommonPrefix(testCase);
        System.out.println(result);
    }
}
