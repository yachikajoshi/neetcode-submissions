class Solution {
    fun partition(s: String): List<List<String>> {
        val result = mutableListOf<List<String>>()
        val partition = mutableListOf<String>()
        fun findpalindromSubstring(index: Int){
            if(index >= s.length){
                result.add(partition.toList())
                return
            }
            for(i in index until s.length){
                if(isPealindrome(s.substring(index , i + 1))){
                    partition.add(s.substring(index , i + 1))
                    findpalindromSubstring(i+1)
                    partition.removeAt(partition.lastIndex)
                }
            }
        }
        findpalindromSubstring(0)
        return result
    }
    fun isPealindrome(s:String):Boolean{
        var i = 0
        var j = s.length - 1
        while(i <= j){
            if(s[i] != s[j]){
                return false
            }
            i++
            j--
        }
        return true
    }
}
