package leetcode

fun sortedSquares(A: IntArray): IntArray {
    var solution = IntArray(A.size)

    for (i in A.indices) {
        solution[i] = A[i]*A[i]
    }

    return solution.sortedArray()
}

fun main() {
    val A = intArrayOf(-7,-3,11,3,2)
    for (i in sortedSquares(A)) {
        println(i)
    }
}