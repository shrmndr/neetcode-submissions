class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        return strs.groupBy { string -> string.toCharArray().sorted() }.values.toList()
    }
}
