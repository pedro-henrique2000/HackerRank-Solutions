package solutions;

public class RepeatedString {

    public static void main(String[] args) {
        System.out.println(repeatedString("aba", 10l));
    }

    public static long repeatedString(String s, long n) {
        int aQuantityString = 0;
        int aQuantitySubString = 0;

        if (!s.contains("a"))
            return 0;

        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == 'a') aQuantityString++;

        for (int i = 0; i < n % s.length(); i++)
            if (s.charAt(i) == 'a') aQuantitySubString++;

        return (n / s.length() * aQuantityString) + aQuantitySubString;
    }


}
