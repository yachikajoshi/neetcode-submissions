/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun isValidBST(root: TreeNode?): Boolean {
        return helper(root,null,null)
    }
    fun helper(root: TreeNode?, min: TreeNode?, max: TreeNode?): Boolean{
        if(root == null) return true
        if(min != null && root.`val` <= min.`val`){
            return false
        }
        if(max != null && root.`val` >= max.`val`){
            return false
        }
        return helper(root.left, min, root) && 
        helper(root.right, root, max)
    }
}
