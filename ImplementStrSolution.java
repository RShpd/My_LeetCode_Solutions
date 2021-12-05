//Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//Level: easy

//Runtime: 1591 ms   It's the time when I saw the impact of an on time return!
//Memory Usage: 39.3 MB

public class ImplementStrSolution {
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        if (haystack.isEmpty() || haystack.length() < needle.length()) return -1;
        int i = 0;

        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int j;
                for (j = 0; j < needle.length(); j++) {
                    if (haystack.length() <= i + j) return -1;  //if you replace this return statement with a break, you will encounter a time limit exceed
                    if (haystack.charAt(i + j) != needle.charAt(j)) break;
                }
                if (j == needle.length()) return i;
            }
            i++;
        }
        return -1;
    }

    public static void main(String args[]) {
        int result = strStr("mississippi", "issipi");
        System.out.println(result);
    }
}