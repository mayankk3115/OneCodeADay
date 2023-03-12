public class LongestPalindromicSubstring {

    public static void main(String[] args) {

        String str = "abaxyzzyxf";
        String result = findLongestPalindromeString(str);
        System.out.printf("The Longest Substring is: "+ result );
    }

    public static String findLongestPalindromeString(String str) {

        int n = str.length();
        int start = 0;
        int maxLength = 1;

        for (int i = 0; i < n; i++) {

            //Case when Palidrome length is odd
            int left = i - 1;
            int right = i + 1;
            while (left >= 0 && right < n && str.charAt(left) == str.charAt(right)) {
                left--;
                right++;
            }
            int length = right - left - 1;
            if (length > maxLength) {
                maxLength = length;
                start = left + 1;
            }

            // Case when Palindrome length is even
            left = i;
            right = i + 1;
            while (left >= 0 && right < n && str.charAt(left) == str.charAt(right)) {
                left--;
                right++;
            }
            length = right - left - 1;
            if (length > maxLength) {
                maxLength = length;
                start = left + 1;
            }
        }
        return str.substring(start, start + maxLength);
    }
}
