class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
    val n = nums.size - 1
    var productResult = IntArray(nums.size)

    var leftProduct = 1
    for(i in nums.indices){
        productResult[i] = leftProduct
        leftProduct *=nums[i]
    }
    var rightProduct = 1
    for(i in n downTo 0){
        productResult[i] *= rightProduct
        rightProduct *= nums[i]
    }
    return productResult
    }
}
