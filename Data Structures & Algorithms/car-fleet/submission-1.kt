class Solution {
    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
        val stackFleet = ArrayDeque<Double>()
        val cars = position.indices.map{position[it] to speed[it]}.sortedByDescending{it.first}
        for(car in cars){
            val time = (target-car.first).toDouble()/car.second
            if(stackFleet.isEmpty() || time > stackFleet.last()){
                stackFleet.addLast(time)
            }
        }
        return stackFleet.size
    }
}
