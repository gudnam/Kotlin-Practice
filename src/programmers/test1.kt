package programmers

class test1 {
    fun solution(location: Array<IntArray>, s: IntArray, e: IntArray): Int {
        val xRangeArray = arrayListOf(s[0], e[0]).sorted() // 영역의 x의 범위를 작은 수 순서로 정렬
        val yRangeArray = arrayListOf(s[1], e[1]).sorted() // 영역의 y의 범위를 작은 수 순서로 정렬
        val containedArray = ArrayList<Pair<Int, Int>>() // 범위에 포함된 Array

        for (l in location) {
            if ((xRangeArray[0] <= l[0] && l[0] <= xRangeArray[1]) &&       // x의 시작점 부터 끝점 까지 포함된 좌표 찾기
                    (yRangeArray[0] <= l[1] && l[1] <= yRangeArray[1])) {   // y의 시작점 부터 끝점 까지 포함된 좌표 찾기
                containedArray.add(Pair(l[0], l[1]))
            }
        }
        return containedArray.size
    }
}
fun main() {
    val location = arrayOf(
            intArrayOf(0, 3),
            intArrayOf(1, 1),
            intArrayOf(1, 5),
            intArrayOf(2, 2),
            intArrayOf(3, 3),
            intArrayOf(4, 0)
    )
//    val s = intArrayOf(1, 4)
//    val e = intArray
    val s = intArrayOf(3, 4)
    val e = intArrayOf(0, 0)
    println(test1().solution(location, s, e))
}