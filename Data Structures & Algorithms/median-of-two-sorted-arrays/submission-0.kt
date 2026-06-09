class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val (arr1, arr2) = if(nums1.size <= nums2.size) 
            nums1 to nums2 
        else 
            nums2 to nums1

        val n1 = arr1.size
        val n2 = arr2.size
        var l = 0
        var h = n1
        var left = (n1 + n2 + 1)/2
        val n = n1 + n2
        while(l <= h){
            val mid1 = (l + h)/2
            val mid2 = left - mid1
            var l1 = Int.MIN_VALUE
            var l2 = Int.MIN_VALUE
            var r1 = Int.MAX_VALUE
            var r2 = Int.MAX_VALUE
            if(mid1 < n1) r1 = arr1[mid1]
            if(mid2 < n2) r2 = arr2[mid2]
            if(mid1 - 1 >= 0) l1 = arr1[mid1 - 1]
            if(mid2 - 1 >= 0) l2 = arr2[mid2 - 1]
            if(l1 <= r2 && l2 <= r1){
                if(n%2 == 1) return max(l1,l2).toDouble()
                return (max(l1,l2)+min(r1,r2))/2.0
            }else if(l1 > r2) h = mid1 - 1
            else l = mid1 + 1
        }
        return 0.0
    }
    fun max(left: Int, right: Int):Int{
        if(left > right){
            return left
        }else return right
    }
    fun min(left: Int, right: Int):Int{
        if(left < right){
            return left
        }else return right
    }
}
