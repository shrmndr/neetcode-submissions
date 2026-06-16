class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val resultMap = mutableMapOf<Int, Int>()
        
        for (i in nums.indices) {
            if (resultMap.containsKey(nums[i])) return true
            resultMap[nums[i]] = i 
        }
        
        return false
    }
}