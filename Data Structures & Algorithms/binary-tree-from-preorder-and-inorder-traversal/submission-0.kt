/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {

fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
        val inorderIndex = HashMap<Int, Int>()
        for (i in inorder.indices) {
            inorderIndex[inorder[i]] = i
        }

        var preIdx = 0

        fun build(inorderStart: Int, inorderEnd: Int): TreeNode? {
            if (inorderStart > inorderEnd) return null

            val rootVal = preorder[preIdx]
            preIdx++ 

            val root = TreeNode(rootVal)
            val mid = inorderIndex[rootVal]!!

            root.left = build(inorderStart, mid - 1)
            root.right = build(mid + 1, inorderEnd)

            return root
        }

        return build(0, inorder.size - 1)
    }
}
