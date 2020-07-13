package programmers

import kotlin.collections.ArrayList

class Test3 {

    private fun getLeftRightSharedMap(map: String): List<String> {
        val results = ArrayList<String>()
        var before: Char = '.'
        for (char in map) {
            if (before != char) {
                if (before != '.' && char != '.') {
                    val result = "$before$char".toCharArray().sorted().joinToString("")
                    if (!results.contains(result))
                        results.add(result)
                }
                before = char
            }
        }
        return results
    }

    fun solution(maps: Array<String>): IntArray {

        var updownMap = LinkedHashMap<Int, String>()
        for (i in maps.indices) {
            updownMap[i] = ""
            for (j in maps.indices) {
                if (i >= maps[i].length)
                    continue
                updownMap[i] += "${maps[j][i]}"
            }
        }

        var results = ArrayList<String>()
        for (i in maps.indices) {
            val list = getLeftRightSharedMap(maps[i])
            if (list.isNotEmpty()) {
                results.addAll(list)
            }
        }
        for (key in updownMap.keys) {
            updownMap[key]?.let {
                val list = getLeftRightSharedMap(it)
                if (list.isNotEmpty()) {
                    results.addAll(list)
                }
            }
        }

        val total = results.distinct().size
        var max = 0
        var resultStr = ""
        for (result in results.distinct()) {
            resultStr += result
        }
        println(resultStr)
        for (char in resultStr) {

        }


        return intArrayOf(total, max)
    }
}

fun main() {
    val maps = arrayOf(
            "..........",
            "AAACC.....",
            ".AAA.....Z",
            "..AAAA..C.",
            "...BBBBB..",
            "....BBB...",
            "...ZBBB...",
            "ZZZZAAAC..",
            ".....CCCC.",
            "QQ......C.",
            "..........")
    Test3().solution(maps)
}
