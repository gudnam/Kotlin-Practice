package leetcode

fun findNumbers(nums: IntArray): Int {
    var solution = 0
    for (num in nums) {
        if (num.toString().length % 2 == 0) solution++
    }
    return solution
}

fun main() {
    val nums = intArrayOf(555,901,482,1771)
    println(findNumbers(nums))
}