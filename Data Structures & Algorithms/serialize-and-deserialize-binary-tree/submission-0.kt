/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Codec {
    // Encodes a tree to a single string.
    fun serialize(root: TreeNode?): String {
        if(root == null) return "N"
        val serializedString = mutableListOf<String>()
        val queue: Queue<TreeNode?> = LinkedList()
        queue.add(root)
        
        while(queue.isNotEmpty()){
            val node = queue.poll()
            if(node == null){
                serializedString.add("N")
            } else {
                serializedString.add(node.`val`.toString())
                queue.add(node.left)
                queue.add(node.right)
            }
        }
        return serializedString.joinToString(",")
    }

    // Decodes your encoded data to tree.
    fun deserialize(data: String): TreeNode? {
        val values = data.split(",")
        if(values[0] == "N") return null

        val root = TreeNode(values[0].toInt())
        val queue: Queue<TreeNode> = LinkedList()
        queue.add(root)

        var index = 1

        while(queue.isNotEmpty() && index < values.size){
            val node = queue.poll()
            if(values[index] != "N"){
                node.left = TreeNode(values[index].toInt())
                queue.add(node.left!!)
            }
            index++
            if(index < values.size && values[index] != "N"){
                node.right = TreeNode(values[index].toInt())
                queue.add(node.right!!)
            }
            index++
        }
        return root
    }
}
