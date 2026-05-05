class Solution {
    fun numRescueBoats(people: IntArray, limit: Int): Int {
        people.sort()
        var left = 0
        var right = people.size-1
        var counter = 0
        while(left<=right){
            var sumOfLeftRight = people[left]+people[right]
            if(sumOfLeftRight <= limit){
                left++
            }
            counter++
            right--
        }
        return counter
    }
}
