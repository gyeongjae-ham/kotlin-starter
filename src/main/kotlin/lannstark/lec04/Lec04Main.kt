package lannstark.lec04

import com.lannstark.lec04.JavaMoney

// 코틀린에서 연산자를 다루는 방법
/**
 * 1. 단항 연산자 / 산술 연산자
 * 2. 비교 연산자와 동등성, 동일성
 * 3. 논리 연산자 / 코틀린에 있는 특이한 연산자
 * 4. 연산자 오버로딩
 */
fun main() {
    // 단항 연산자 ++, --
    // 산술 연산자 +, -, *, /, %
    // 산술대입 연산자 +=, -=, *=, /=, %=
    // Java, Kotlin 동일

    // 비교연산자 <, >, >=, <=
    // Java, Kotlin 동일
    // 단, Java와 다르게 객체를 비교할 때, 비교연산자를 사용하면 자동으로
    // compareTo를 호출해 준다

    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    // 동등성(Equality): 두 객체의 값이 같은가
    // 동일성(Identity): 완전히 동일한 객체인가? 메모리 주소가 같은가?
    /**
     * Java에서는 동일성에 ==, 동등성에 equals를 호출해서 사용
     * Kotlin에서는 동일성에 ===, 동등성에 == 호출
     */
    if (money1 > money2) {
        println("Money1이 Money2보다 금액이 큽니다")
    }

    // 논리 연산자와 코틀린에 있는 특이한 연산자
    // in / !in : 컬레션이나 범위에 포함되어 있다, 포함되어 있지 않다
    // a..b : a부터 b 까지의 범위 객체를 생성한다
}
