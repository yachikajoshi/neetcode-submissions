class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        val count = mutableMapOf<Char, Int>()
        var result = 0
        var l = 0
        var maxFrequentNum = 0
        for(r in s.indices){
            count[s[r]] = count.getOrDefault(s[r],0)+1
            maxFrequentNum = maxOf(maxFrequentNum, count[s[r]]!!)
            while (r-l+1 - maxFrequentNum > k){
                count[s[l]] = count[s[l]]!! - 1
                l++
            }
            result = maxOf(result, r - l + 1)
        }
        return result
    }
     fun maxOf(left:Int, right:Int):Int{
        if(left < right){
            return right
        } else {
            return left
        }
    }
}
