/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    var orderCount = 0
    fun kthSmallest(root: TreeNode?, k: Int): Int {
        if(root == null) return -1
        if(root.left != null){
            val leftNode = kthSmallest(root.left,k)
            if(leftNode != -1){
                return leftNode
            }
        }
        if(k == orderCount + 1){
            return root.`val`
        }
        orderCount += 1
        if(root.right != null){
            val rightNode = kthSmallest(root.right,k)
            if(rightNode != -1){
                return rightNode
            }
        }
        return -1
    }
}
