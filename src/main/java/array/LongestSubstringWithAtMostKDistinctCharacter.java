package array;

import java.util.Collections;
import java.util.HashMap;

//variable sliding window

/*
* Given a string s and an integer k, return the length of the longest substring of s that contains at most k distinct characters.
Example 1:

Input: s = "eceba", k = 2
Output: 3
Explanation: The substring is "ece" with length 3.
Example 2:

Input: s = "aa", k = 1
Output: 2
Explanation: The substring is "aa" with length 2.


Constraints:

1 <= s.length <= 5 * 104
0 <= k <= 50
Accepted
202,818
Submissions
441,419
* */

//sliding window approach
//algo
 /*
 1. Return s if string of length (n) < k
 2. Declare int left = 0, right = 0 and init max_substring length = k;
 3. while right  pointer is < n
     - If hashmap contains less than k characters add the current character
     in hashmap s[right] and move the right pointer to right -> right++

     - if hashmap contains K+1 distinct characters, remove the leftmost character from hashmap
     and move the left pointer so that Sliding window contains again k distinct characters only

     - Update max_length

 */

public class LongestSubstringWithAtMostKDistinctCharacter {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstringKDistinct("eceba", 2));
    }

    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        int n = s.length();
        if (n < k) {
            return n;
        }

        int left = 0, right = 0, max_length = k;
        HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
        while (right < n) {

            hashmap.put(s.charAt(right), right++);

            if (hashmap.size() == k+1) {
                //delete leftmost
                int delete_index = Collections.min(hashmap.values());
                hashmap.remove(s.charAt(delete_index));
                left = delete_index + 1;
            }
            max_length = Math.max(max_length, right - left);
        }
        return max_length;
    }
}