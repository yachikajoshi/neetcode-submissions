class Solution {
    fun twoSum(arr: IntArray, target: Int): IntArray {
        var hashMap = mutableMapOf<Int, Int>()
        var intArr = IntArray(2)
        for (i in arr.indices) {
            val diff = target - arr[i]
            if (hashMap.containsKey(diff)) {
                intArr[0] = hashMap.getValue(diff)
                intArr[1] = i
                // println("Found at indices: ${hashMap[diff]} and $i")

            }
            hashMap[arr[i]] = i
        }
        return intArr
    }
}
