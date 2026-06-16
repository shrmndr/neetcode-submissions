class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
    
        val resultMap = hashMapOf<String, MutableList<String>>()
    
        strs.forEach { string ->
            val sortedString = string.toCharArray().sorted().toString()
        
            if (resultMap.containsKey(sortedString)) {
                resultMap[sortedString]!!.add(string)
            } else {
                resultMap[sortedString] = mutableListOf(string)
            }
        }
    
        return resultMap.values.toList()
    }
}
