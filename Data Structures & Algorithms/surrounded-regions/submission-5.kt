class Solution {
    fun solve(board: Array<CharArray>) {
        val rows = board.size
        val cols = board[0].size
        fun dfs(r:Int, c:Int){
            if(r < 0 || c < 0 || r >= rows || c >= cols || board[r][c] != 'O'){
                return
            }
            board[r][c] = 'S'
            dfs(r + 1, c)
            dfs(r - 1, c)
            dfs(r, c + 1)
            dfs(r, c - 1)
        }
        for(r in 0 until rows){
            for(c in 0 until cols){
                val isBoundary =
                    r == 0 ||
                    r == rows - 1 ||
                    c == 0 ||
                    c == cols - 1

                if (isBoundary && board[r][c] == 'O') {
                    dfs(r,c)
                }
            }
        }
        for (row in 0 until rows) {
            for (col in 0 until cols) {
                if (board[row][col] == 'O') {
                    board[row][col] = 'X'
                } else if (board[row][col] == 'S') {
                    board[row][col] = 'O'
                }
            }
        }
    }
}
