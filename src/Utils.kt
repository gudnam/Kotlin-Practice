fun readLineNumberList(count: Int): MutableList<Int> {
    var things: MutableList<Int> = arrayListOf()
    for (i in 1..count) {
        things.add(readLineNumber())
    }
    return things
}

fun readLineNumber(): Int {
    var number: Int = 0
    val input = readLine()
    val price: Int? = try {
        input?.toInt()
    } catch (e: NumberFormatException) {
        0
    }
    price?.let {
        number = it
    }
    return number
}

fun readLineWithSpace(): List<Int> {
    val input = readLine()
    return input?.split(" ")?.map {
        it.toInt()
    } ?: arrayListOf()
}