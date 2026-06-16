class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val resultSet = HashSet<Int>()
        for (num in nums) {
            resultSet.add(num)
        }        
        
        return resultSet.size != nums.size
    }
}