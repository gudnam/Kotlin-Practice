package baekjoon

fun main(args: Array<String>) {
    var scores: MutableList<Int> = arrayListOf();

    for (i in 0..4) {
        val input = readLine()
        val num: Int? = try {
            input?.toInt()
        } catch (e: NumberFormatException) {
            0
        }
        num?.let { scores.add(it) }
    }

    var sum = 0
    for (score in scores) {
        sum += if (score < 40) 40 else score
    }
    println("${sum/scores.size}")
}