class Solution {
    fun isAnagram(s: String, t: String): Boolean {
var hashmap = mutableMapOf<Char,Int>()
if(s.length != t.length) return false
for(char in s)
{
hashmap[char] = hashmap.getOrDefault(char, 0)+1
}
for(char in t)
{
    val count = hashmap[char] ?: return false
    if (count == 0) return false
hashmap[char] = count - 1
}
return true
}
}
