package leetcode

class Solution {
    fun duplicateZeros(arr: IntArray): Unit {
        var result = IntArray(arr.size)
        var newIndex = 0
        for (i in arr.indices) {
            if (newIndex < arr.size) {
                result[newIndex++] = arr[i]
                if (arr[i] == 0) {
                    result[newIndex++] = 0
                }
            }
        }
        for (i in result.indices)
            arr[i] = result[i]
    }
}

fun main() {
    val input = intArrayOf(1,0,2,3,0,4,5,0) // (1, 0, 0, 2, 3, 0, 0, 4)
    Solution().duplicateZeros(input)
    for (i in input) {
        print(i)
    }
}