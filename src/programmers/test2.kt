package programmers

import java.util.*
import kotlin.collections.ArrayList

class test2 {
    fun solution(v: IntArray): Int {
        var answer = 0
        var sum = 0
        val sortedDesc = v.sortedDescending()

        var maxGroup = arrayListOf<Int>()
        var minGroup = arrayListOf<Int>()
        for (i in sortedDesc.indices) {
            println(i)
            if (i < sortedDesc.size/2) // 절반보다 빠른 인덱스는 Max 그룹
                maxGroup.add(sortedDesc[i])
            else
                minGroup.add(sortedDesc[i])
        }

        var nextIndex = 0
        var maxLastIndex = maxGroup.lastIndex
        var minLastIndex = minGroup.lastIndex
        var firstList = arrayListOf<Int>()
        var secondList = arrayListOf<Int>()
        for (i in 0 until minGroup.size) {
            firstList.add(nextIndex, maxGroup[maxLastIndex--])
            secondList.add(nextIndex++, minGroup[minLastIndex--])
        }

//        for (number in sortedDesc) {
//            sum += Math.abs(v[i] - v[i+1])
//            println("v[i]:${v[i]} - v[i+1]:${v[i+1]} = $sum")
//        }
        answer = sum
        return answer
    }
}
fun main() {
    println(test2().solution(intArrayOf(20,8,10,1,4,15)))
}