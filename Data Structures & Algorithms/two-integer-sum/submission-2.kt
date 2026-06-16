class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val subtractionMap = hashMapOf<Int, Int>()

        for (i in nums.indices) {
            if (subtractionMap.containsKey(target - nums[i])) {
                return intArrayOf(subtractionMap[target - nums[i]] ?: -1, i)
            } else {
                subtractionMap[nums[i]] = i
            }

        }

        return intArrayOf(-1, -1)
    }
}
