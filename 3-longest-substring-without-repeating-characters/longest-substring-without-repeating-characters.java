import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        /* 
        *  IP: abcabcbb
        *  OP: 3, since 'abc' 'cab' are with unique letters if so return 3 (length)
        *  APPROACH:
        *    a b c a b c b b
        *    ^   ^
        */

        int left = 0;
        int maxLength = 0;

        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}