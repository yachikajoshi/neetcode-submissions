/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun rightSideView(root: TreeNode?): List<Int> {
        if(root == null) return emptyList()

        val result = mutableListOf<Int>()
        val q = ArrayDeque(listOf(root))
        while(q.isNotEmpty()){
            var rightSide: TreeNode? = null
            var qLen = q.size
        
            while(qLen > 0){
                val node = q.removeFirst()
                    if (node != null) {
                        rightSide = node
                        node.left?.let { q.add(it) }
                        node.right?.let { q.add(it) }
                    }
                    qLen--
            }
            rightSide?.let { result.add(it.`val`) }
        }
        return result
    }
}
