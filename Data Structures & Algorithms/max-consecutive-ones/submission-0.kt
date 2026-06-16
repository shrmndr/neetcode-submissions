class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        var onesCounter = 0
        var result = 0

        for (i in nums.indices) {
            if(nums[i] == 1) {
                onesCounter++
            } else {
                onesCounter = 0
            }

            result = maxOf(result, onesCounter)
        }

        return result
    }
}
