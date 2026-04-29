class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
             var hashMap = mutableMapOf<List<Int>,MutableList<String>>() 
        var list = mutableListOf<List<String>>()

       for(s in strs){
           
           val countChar = IntArray(26)
           
           
           for(char in s){
               
               countChar[char - 'a']++
            
           }
           
        val key = countChar.toList()

        if (!hashMap.containsKey(key)) {
            hashMap[key] = mutableListOf()
        }
        hashMap[key]?.add(s)
           
       }
       list.addAll(hashMap.values)
       return list
    }
}
