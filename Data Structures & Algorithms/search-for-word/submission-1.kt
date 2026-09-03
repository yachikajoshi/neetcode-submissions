class Solution {
    fun exist(board: Array<CharArray>, word: String): Boolean {
        val ROW = board.size
        val COL = board[0].size

        fun findWord(r: Int, c: Int, i: Int): Boolean{
            if(i == word.length) return true
            if(r < 0 || c < 0 || r >= ROW || c >= COL || board[r][c] != word[i]) return false
            val temp = board[r][c]
            board[r][c] = '#'
            val result = (
                findWord(r+1,c,i+1) ||
                findWord(r-1,c,i+1) ||
                findWord(r,c+1,i+1) ||
                findWord(r,c-1,i+1)
            )
            board[r][c] = temp
            return result
        }
        for(r in 0 until ROW){
            for(c in 0 until COL){
                if(findWord(r,c,0)){
                    return true
                }
            }
        }
        return false
    }
}
