class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val row = Array(9){mutableSetOf<Char>()}
        val column = Array(9){mutableSetOf<Char>()}
        val boxes = Array(9){mutableSetOf<Char>()}

        for(r in 0 until 9){
            for(c in 0 until 9){
                val value = board[r][c]
                if(value == '.')
                    continue
                val boxIndex = (r/3) * 3 + (c/3)
                if (
                    row[r].contains(value) ||
                    column[c].contains(value) ||
                    boxes[boxIndex].contains(value)
                ) {
                    return false
                }
                row[r].add(value)
                column[c].add(value)
                boxes[boxIndex].add(value)
            }
        }

        return true
    }
}
