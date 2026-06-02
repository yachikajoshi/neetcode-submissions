class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        val stack = ArrayDeque<Int>()
        for( i in tokens){
            when(i){
                "+" -> stack.addLast(stack.removeLast() + stack.removeLast())
                "-" -> {
                    val a = stack.removeLast()
                    stack.addLast(stack.removeLast() - a)
                }
                "*" -> stack.addLast(stack.removeLast() * stack.removeLast())
                "/" -> {
                    val a = stack.removeLast()
                    stack.addLast(stack.removeLast() / a)
                }
                else -> stack.addLast(i.toInt())
            }
        }
        return stack.last()
    }
}
