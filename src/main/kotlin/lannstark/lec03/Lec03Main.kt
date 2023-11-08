package lannstark.lec03

import com.lannstark.lec03.Person

// 코틀린에서 Type을 다루는 방법
/**
 * 1. 기본타입
 * 2. 타입 캐스팅
 * 3. Kotlin의 3가지 특이한 타입
 * 4. String Interpolation, String indexing
 */
fun main() {
    // 기본타입
    val number1 = 3 // Int
    val number2 = 3L // Long
    val number3 = 3.0f // Float
    val number4 = 3.0 // Double

    // Java: 기본 타입간의 변환은 암시적으로 이뤄질 수 있다
    // Kotlin: 기본 타입간의 변환은 명시적으로 이뤄져야 한다

    val number5: Long = number1.toLong()
    println(number2 + number5)

    // Kotlin에만 존재하는 특이한 타입 3가지
    /**
     * Any
     *  - Java Object 역할(모든 객체의 최상위 타입)
     *  - 모든 Primitive Type의 최상의 타입도 Any이다.
     *  - Any 자체로는 null을 포함할 수 없어 null을 포함하고 싶다면, Any?로 표현
     *  - Any에 equals / hashCode / toString 존재
     */

    /**
     * Unit
     *  - Java의 void와 동일한 역할
     *  - (살짝 어려운 내용) void랑 다르게 Unit은 그 자체로 타입 인자로 사용 가능하다
     *  - 함수형 프로그래밍에서 Unit은 단 하나의 인스턴스만 갖는 타입을 의미
     *  - 코틀린의 Unit은 실제 존재하는 타입이라는 것을 표현
     */

    /**
     * Nothing
     *  - 함수가 정상적으로 끝나지 않았다는 사실을 표현하는 역할
     *  - 무조건 예외를 반환하는 함수 / 무한 루프 함수 등
     */

    // String interpolation / String indexing
    val person = Person("luca", 100)
    val log = "사람 이름은 ${person.name}이고 나이는 ${person.age}세 입니다."
    println(log)

    val name = "luca"
    val str = """
      ABC
      EFG
      $name
    """.trimIndent()
    println(str)

    val str2 = "ABC"
    println(str[0])
    println(str[1])
}

// 타입 캐스팅
fun printAgeIfPerson(obj: Any) {
    if (obj is Person) { // is == Java의 Instance of
        val person = obj as Person
        println(person.age)
    }
}

fun printAgeIfPerson2(obj: Any) {
    if (obj is Person) {
        // 타입 캐스팅 과정이 없더라도 if문으로 추론해서 스마트 캐스팅을 해준다
        println(obj.age)
    }
}

fun printAgeIfPerson3(obj: Any) {
    // !is == !instance of
    if (obj !is Person) {
    }
}

fun printAgeIfPerson4(obj: Any?) {
    // as? == 앞의 값이 null이면 전체 null, null이 아니면 변환해 줌
    val person = obj as? Person
    println(person?.age)
}
