class TimeMap() {
    val keyStore = HashMap<String, MutableList<Pair<String, Int>>>()

    fun set(key: String, value: String, timestamp: Int) {
        if(!keyStore.containsKey(key)){
            keyStore[key] = mutableListOf()
        }
        keyStore[key]!!.add(Pair(value,timestamp))
    }

    fun get(key: String, timestamp: Int): String {
        var result = ""
        var values = keyStore[key] ?: return result
        var l = 0
        var h = values.size - 1
        while(l<=h){
            val mid = (l+h)/2
            if(values[mid].second <= timestamp){
                result = values[mid].first
                l = mid + 1
            }else{
                h = mid - 1
            }
        }
        return result
    }
}