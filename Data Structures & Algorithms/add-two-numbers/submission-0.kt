/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var temp1 = l1
        var temp2 = l2
        var dummyNode = ListNode(-1)
        var current = dummyNode
        var carry = 0
        while(temp1 != null || temp2 != null){
            var sum = carry
            if(temp1 != null){
                sum = sum + temp1.`val`
            }
            if(temp2 != null){
                sum += temp2.`val`
            }
            val newNode = ListNode(sum % 10)
            carry = sum / 10
            current?.next = newNode
            current = current.next!!
            if(temp1 != null){
                temp1 = temp1.next
            }
            if(temp2 != null){
                temp2 = temp2.next
            }
        }
        if(carry!=0){
            current?.next = ListNode(carry)
        }
        return dummyNode?.next
    }
}