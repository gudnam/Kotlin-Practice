fun readLinePrice(count: Int): MutableList<Int> {
    var things: MutableList<Int> = arrayListOf()
    for (i in 1..count) {
        val input = readLine()
        val price: Int? = try {
            input?.toInt()
        } catch (e: NumberFormatException) {
            0
        }
        price?.let {
            checkIsValidPrice(it)
            things.add(it)
        }
    }
    return things
}