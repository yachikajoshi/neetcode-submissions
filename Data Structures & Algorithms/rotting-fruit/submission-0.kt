class Solution {
    fun orangesRotting(grid: Array<IntArray>): Int {
        val rows = grid.size
        val cols = grid[0].size
        var fresh = 0
        var time = 0

        for(r in 0 until rows){
            for(c in 0 until cols){
                if(grid[r][c] == 1){
                    fresh++
                }
            }
        }

        val directions = arrayOf(
            intArrayOf(1,0),
            intArrayOf(-1,0),
            intArrayOf(0,1),
            intArrayOf(0,-1)
        )

        while(fresh > 0){
            var flag = false
            for(r in 0 until rows){
                for(c in 0 until cols){
                    if(grid[r][c] == 2){
                        for(d in directions){
                            val newRow = r + d[0]
                            val newCol = c + d[1]
                            if(newRow in 0 until rows && newCol in 0 until cols && grid[newRow][newCol] == 1){
                                grid[newRow][newCol] = 3
                                fresh--
                                flag = true
                            }
                        }
                    }
                }
            }

        if(!flag)return -1
        
        for(r in 0 until rows){
            for(c in 0 until cols){
                if(grid[r][c] == 3){
                   grid[r][c] = 2
                }
            }
        }
        time++
    }
    return time
}
}
