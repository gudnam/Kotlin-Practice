// 시작 시간 : 15:40

data class PrimeNumbers(val p: Int, val q: Int)

fun Int.primeNumbers(): PrimeNumbers {
    var p = 1
    for (i in 2..1000) {
        if (this%i == 0) {
            p = i
            break
        }
    }
    var q = -1
    if (this%p == 0) {
        q = this/p
    }
    return PrimeNumbers(p, q)
}

fun main(args: Array<String>) {
//    val numbers = arrayListOf<Int>(77, 12)
    val numbers = readLineWithSpace()

    val P = numbers[0]
    val K = numbers[1]

    var primeNumbers = P.primeNumbers()
    println("a : ${primeNumbers.p}, b : ${primeNumbers.q}")


    if (primeNumbers.p > K && primeNumbers.q > K) {
        println("GOOD")
    } else {
        val minValue = if (primeNumbers.p-primeNumbers.q > 0) primeNumbers.q else primeNumbers.p
        println("BAD $minValue")
    }

}