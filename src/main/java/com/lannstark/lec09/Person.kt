package com.lannstark.lec09

import javax.naming.Name

fun main() {
    val person = Person("luca", 100)
    println(person.name)
    // setter: setAge 대신 person.age로 바로 쓸 수 있다.
    // Kotlin에서 Java class를 가져와서 사용할 때도 마찬가지다
    person.age = 10
    println(person.age)
}

class Person(
    // 주 생성자 위치
    val name: String = "luca",
    var age: Int = 10
) {
    // 클래스가 초기화 되는 시점에 한번 실행되는 곳
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다")
        }
        println("블록 초기화")
    }

    // 생성자 하나를 더 추가할 경우
    // 부생성자들에 body 또한 넣을 수 있다
    constructor(name: String) : this(name, 1) {
        println("첫번째 부생성자")
    }

    constructor() : this("luca", 1) {
        println("두번째 부생성자")
    }

    // Kotlin에서는 부생성자보다는 주생성자에 default parameter를 사용하는 것을 추천한다
    // 또한 converting을 위한 경우에도 부생성자보다는 정적 팩토리 메소드를 추천한다

    // 커스텀 getter 구현 방법
    // 함수로 구현하거나 프로퍼티처럼 구현할 수도 있다
    fun isAdult(): Boolean {
        return this.age >= 20
    }

    val isAdult: Boolean
        get() = this.age >= 20

    // field에 대해서는 보통 backing field로 처리하지 않고 프로퍼티로 따로 처리하는게 좋다
//    val name: String = name
//        // field: backing field로 무한루프를 방지한다
//        get() = field.uppercase()

    val getNameUpperCase: String
        get() = this.name.uppercase()

}
