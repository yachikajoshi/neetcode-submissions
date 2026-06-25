/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        if(root == null) return null

        if(root?.`val` == p?.`val` || root?.`val` == q?.`val`) return root

        val leftLCA = lowestCommonAncestor(root.left, p, q)
        val rightLCA = lowestCommonAncestor(root.right, p, q)

        return if(leftLCA != null && rightLCA != null){
                root
            }else if(leftLCA != null){
                leftLCA
            }else{
                rightLCA
        }
    }
}
