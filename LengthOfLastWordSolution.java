//Given a string s consisting of some words separated by some number of spaces,
// return the length of the last word in the string.
//Level: easy

//Runtime: 1ms
//Memory:  36.9 MB

public class LengthOfLastWordSolution {
    private static int lengthOfLastWord(String s) {
        int len = 0;
        s = s.trim();
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                len = 0;
            } else {
                len++;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int result = lengthOfLastWord("luffy is still joyboy");
        System.out.println(result);
    }
}
