package com.lannstark.lec06

// 코틀린에서 반복문을 다루는 방법
/**
 * 1. for-each 문
 * 2. 전통적인 for문
 * 3. Progression과 Range
 * 4. while 문
 */
fun main() {

    // for each문
    val numbers = listOf(1L, 2L, 3L)
    for (number in numbers) {
        println(number)
    }

    // for문 오름차순
    for (i in 1..3) {
        println(i)
    }

    // for문 내림차순
    for (i in 3 downTo 1) {
        println(i)
    }

    // for문 2칸씩 오름차순
    for (i in 1..5 step 2) {
        println(i)
    }

    // ..연산자: 범위를 만들어 내는 연산자
    // downTo, step도 함수(중위 호출 함수)

    // while
    // Java와 동일
    var i = 1
    while (i <= 3) {
        println(i)
        i++
    }
}
