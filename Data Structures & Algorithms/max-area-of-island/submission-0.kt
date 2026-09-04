class Solution {
    fun maxAreaOfIsland(grid: Array<IntArray>): Int {
        if(grid.isEmpty()) return 0

        val rows = grid.size
        val cols = grid[0].size
        var maxIsland = 0
        fun dfs(r: Int, c: Int): Int{

            if(r < 0 || c < 0 || r >= rows || c >= cols ){
                return 0
            }
            if (grid[r][c] != 1) {
                return 0
            }
            grid[r][c] = 0

            val area = 1 + dfs(r + 1, c) + dfs(r - 1, c) + dfs(r, c + 1) + dfs(r, c - 1)
            return area
        }

        for(r in 0 until rows){
            for(c in 0 until cols){
                if(grid[r][c] == 1){
                    val areaOfIsland = dfs(r, c)
                    maxIsland = maxOf(maxIsland, areaOfIsland)
                }
            }
        }
        return maxIsland
    }
    fun maxOf(right : Int, left:Int):Int{
        return if(right > left){
                right
            } else left
    }
}
