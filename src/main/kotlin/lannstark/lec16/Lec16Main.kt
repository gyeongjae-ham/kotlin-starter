package lannstark.lec16

import com.lannstark.lec16.Person

// 코틀린에서 다양한 함수를 다루는 방법
/**
 * 1. 확장함수
 * 2. infix 함수
 * 3. inline 함수
 * 4. 지역함수
 */

fun main() {
    val str = "ABC"
    println(str.lastChar())
}

// 확장함수
// 이미 작성된 어떤 클래스의 기능을 확장하는 함수
/**
 * 1. 확장함수는 원본 클래스의 private, protected 멤버 접근이 안된다
 * 2. 멤버함수, 확장함수 중 멤버함수에 우선권이 있다
 * 3. 확장함수는 현재 타입을 기준으로 호출된다
 */
fun String.lastChar(): Char {
    return this[this.length - 1]
}

// 클래스에 정의된 멤버함수와 확장함수의 이름이 같은 경우 어떤 걸 우선시 하는지
fun Person.nextYearAge(): Int {
    println("확장 함수")
    return this.age + 1
}

fun main2() {

    // 멤버 함수가 우선으로 출력
    // 확장함수를 먼저 만든 후에, 다른 기능의 똑같은 이름의 멤버 함수가 생기면 오류가 발생할 수 있다
    val person = Person("A", "B", 100)
    person.nextYearAge()

}

// 상속받은 클래스와 상위 클래스의 확장함수 이름이 같은 경우
open class Train (
    val name: String = "새마을기차",
    val price: Int = 5_000,
)

fun Train.isExpensive(): Boolean {
    println("Train의 확장함수")
    return this.price >= 10000
}

class Srt : Train("SRT", 40_000)

fun Srt.isExpensive(): Boolean {
    println("Srt의 확장함수")
    return this.price >= 10000
}

fun main3() {
    val train: Train = Train()
    train.isExpensive() // Train의 확장함수

    val srt1: Train = Train()
    srt1.isExpensive() // Train의 확장함수

    val srt2: Srt = Srt()
    srt2.isExpensive() // Srt의 확장함수

}

/**
 * Java에서 Kotlin 확장함수를 사용하는 방법
 */
// public static void main(String[] args) {
//    StringUtilsKt.lastChar("ABC");
//}

// 중위 함수(함수를 부르는 다른 방법)
// 변수 함수 argument
fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.add2(other: Int): Int {
    return this + other
}

fun main4() {
    3.add(4)
    3.add2(4)
    // 중위 함수
    3 add2 4
}
