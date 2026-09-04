/*
Definition for a Node.
class Node(var `val`: Int) {
    var neighbors: ArrayList<Node?> = ArrayList()
}
*/

class Solution {
    val oldToNew = HashMap<Node, Node>()

    fun cloneGraph(node: Node?): Node? {
        if(node == null) return null
        val cloned = clone(node)
        return cloned
    }
    fun clone(node: Node): Node{
            if(node in oldToNew){
                return oldToNew[node]!!
            }

            val copy = Node(node.`val`)
            oldToNew[node] = copy

            for(nei in node.neighbors){
                copy.neighbors.add(clone(nei!!))
            }
            return copy
        }
}
