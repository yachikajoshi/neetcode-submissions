/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
        val dummyNode = ListNode(0)
        dummyNode.next = head
        var groupPrev: ListNode? = dummyNode
        
        while(true){
            val kth = getKth(groupPrev, k)
            if(kth == null){
                break
            }
            val groupNext = kth.next
            var prev:ListNode? = groupNext
            var current = groupPrev!!.next
            
            while(current != groupNext){
                val temp = current!!.next
                current.next = prev
                prev = current
                current = temp
            }
            val temp = groupPrev.next
            groupPrev.next = kth
            groupPrev = temp
        }
        return dummyNode.next
    }
    private fun getKth(curr: ListNode?, k: Int): ListNode? {
        var currrent = curr
        var k = k
        while (currrent != null && k > 0) {
            currrent = currrent.next
            k--
        }
        return currrent
    }
}
