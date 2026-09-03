class Solution {
    fun solveNQueens(n: Int): List<List<String>> {
        val result = mutableListOf<List<String>>()
        var board = Array(n){
            CharArray(n){'.'}
        }
        val usedColumn = HashSet<Int>()
        val usedPositiveDiagonal = HashSet<Int>()
        val usedNegativeDiagonal = HashSet<Int>()

        fun trackQueenPosition(row: Int){
            if(row == n){
                result.add(board.map{it.concatToString()})
                return
            }
            for(col in 0 until n){
                val positiveDiagonal = row + col
                val negativeDiagonal = row - col

                if(col in usedColumn || positiveDiagonal in usedPositiveDiagonal || negativeDiagonal in usedNegativeDiagonal){
                    continue
                }
                board[row][col] = 'Q'
                usedColumn.add(col)
                usedPositiveDiagonal.add(positiveDiagonal)
                usedNegativeDiagonal.add(negativeDiagonal)
                trackQueenPosition(row + 1)
                board[row][col] = '.'
                usedColumn.remove(col)
                usedPositiveDiagonal.remove(positiveDiagonal)
                usedNegativeDiagonal.remove(negativeDiagonal)
            }
        }
        trackQueenPosition(0)
        return result
    }
}
