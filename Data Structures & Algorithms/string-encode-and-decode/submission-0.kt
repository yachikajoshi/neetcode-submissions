class Solution {

  
  fun encode(strs: List<String>): String {
	val sb = StringBuilder()
    for(s in strs){
        sb.append("${s.length}#${s}")
    }
    return sb.toString()
    }

    fun decode(str: String): List<String> {
		var list = mutableListOf<String>()
        var indexOfFirstChar = 0 // will be the starting index of each char
       
        while(indexOfFirstChar < str.length){
            
            var countOfCharDigit = indexOfFirstChar
            while(str[countOfCharDigit].equals('#').not()){
                countOfCharDigit++ // count of digit char
            }
            val lengthOfAWord = str.substring(indexOfFirstChar, countOfCharDigit).toInt()
            countOfCharDigit++
            
            val word = str.substring(countOfCharDigit,countOfCharDigit + lengthOfAWord)
            list.add(word)
            indexOfFirstChar = countOfCharDigit + lengthOfAWord // update the index for next word
            
        }
        println(list)
        return list
    }
}
