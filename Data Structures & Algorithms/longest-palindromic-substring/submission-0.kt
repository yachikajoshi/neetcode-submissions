class Solution {
    fun longestPalindrome(s: String): String {
        var resIdx = 0
        var resLen = 0
        fun loopWhile(left:Int, right:Int){
            var l= left; var r = right
            while (l >= 0 && r < s.length && s[l] == s[r]) {
                if (r - l + 1 > resLen) {
                    resIdx = l
                    resLen = r - l + 1
                }
                l--
                r++
            }
        }
        for (i in s.indices) {
            // odd length
            var l = i
            var r = i
            loopWhile(l,r)
            

            // even length
            l = i
            r = i + 1
            loopWhile(l,r)
        }

        return s.substring(resIdx, resIdx + resLen)
    }
}
