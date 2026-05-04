class Solution {
  fun isPalindrome(s: String): Boolean {
    val newString = s.replace(" ","")
    var left = 0
    var right = newString.length - 1
    while (left < right) {
        while (left < right && !isAlphaNumericChar(newString[left])) {
            left++
        }
        while (left < right && !isAlphaNumericChar(newString[right])) {
            right--
        }
        if (newString[left].lowercaseChar() != newString[right].lowercaseChar()) {
            return false
        }
        left++
        right--
    }

    return true
}

fun isAlphaNumericChar(char: Char): Boolean {
    val regex = Regex("[A-Za-z0-9]")
    return regex.matches(char.toString())
}
}
