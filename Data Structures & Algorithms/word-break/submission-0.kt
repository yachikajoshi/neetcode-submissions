class Solution {
    fun wordBreak(s: String, wordDict: List<String>): Boolean {
        var dp = BooleanArray(s.length + 1)
        dp[s.length] = true

        for(i in (s.length - 1) downTo 0){
            for(word in wordDict){
                if(i + word.length <= s.length && s.substring(i, i+word.length)==word){
                    dp[i] = dp[i + word.length]
                }
                if(dp[i]) break
            }
        }
        return dp[0]
    }
}
