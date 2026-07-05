/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    var sum = Int.MIN_VALUE
    fun maxPathSum(root: TreeNode?): Int {
        dfs(root)
        return sum
    }
    fun dfs(root: TreeNode?): Int{
        if(root == null){
            return 0
        }
        val leftMax = maxOf(dfs(root.left), 0)
        val rightMax = maxOf(dfs(root.right), 0)

        sum = maxOf(sum, leftMax + rightMax + root.`val`)

        return maxOf(leftMax, rightMax) + root.`val`
    }
    fun maxOf(left: Int, right: Int): Int{
        if(left > right) return left
        else return right
    }
}
