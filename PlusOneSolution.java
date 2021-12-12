public class PlusOneSolution {
    private static int[] plusOne(int[] digits) {
        int lastIndex = digits.length - 1;
        if (digits[lastIndex] < 9) {
            digits[lastIndex] = digits[lastIndex] + 1;
        } else {
            int[] newArray = new int[digits.length + 1];
            for (int i = newArray.length-1; i > 0; i--) {
                if (digits[i] == 9) {
                    newArray[i] = 0;
                    newArray[i-1] = 1;
                } else {
                    newArray[i] = digits[i];
                }

            }
            digits = newArray;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] testCase = {9,9,9};
        int[] result = plusOne(testCase);
        System.out.println(result.length);
    }
}
