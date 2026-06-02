class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        for(i in s){
            if(i == '(' || i == '[' || i == '{'){
                stack.addLast(i)
            }else{
                if(stack.isEmpty()) return false
                val char = stack.lastOrNull()
                if(i == ')' && char == '('
                    || i == '}' && char == '{'
                    || i == ']' && char == '['){
                        stack.removeLast()
                    }else return false
            }
        }
        return stack.isEmpty()
    }
}
