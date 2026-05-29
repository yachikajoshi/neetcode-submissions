class Solution {
    fun minWindow(s: String, t: String): String {
        if(t.length > s.length) return ""
        val map = mutableMapOf<Char,Int>()
        for(i in t){
            map[i] = map.getOrDefault(i,0)+1
        }
        var l = 0
        var windowFreq = mutableMapOf<Char,Int>()
        var have = 0
        var need = map.size
        var result = Int.MAX_VALUE
        var resL = 0; var resR = 0

        for(r in s.indices){
            val c = s[r]
            windowFreq[c] = windowFreq.getOrDefault(c,0)+1
            if(c in map &&  windowFreq[c]!! ==  map[c]!!){
                have++
            }
        
            while(have == need){
                if (r - l + 1 < result) {
                result = r - l + 1
                resL = l
                resR = r   
            }
                if(s[l] in map && windowFreq[s[l]]!! ==  map[s[l]]!!) have--
                windowFreq[s[l]]=windowFreq.getOrDefault(s[l],0)-1
                l++
            }
        }
        return if (result == Int.MAX_VALUE) "" else s.substring(resL, resR + 1)
    }
    fun minOf(l : Int, r: Int):Int{
        if(l<r){
            return l
        }else return r
    }
}
