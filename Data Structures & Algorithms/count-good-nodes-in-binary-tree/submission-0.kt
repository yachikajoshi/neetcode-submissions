/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    var goodNodes = 0
    fun goodNodes(root: TreeNode?): Int {
        return goodCountNode(root, Int.MIN_VALUE)
    }
    fun goodCountNode(node: TreeNode?, maxSoFar: Int):Int{
        var max = maxSoFar
        if(node == null) return 0
        var count = 0
        if(node.`val` >= max){
            count +=1
            max = node.`val`
        } 
        count += goodCountNode(node.left, max)
        count += goodCountNode(node.right, max)
        return count
    }
}
