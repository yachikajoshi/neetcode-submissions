class Solution {
    fun sortColors(nums: IntArray) {
        val sorted = mergeSort(nums)
        sorted.copyInto(nums)
    }
    fun mergeSort(nums: IntArray): IntArray{
         if (nums.size <= 1) return nums
        val mid = nums.size/2
        val left = mergeSort(nums.copyOfRange(0,mid))
        val right = mergeSort(nums.copyOfRange(mid,nums.size))
        return mergeColor(left,right)
    }
    fun mergeColor(left: IntArray, right: IntArray): IntArray{
        val result = IntArray(left.size + right.size)
        var i = 0
        var j = 0
        var k = 0
        while(i < left.size && j < right.size){
            if(left[i] <= right[j]) result[k++] = left[i++]
            else result[k++] = right[j++]
        }
        while(i < left.size) result[k++] = left[i++]
        while(j < right.size) result[k++] = right[j++]
        return result
    }
}
