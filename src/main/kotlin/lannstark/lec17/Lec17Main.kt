package lannstark.lec17

import com.lannstark.lec17.Fruit

// 코틀린에서 람다를 다루는 방법
/**
 * 1. Java에서 람다를 다루기 위한 노력
 * 2. 코틀린에서의 람다
 * 3. Closure
 * 4. 다시 try with resources
 *
 * Java와 Kotlin에서 근본적으로 다른점
 * Kotlin에서 함수가 1급 시민이다
 * Java에서는 함수가 2급 시민이다
 */
fun main() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("바나나", 3_000),
        Fruit("바나나", 3_200),
        Fruit("바나나", 2_500),
        Fruit("수박", 10_000)
    )

    // 람다를 만드는 방법 1
    val isApple = fun(fruit : Fruit): Boolean {
        return fruit.name == "사과"
    }

    // 람다를 만드는 방법 2
    val isApple2 = { fruit : Fruit -> fruit.name == "사과" }

    // 람다를 직접 호출하는 방법 1
    isApple(fruits[0])

    // 람다를 직접 호출하는 방법 2
    isApple.invoke(fruits[0])

    // 람다 함수를 파라미터로 사용하는 방법 1
    filterFruits(fruits, isApple2)

    // 람다 함수를 파라미터로 사용하는 방법 2
    filterFruits(fruits) { fruit : Fruit -> fruit.name == "사과" }

    // 람다 함수를 파라미터로 사용하는 방법 3
    filterFruits(fruits) { it.name == "사과" }
}

private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in results) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }
    return results
}

// Closure
// 람다가 실행되는 시점에 사용하는 모든 변수의 정보를 가지고 있는 데이터 구조
