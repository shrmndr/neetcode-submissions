class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val sHashMap = hashMapOf<Char, Int>()
        val tHashMap = hashMapOf<Char, Int>()

        for (char in s) {
            sHashMap[char] = sHashMap.getOrDefault(char, 0) + 1
        }

        for (char in t) {
            tHashMap[char] = tHashMap.getOrDefault(char, 0) + 1
        }

        for (k in sHashMap.keys) {
            if (sHashMap[k] != tHashMap[k]) return false
        }

        return true
    }
}