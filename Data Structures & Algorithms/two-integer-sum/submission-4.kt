class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val subtractionMap = hashMapOf<Int, Int>()

        for (i in nums.indices) {
            val subtractionResult = target - nums[i]
            if (subtractionMap.containsKey(subtractionResult)) {
                return intArrayOf(subtractionMap[subtractionResult] ?: -1, i)
            }

            subtractionMap[nums[i]] = i
        }
        return intArrayOf()
    }
}
