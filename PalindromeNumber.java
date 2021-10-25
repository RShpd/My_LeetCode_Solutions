//Given an integer x, return true if x is palindrome integer.
//Level: Easy

//Runtime   7 ms
//Memory 	38.3 MB

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if(x<0) return false;

        String numStr = Integer.toString(x);
        int len = numStr.length();

        if(len==1) return true;
        if (len/2 == 0) return false;

        for(int i=0; i<len/2; i++){
            if(numStr.charAt(i) != numStr.charAt((len-1)-i)) return false;
        }
        return true;
    }

    public static void main(String[] args){
        int testCase = 121;
        boolean result = isPalindrome(testCase);
        System.out.println(result);
    }
}
