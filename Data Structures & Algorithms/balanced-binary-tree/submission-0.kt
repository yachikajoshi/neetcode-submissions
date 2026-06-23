/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun isBalanced(root: TreeNode?): Boolean {
       return height(root) != -1
    }
    fun height(root: TreeNode?):Int{
        if (root == null) return 0 
        var left = height(root?.left)
        if (left == -1) return -1
        var right = height(root?.right)
        if (right == -1) return -1
        if (Math.abs(left - right) > 1) return -1
        return maxOf(left, right) + 1
    }
    fun maxOf(left:Int, right:Int): Int{
        return if (left > right) left
           else right
    }

}
