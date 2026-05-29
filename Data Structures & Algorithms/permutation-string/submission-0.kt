class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
    if(s1.length > s2.length) return false
    val s1Frequency = IntArray(26)
    val s2Frequency = IntArray(26)
    val k = s1.length
    for(i in s1){
        s1Frequency[i - 'a']++
    }
    for( i in s2.indices){
        s2Frequency[s2[i] - 'a']++
        if(i >= k){
            s2Frequency[s2[i-k] - 'a']--
        }
        if (s1Frequency.contentEquals(s2Frequency)) return true
    }
    return false
    }
}
