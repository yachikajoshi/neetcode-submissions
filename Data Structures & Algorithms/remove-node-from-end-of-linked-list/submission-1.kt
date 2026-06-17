/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var slow = head
        var fast = head
        for(i in 0 until n){
            fast = fast?.next
        }
        if (fast == null) {
            return head?.next
        }
        while(fast?.next != null){
            slow = slow?.next
            fast = fast?.next
        }
        slow?.next = slow?.next?.next
        return head
    }
}
