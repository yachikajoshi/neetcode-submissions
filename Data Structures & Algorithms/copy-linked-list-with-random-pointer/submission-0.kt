/*
// Definition for a Node.
class Node(var `val`: Int) {
    var next: Node? = null
    var random: Node? = null
}
*/

class Solution {
    fun copyRandomList(head: Node?): Node? {
        if(head == null){
            return head
        }
        val map = mutableMapOf<Node, Node>()
        var l1: Node? = head
        while(l1 != null){
            var newNode = Node(l1.`val`)
            map[l1] = newNode
            l1 = l1.next
        }
        var temp = head
        while(temp != null){
            val copyNode = map[temp]
            copyNode?.next = map[temp.next]
            copyNode?.random = map[temp.random]
            temp = temp.next
        }
        return map[head]
    }
}
