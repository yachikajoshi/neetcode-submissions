class Solution {
    fun islandsAndTreasure(grid: Array<IntArray>) {
        if (grid.isEmpty()) return
        val rows = grid.size
        val cols = grid[0].size

        val queue = ArrayDeque<Pair<Int, Int>>()
        val directions = arrayOf(
            intArrayOf(1,0),
            intArrayOf(-1,0),
            intArrayOf(0,1),
            intArrayOf(0,-1)
        )

        for(r in 0 until rows){
            for(c in 0 until cols){
                if(grid[r][c] == 0){
                    queue.addLast(r to c)
                }
            }
        }
        while(queue.isNotEmpty()){
            val (newRow, newCol) = queue.removeFirst()
            for(d in directions){
                val r = newRow + d[0]
                val c = newCol + d[1]
                val insideGrind = r in 0 until rows && c in 0 until cols
                if(insideGrind && grid[r][c] == Int.MAX_VALUE){
                    grid[r][c] = grid[newRow][newCol] + 1
                    queue.addLast(r to c)
                }
            }
        }
    }
}
