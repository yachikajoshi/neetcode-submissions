class MinStack() {
    val mainStack = ArrayDeque<Int>()
    val minStack = ArrayDeque<Int>()
    fun push(`val`: Int) {
        mainStack.addLast(`val`)
        minStack.addLast(
            if(minStack.isEmpty()) `val`
            else minOf(`val`, minStack.last())
        )
    }

    fun pop() {
        minStack.removeLast()
        mainStack.removeLast()
    }

    fun top(): Int {
        return mainStack.last()
    }

    fun getMin(): Int {
        return minStack.last()
    }
    private fun minOf(left : Int, right : Int):Int{
        if(left< right){
            return left
        }else return right
    }
}
