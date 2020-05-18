// https://www.acmicpc.net/problem/1712

// A: 고정비용
// B: 가변비용
// C: 상품단가

// A + (B*N) < C*N
// A < CN - BN
// A < N(C - b)
// A/(C-B) < N
// N > A/(C-B)

fun main(args: Array<String>) {
    // val numbers = arrayListOf<Int>(1000, 70, 170)
    val numbers = readLineWithSpace()
    check(numbers.size == 3)

    val A = numbers[0]
    val B = numbers[1]
    val C = numbers[2]
//    check(C-B > 0) { println(-1) }
    if(C-B <= 0) {
        println(-1)
        return
    }

    var result = A / (C - B) + 1
    println("$result")
}