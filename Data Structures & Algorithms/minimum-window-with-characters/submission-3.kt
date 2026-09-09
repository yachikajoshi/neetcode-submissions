class Solution {
    fun minWindow(s: String, t: String): String {
        if(t.isEmpty() || t.length > s.length) return ""
        val requiredFreq = mutableMapOf<Char,Int>()
        for(char in t){
            requiredFreq[char] = requiredFreq.getOrDefault(char,0)+1
        }
        var windowFreq = mutableMapOf<Char,Int>()
        val requiredChar = requiredFreq.size
        var left = 0
        var matchedChar = 0
        var minLength = Int.MAX_VALUE
        var minWindowStart = 0

        for(right in s.indices){
            val rightChar = s[right]
            windowFreq[rightChar] = windowFreq.getOrDefault(rightChar,0)+1
            if(rightChar in requiredFreq &&  windowFreq[rightChar]!! ==  requiredFreq[rightChar]!!){
                matchedChar++
            }
        
            while(requiredChar == matchedChar){
                val currentWindowSize = right - left + 1
                if(currentWindowSize < minLength){
                    minLength = currentWindowSize
                    minWindowStart = left
                }
                val leftChar = s[left]
                windowFreq[leftChar] = windowFreq.getOrDefault(leftChar, 0) - 1
                if(leftChar in requiredFreq && windowFreq[leftChar]!! < requiredFreq[leftChar]!!){
                    matchedChar--
                }
                left++
            }
        }
        return if (minLength == Int.MAX_VALUE) "" else s.substring(minWindowStart, minWindowStart + minLength)
    }
}
