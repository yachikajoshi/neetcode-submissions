class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if(s.length == 0){
            return 0
        }
        val map = hashMapOf<Char, Int>()
        var l = 0
        var longestLength = 0
       
        for(char in s.indices){
            if(s[char] in map){
                l = maxOf(map[s[char]]!!+1, l)
            }
            map[s[char]] = char
            longestLength = maxOf(longestLength, char-l+1)
        }
        return   longestLength
    }
}
