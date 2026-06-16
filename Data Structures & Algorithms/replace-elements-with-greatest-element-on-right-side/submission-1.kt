class Solution {
    fun replaceElements(arr: IntArray): IntArray {
        val resultArray = IntArray(arr.size)

        var currentMax = -1

        for (i in arr.size - 1 downTo 0) {
        
            resultArray[i] = currentMax

            currentMax = max(currentMax, arr[i])
        }

        return resultArray
    }
}
