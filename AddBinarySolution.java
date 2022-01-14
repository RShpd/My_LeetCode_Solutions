///Given two binary strings a and b, return their sum as a binary string.
//Level: easy

//Runtime: 26ms
//Memory:  41.7 MB

public class AddBinarySolution {
    private static String addBinary(String a, String b) {
        int len = Math.max(a.length(), b.length());
        int[] x = new int[len];
        int[] y = new int[len];

        if (a.length() < len) {
            a = String.format("%1$" + len + "s", a).replace(' ', '0');
        } else if (b.length() < len) {
            b = String.format("%1$" + len + "s", b).replace(' ', '0');
        }

        for (int i = len - 1; i >= 0; i--) {
            //subtract by '0' to convert the numbers from a char type into an int
            x[i] = a.charAt(i) - '0';
            y[i] = b.charAt(i) - '0';
        }

        String result = "";
        int temp = 0;
        for (int i = len - 1; i >= 0; i--) {
            int sum = x[i] + y[i] + temp;
            temp = (sum>1) ? 1 : 0;
            result = Integer.toString(sum%2).concat(result);
        }
        if (temp == 1) result = "1".concat(result);
        return result;
    }

    public static void main(String[] args) {
        String str1 = "1010";
        String str2 = "1011";
        String result = addBinary(str1, str2);
        System.out.println(result);
    }
}
