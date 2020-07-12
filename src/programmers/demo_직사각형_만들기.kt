fun solution(v: Array<IntArray>): IntArray {

    var xArray = ArrayList<Int>()
    var yArray = ArrayList<Int>()
    var solutionX = ArrayList<Int>()
    var solutionY = ArrayList<Int>()

    for (i in v.indices) {
        val x = v[i][0]
        val y = v[i][1]

        if (!solutionX.contains(x))
            solutionX.add(x)
        if (!solutionY.contains(y))
            solutionY.add(y)

        if (!xArray.contains(x)) {
            xArray.add(x)
        } else {
            solutionX.remove(x)
        }
        if (!yArray.contains(y)) {
            yArray.add(y)
        } else {
            solutionY.remove(y)
        }
    }
    if (solutionX.isNotEmpty() && solutionY.isNotEmpty())
        return intArrayOf(solutionX[0], solutionY[0])

    return intArrayOf()
}

fun main() {
    val arr1 = intArrayOf(1,1)
    val arr2 = intArrayOf(2,2)
    val arr3 = intArrayOf(1,2)

    val v = arrayOf(arr1, arr2, arr3)
    val solution = solution(v)
    println("${solution[0]}, ${solution[1]}")
}