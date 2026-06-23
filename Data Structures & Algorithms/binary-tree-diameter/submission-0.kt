/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun diameterOfBinaryTree(root: TreeNode?): Int {
        if(root == null) return 0
        var leftDiameter = diameterOfBinaryTree(root?.left)
        var rightDiameter = diameterOfBinaryTree(root?.right)
        val currentDiameter = height(root?.left) + height(root?.right)
        return maxOf(leftDiameter,rightDiameter,currentDiameter)
    }
    fun height(root: TreeNode?):Int{
        if(root == null) return 0
        var leftHeight = height(root?.left)
        var rightHeight = height(root?.right)
        return maxOf(leftHeight, rightHeight)+1
    }
     fun maxOf(left:Int, right:Int, length:Int): Int{
          return if (left >= right && left >= length) left
           else if (right >= left && right >= length) right
           else length
    }
}
