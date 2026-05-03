package arrays;

public class FirstNonRepeating {

    public static void main(String[] args) {

        String s = "aabbcdde";
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        char result = '#';

        for (char c : s.toCharArray()) {
            if (freq[c - 'a'] == 1) {
                result = c;
                break;
            }
        }

        if (result == '#') {
            System.out.println("No non repeating character");
        } else {
            System.out.println("First non-repeating character: " + result);
        }
    }
}
