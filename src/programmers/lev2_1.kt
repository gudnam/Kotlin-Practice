package programmers

fun solution(arr: IntArray): Int {
    val sortedArray = arr.sortedDescending()
    if (sortedArray.isEmpty()) { return 0 }
    val max = sortedArray[0]
    var answer = max
    var remainder = 0
    var multi = 1
    do {
        remainder = 0
        answer = max * multi++
        for (i in 1 until sortedArray.size) {
            val element = sortedArray[i]
            remainder += answer % element
        }
    } while (remainder != 0)
    return answer
}

fun main() {
    val arr: IntArray = intArrayOf(1,2,3)
    println(solution(arr))
}