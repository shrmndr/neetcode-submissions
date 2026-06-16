class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {

        val resultMap = HashMap<List<Int>, MutableList<String>>()

        strs.forEach { string ->
            val charsCounterList = MutableList(26) { 0 }
            string.toCharArray().forEach { char ->
                charsCounterList[char - 'a']++
            }

            resultMap.getOrPut(charsCounterList) { mutableListOf() }.add(string)
        }

        return resultMap.values.toList()
    }
}
