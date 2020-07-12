package programmers

class Lev3_Palindrome {
    fun solution(s: String): Int {
        var answer = 0

        for (startIndex in s.indices) { // start to last
            val startStr = s[startIndex]


            var nextIndex = startIndex
            var nextStr = s[nextIndex]
            var lastIndex = s.lastIndexOf(nextStr)

            while (true) { // last to start
                nextStr = s[nextIndex++]
                val lastStr = s[lastIndex--]
                if (nextStr != lastStr)
                    continue
                println("nextstr: $nextStr")
                if (nextIndex >= lastIndex) {
                    println("break (si: $nextIndex, ei: $lastIndex)")
                    break
                }

                println("si: $nextIndex, ei: $lastIndex")
            }
        }

        return answer
    }
}


fun main() {
    val question = "abcabcabcdcbaefawerf" // 7
    println(Lev3_Palindrome().solution(question))
}