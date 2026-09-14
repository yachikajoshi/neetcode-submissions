class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if(strs.isEmpty()) return ""
        var shortestWord = strs.minBy{it.length}
        for(index in shortestWord.indices){
            val expectedChar = shortestWord[index]
            for(word in strs){
                if(word[index] != expectedChar){
                    return shortestWord.substring(0,index)
                }
            }
        }
        return shortestWord
    }
}
