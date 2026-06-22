/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun maxDepth(root: TreeNode?): Int {
        if(root == null) return 0
        var leftHeight = maxDepth(root?.left)
        var rightHeight = maxDepth(root?.right)
        return maxOf(leftHeight, rightHeight)+1
    }
    fun maxOf(left:Int, right:Int): Int{
        if(left > right)
            return left
        else return right
    }
}
