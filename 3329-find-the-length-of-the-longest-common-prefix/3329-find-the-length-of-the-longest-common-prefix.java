import java.util.Arrays;

class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        // Convert numbers to strings for easier prefix matching
        String[] str1 = Arrays.stream(arr1).mapToObj(String::valueOf).toArray(String[]::new);
        String[] str2 = Arrays.stream(arr2).mapToObj(String::valueOf).toArray(String[]::new);
        
        // Sort both arrays to optimize the search
        Arrays.sort(str1);
        Arrays.sort(str2);
        
        int maxLength = 0;
        int i = 0, j = 0;

        // Use two pointers to compare elements in sorted order
        while (i < str1.length && j < str2.length) {
            int commonLength = commonPrefixLength(str1[i], str2[j]);
            maxLength = Math.max(maxLength, commonLength);

            // Move the pointer with the smaller value to find a better match
            if (str1[i].compareTo(str2[j]) < 0) {
                i++;
            } else {
                j++;
            }
        }
        
        return maxLength;
    }

    private int commonPrefixLength(String s1, String s2) {
        int length = 0;
        int minLength = Math.min(s1.length(), s2.length());

        for (int i = 0; i < minLength; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                length++;
            } else {
                break;
            }
        }

        return length;
    }
}
