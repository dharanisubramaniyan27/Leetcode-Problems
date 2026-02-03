class Solution {
    public boolean scoreBalance(String s) {
        int n = s.length();
        
        int prefix = 0;

        for (int i=0; i<n; i++) {
            prefix += s.charAt(i) - 'a' + 1;
        }

        int current = 0;

        for (int i=0; i<n; i++) {
            current += s.charAt(i) - 'a' + 1;
            if (prefix - current == current) {
                return true;
            }
        }

        return false;
    }
}