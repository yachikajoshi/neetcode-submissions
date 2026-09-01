class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val seen = HashSet<Int>()
        for (n in nums) {
            if (!seen.add(n)) {
                return true
            }
        }
        return false
    }
}
