class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;
        
        if (n >= 4) {
            for (int i = 4; i <= n; i++) {
                dp[i] = (dp[i-1] + dp[i-2]) % 1234567;
            }
        }
        
        answer = dp[n];
    
        
        return answer;
    }
}