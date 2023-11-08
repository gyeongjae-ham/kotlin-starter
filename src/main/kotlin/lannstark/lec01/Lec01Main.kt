package lannstark.lec01

import com.lannstark.lec01.Person

// 코틀린에서 변수를 다루는 방법
fun main() {
    // 변수(가변)
    var number1: Long = 10L

    // final(불변)
    val number2 = 10L

    // 초기화 없이 선언하려면 무조건 타입을 기입해야 한다
    var number3: Long
    // val은 불변이지만 최초 1번에 한해서 선언 후 초기화 가능하다
    val number4: Long

    // 모든 변수를 val로 선언하고 필요에 따라 var로 변경해서 사용하면 디버깅에 유리하다
    // Kotlin에서는 primitive 타입과 reference 타입을 따로 구분짓지 않고, 상황에 따라서
    // 내부에서 적절하게 처리해줘서 성능 걱정을 하지 않아도 된다.

    // 코틀린에서 null이 들어갈 수 있는지 여부는 타입에 ?를 붙여서 선언해줘야 한다.
    var number5: Long? = 10L
    number5 = null

    // 코틀린에서 인스턴스를 생성할 경우 new 키워드를 사용하지 않고 선언한다.
    var person = Person("luca")
}
