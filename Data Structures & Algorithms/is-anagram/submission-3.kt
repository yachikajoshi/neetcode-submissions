class Solution {
    fun isAnagram(s: String, t: String): Boolean {
var hashmap1 = mutableMapOf<Char,Int>()
var hashmap2 = mutableMapOf<Char,Int>()
if(s.length != t.length) return false
for(char in s)
{
hashmap1[char] = hashmap1.getOrDefault(char, 0)+1
}
for(char in t)
{
    hashmap2[char] = hashmap2.getOrDefault(char, 0)+1
   
}
return hashmap1.equals(hashmap2)}
}
