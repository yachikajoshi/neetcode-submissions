/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
        if(root == null || subRoot == null) return false
        if(root.`val` == subRoot.`val` && isIdentical(root, subRoot)){
            return true
        }
        return isSubtree(root?.left, subRoot) || isSubtree(root?.right, subRoot)
    }
    fun isIdentical(p: TreeNode?, q: TreeNode?):Boolean{
        if (p == null && q == null) return true 
        if (p == null || q == null) return false
        if(p?.`val` != q?.`val`) return false
        
        val isLeft = isIdentical(p?.left, q?.left)
        val isRight = isIdentical(p?.right, q?.right)
        return isLeft && isRight
    }
}
