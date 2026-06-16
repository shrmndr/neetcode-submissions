class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val resultSet = HashSet<Int>()
        for (num in nums) {
            if (resultSet.contains(num)) return true
            resultSet.add(num)
        }

        return false
    }
}