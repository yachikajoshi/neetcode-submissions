class Solution {
    fun characterReplacement(s: String, k: Int): Int {
           val freq = IntArray(26)
    var maxFreq = 0
    var left    = 0
    var best    = 0

    for (right in s.indices) {
        freq[s[right] - 'A']++
        maxFreq = maxOf(maxFreq, freq[s[right] - 'A'])

        if ((right - left + 1) - maxFreq > k) {
            freq[s[left] - 'A']--
            left++
        }

        best = maxOf(best, right - left + 1)
    }

    return best
    }
     fun maxOf(left: Int, right: Int): Int{
        if(left < right){
            return right
        } else {
            return left
        }
    }
}
