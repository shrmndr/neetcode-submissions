class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val subtractionMap = hashMapOf<Int, Int>()

        for ((index, number) in nums.withIndex()) {
            val subtractionResult = target - number
        
            if (subtractionMap.containsKey(subtractionResult)) {
                return intArrayOf(subtractionMap[subtractionResult]!!, index)
            }
        
            subtractionMap[number] = index
        }
        return intArrayOf()
    }
}
