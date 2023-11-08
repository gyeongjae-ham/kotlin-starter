package lannstark.lec12

import com.lannstark.lec12.Movable

// 코틀린에서 object 키워드를 다루는 방법
/**
 * 1. static 함수와 변수
 * 2. 싱글톤
 * 3. 익명 클래스
 */

fun main() {
    println(Singleton.a)
    Singleton.a = 10
    println(Singleton.a)

    // 익명 클래스
    moveSomething(object : Movable {
        override fun move() {
            println("무브 무브")
        }

        override fun fly() {
            println("날다 날다")
        }

    })
}

class Person private constructor(
    var name: String,
    var age: Int,
) {

    // companion 객체는 객체로 취급되어서 이름을 붙일 수 있고, interface를 구현할 수도 있다
    companion object Factory : Log {
        // val은 런타임시에 할당되고, const를 붙이면 컴파일시에 할당된다
        // 따라서 const는 진짜 상수에 붙이는 용도이며, 기본 타입과 String에 붙일 수 있다
        private const val MIN_AGE = 1
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("나는 Person 클래스의 동행객체 Factory에요")
        }

        // Java에서 kotlin companion object를 사용하고 싶은 경우
        // 1. Person.Companion.newBaby
        // 2. companion object 위에 @JvmStatic을 사용하기
        // 3. companion object에 이름이 있는 경우에는 Person.이름.함수
    }

}

// Kotlin singleton
object Singleton {
    var a: Int = 0
}

// 익명 클래스
// moveSomething에 Movable 구현체를 넣어주는 용도로 익명으로 생성하는 클래스
private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}
