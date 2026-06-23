/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    private var ans = 0
    fun diameterOfBinaryTree(root: TreeNode?): Int {
        height(root)
        return ans
    }
    fun height(root: TreeNode?):Int{
        if(root == null) return 0
        var leftHeight = height(root?.left)
        var rightHeight = height(root?.right)
        ans = maxOf(ans, leftHeight + rightHeight)
        return maxOf(leftHeight, rightHeight)+1
    }
    fun maxOf(left:Int, right:Int): Int{
        return if (left > right) left
           else right
    }
}
