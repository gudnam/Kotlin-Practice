import java.lang.NumberFormatException

const val maxPrice = 2000
const val minPrice = 100
const val salePrice = 50

fun checkIsValidPrice(price: Int) {
    assert(price >= minPrice)
    assert(price <= maxPrice)
}

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

fun List<Int>.cheaper(): Int {
    var value = maxPrice
    for (number in this) {
        value = if (number < value) number else value
    }
    return value
}

fun main(args: Array<String>) {
    val bugers = readLinePrice(3)
    val drinks = readLinePrice(2)
//    val bugers = arrayListOf(800, 700, 900)
//    val drinks = arrayListOf(198, 330)

    val cheaperBuger = bugers.cheaper()
    val cheaperDrink = drinks.cheaper()

    println("${cheaperBuger+cheaperDrink-salePrice}")
}