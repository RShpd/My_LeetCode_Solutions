public class ImplementStrSolution {
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        int index = 0;
        int i = 0;
        while(index<haystack.length() && i<needle.length()){
            if(haystack.charAt(index++) != needle.charAt(i++)){
                i = 0;
            }
        }
        return (i == needle.length()) ? index-i : -1;
    }

    public static void main(String args[]) {
        int result = strStr("hello", "ll");
        System.out.println(result);
    }
}
