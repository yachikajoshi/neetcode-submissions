class Solution {
    fun twoSum(arr: IntArray, target: Int): IntArray {
        var hashMap = mutableMapOf<Int, Int>()
        var intArr = IntArray(2)
        for ((index, num) in arr.withIndex()) {
            val diff = target - num
            if (hashMap.containsKey(diff)) {
                intArr[0] = hashMap.getValue(diff)
                intArr[1] = index
                // println("Found at indices: ${hashMap[diff]} and $i")

            }
            hashMap[num] = index
        }
        return intArr
    }
}
