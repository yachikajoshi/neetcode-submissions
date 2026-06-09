class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        val rows = matrix.size
        val cols = matrix[0].size
        var low = 0
        var high = rows * cols - 1
        while(low <= high){
            val mid = (low + (high)) / 2
            println(mid)
            val row = mid / cols
            val col = mid % cols
            if(matrix[row][col] == target){
                return true
            }
            if(matrix[row][col] > target){
                high = mid - 1
            }
            if(matrix[row][col] < target){
                low = mid + 1
            }
        }
         return false
    }
}
