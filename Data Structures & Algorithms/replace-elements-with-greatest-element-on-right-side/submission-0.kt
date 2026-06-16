class Solution {
    fun replaceElements(arr: IntArray): IntArray {
        val resultArray = IntArray(arr.size)

        var currentMax = 0

        for (i in arr.size - 1 downTo 0) {
        
            resultArray[i] = currentMax

            currentMax = max(currentMax, arr[i])

             if (i == arr.size - 1) {
                resultArray[i] = -1
                continue
            }
        }

        return resultArray
    }
}
