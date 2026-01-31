class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        int[][] ans = new int[n][11];
        int count = 0;
        int[] players = new int[n];

        for(int[] p : pick) {
            int player = p[0];
            int color = p[1];

            ans[player][color]++;

            if(ans[player][color] > player && players[player] == 0) {
                count++;
                players[player] = 1;
            }
        }
        return count;
    }
}