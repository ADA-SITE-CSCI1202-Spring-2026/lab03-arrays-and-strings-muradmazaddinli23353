import java.util.Arrays;

public class StringUtils {

    // 7
    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }

    // 8
    public static String explode(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            result.append(str.substring(0, i + 1));
        }

        return result.toString();
    }

    // 9
    public static String sortString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    // 10
    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        return sortString(s1).equals(sortString(s2));
    }

    // 11
    public static String mixWords(String s) {

        StringBuilder sb = new StringBuilder();
        String[] s_array = s.split(" ");

        for (int i = 0; i < s_array.length; i++) {

            char[] c = s_array[i].toCharArray();

            if (c.length > 1) {
                char temp = c[0];
                c[0] = c[c.length - 1];
                c[c.length - 1] = temp;
            }

            sb.append(c);
            sb.append(" ");
        }

        return sb.toString();
    }
}
