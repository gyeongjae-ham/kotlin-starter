package com.lannstark.lec02

// 코틀린에서 null을 다루는 방법
fun main() {
    // safe call
    // null이 아니면 실행하고, null이면 그대로 null 반환한다
    val str: String? = "ABC"
    println(str?.length)

    // elvis 연산자
    // 앞의 연산 결과가 null이면 뒤의 값을 사용한다.
    val str2: String? = null
    println(str?.length ?: 0)
}

// 아래 예시 3개를 보면 알수 있듯이 코틀린에서는 null을 완전히 다른 타입으로 간주한다
fun startsWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null이 들어왔습니다.")
    }
    return str.startsWith("A")
}

fun startsWithA2(str: String?): Boolean? {
    if (str == null) {
        return null
    }
    return str.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    if (str == null) {
        return false
    }
    return str.startsWith("A")
}

// 위의 예제를 코틀린스럽게 변환
fun startsWithB1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

fun startsWithB2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithB3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

// nullable type이지만, 아무리 생각해도 null이 될 수 없는 경우
fun startsWith(str: String?): Boolean {
    // 이 변수가 절대 null이 아니라는 표현
    // 하지만 만약 null이 들어오게 되면 runtime error가 발생한다
    return str!!.startsWith("A")
}
