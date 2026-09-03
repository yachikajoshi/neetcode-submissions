class Solution {
    fun letterCombinations(digits: String): List<String> {
        if(digits.isEmpty()) return emptyList()
        val result = mutableListOf<String>()
        val digitToChar = mapOf(
            '2' to "abc",
            '3' to "def",
            '4' to "ghi",
            '5' to "jkl",
            '6' to "mno",
            '7' to "pqrs",
            '8' to "tuv",
            '9' to "wxyz",
        )
        fun bakcTrack(i : Int, currentString: String){
            if(currentString.length == digits.length){
                result.add(currentString)
                return
            }
            for(c in digitToChar[digits[i]]!!){
                bakcTrack(i + 1, currentString + c)
            }
        }
        bakcTrack(0, "")
        return result
    }
}