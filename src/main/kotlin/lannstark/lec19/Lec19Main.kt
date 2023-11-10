package lannstark.lec19

import com.lannstark.lec17.Fruit

// 코틀린의 이모저모
/**
 * 1. Type Alias와 as import
 * 2. 구조분해와 componentN 함수
 * 3. Jump와 Label
 * 4. TakeIf와 TakeUnless
 */

// Type Alias
typealias FruitFilter = (Fruit) -> Boolean

fun filterFruits(fruits: List<Fruit>, filter: FruitFilter) {
}

data class UltraSuperGuardianTribe(
    val name: String
)

// Class Collection type alias
typealias USGTMap = Map<String, UltraSuperGuardianTribe>

// 다른 패키지의 같은 함수를 동시에 가져오고 싶다면?
// import com.landstark.lec19.a.printHelloWorld as printHelloWorldA

data class Person(
    val name: String,
    val age: Int
)

fun main() {

    val person = Person("luca", 100)
    // 구조분해 할당
    val (name, age) = person
    println("이름 : $name, 나이 : $age")

    val name2 = person.component1()
    val age2 = person.component2()

}

// 직접 구조분해 할당을 구현해주기
class Person2(
    val name: String,
    val age: Int
) {

    operator fun component1(): String {
        return this.name
    }

    operator fun component2(): Int {
        return this.age
    }

}

fun main2() {

    val person2 = Person2("luca", 100)
    // 구조분해 할당
    val (name, age) = person2
    println("이름 : $name, 나이 : $age")

    val name2 = person2.component1()
    val age2 = person2.component2()

}
