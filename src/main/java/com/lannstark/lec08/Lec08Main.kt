package com.lannstark.lec08

// 코틀린에서 함수를 다루는 방법
/**
 * 1. 함수 선언 문법
 * 2. default parameter
 * 3. named argument(parameter)
 * 4. 같은 타입의 여러 파라미터 받기(가변인자)
 */

// 함수의 값이 하나라면 중괄호로 묶지 않고, = 으로 표현할 수 있다
// =을 사용했을 경우, 코틀린이 반환 타입을 추론할 수 있기 때문에 반환 타입을 생략할 수 있습니다
// block {}을 사용하는 경우에는 반환 타입이 Unit이 아니면 명시적으로 작성해줘야 합니다
fun max(a: Int, b: Int) = if (a > b) a else b

// default parameter
fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun main() {
    // named argument
    // 기본값이 있는 함수를 사용할 때, 위치에 상관없이 파라미터 값을 지정하고 싶은 경우
    // 이 기능 덕분에 builder를 만들지 않고 builder의 장점을 가지게 된다
    repeat("Hello World", useNewLine = false)

    // Kotlin에서 Java 함수를 가져다 사용할 때는 named argument를 사용할 수 없다
    printNameAndGender(name = "luca", gender = "MALE")
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

// 가변인자 파라미터
fun printAll(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}

fun main2() {
    printAll("A", "B", "C")

    val array = arrayOf("A", "B", "C")
    // spread 연산자를 통해서 넣어야 가변인자 파라미터로 넣을 수 있다
    printAll(*array)
}
