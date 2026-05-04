class Solution {
       fun twoSum(numbers: IntArray, target: Int): IntArray {
        var left = 0
        var right = numbers.size - 1
         
        while (left < right) {
            if(numbers[left] == numbers[right]){
              return intArrayOf()
         }
            var sum = numbers[left] + numbers[right]
            if (sum == target) {
                return intArrayOf(left + 1, right + 1)
            }
            if (sum < target) {
                left++
            } else {
                right--
            }
        }
        return intArrayOf()
    }
}
