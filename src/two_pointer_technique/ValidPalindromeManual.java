package two_pointer_technique;

public class ValidPalindromeManual {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // skip invalid chars from left
            while (left < right && !isAlphaNumeric(s.charAt(left))) {
                left++;
            }

            // skip invalid chars from right
            while (left < right && !isAlphaNumeric(s.charAt(right))) {
                right--;
            }

            char c1 = toLower(s.charAt(left));
            char c2 = toLower(s.charAt(right));

            if (c1 != c2) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    // manual alphanumeric check
    private static boolean isAlphaNumeric(char ch) {
        return (ch >= 'a' && ch <= 'z') ||
                (ch >= 'A' && ch <= 'Z') ||
                (ch >= '0' && ch <= '9');
    }

    // manual lowercase conversion
    private static char toLower(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return (char)(ch + 32);
        }
        return ch;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
