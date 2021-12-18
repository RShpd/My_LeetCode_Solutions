//You are given a large integer represented as an integer array digits,
// where each digits[i] is the ith digit of the integer.
//Level: easy

//Runtime: 0ms
//Memory:  37.3 MB

public class PlusOneSolution {
    private static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = (digits[i] + 1) % 10;
            if (digits[i] > 0) break;
            if(i==0 && digits[i] == 0){
                int[] newArray = new int[digits.length + 1];
                newArray[0] = 1;
                int j = 1;
                for (int n: digits) {
                    newArray[j++] = n;
                }
                return newArray;
            }
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] testCase = {8, 9, 9};
        int[] result = plusOne(testCase);
        System.out.println(result.length);
    }
}
