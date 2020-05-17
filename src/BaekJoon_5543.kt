
const val maxPrice = 2000
const val minPrice = 100
const val salePrice = 50

fun checkIsValidPrice(price: Int) {
    assert(price >= minPrice)
    assert(price <= maxPrice)
}

fun List<Int>.cheaper(): Int {
    var value = maxPrice
    for (number in this) {
        value = if (number < value) number else value
    }
    return value
}

fun main(args: Array<String>) {
    val bugers = readLine(3)
    val drinks = readLine(2)
//    val bugers = arrayListOf(800, 700, 900)
//    val drinks = arrayListOf(198, 330)

    val cheaperBuger = bugers.cheaper()
    val cheaperDrink = drinks.cheaper()

    println("${cheaperBuger+cheaperDrink-salePrice}")
}