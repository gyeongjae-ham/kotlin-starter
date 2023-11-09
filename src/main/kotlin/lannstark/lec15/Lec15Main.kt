package lannstark.lec15

// 코틀린에서 배열과 컬렉션을 다루는 방법
/**
 * 1. 배열
 * 2. Kotlin에서의 Collection - List, Set, Map
 * 3. Collection의 null 가능성, Java와 함께 사용하기
 */
fun main() {
    // 배열
    // 사실 배열은 실무에서 지양하며, Effective Java에서도 List를 권장한다
    val array = arrayOf(100, 200)

    // Array에 있는 요소 개수를 세서 인덱스를 Range로 담아준다
    for (i in array.indices) {
        println("$i ${array[i]}")
    }

    // Kotlin 배열에서는 요소를 copy없이 쉽게 추가할 수 있다
    array.plus(300)

    // index, value를 함께 받는다
    for ((idx, value) in array.withIndex()) {
        println("$idx $value")
    }

    // Collection
    // 컬렉션을 만들 때 불변인지 가변인지 설정해야 한다
    /**
     * 1. 가변 컬렉션: 컬렉션에 element를 추가, 삭제할 수 있다
     * 2. 불변 컬렉션: 컬렉션에 element를 추가, 삭제할 수 없다
     *  - 불변 컬렉션이더라도 Reference type의 필드는 수정할 수 있다
     */

    val numbers = listOf(100, 200)
    val emptyList = emptyList<Int>() // emptyList는 타입 지정해줘야 한다

    // emptyList를 사용하는 곳에 타입이 추론 가능하면 타입을 지정하지 않아도 된다
    printNumbers(emptyList)

    // List에소 특정 인덱스 위치의 원소 가져오기
    println(numbers[0])

    for (number in numbers) {
        println(number)
    }

    for ((idx, value) in numbers.withIndex()) {
        println("$idx $value")
    }

    // 가변 리스트 생성(기본적으로 불변 리스트를 사용하고, 필요시에 가변 리스트 사용 권장)
    val numbers2 = mutableListOf(100, 200) // == ArrayList
    numbers2.add(300)

    // Set
    val numbers3 = setOf(100, 200)

    for (number in numbers3) {
        println(number)
    }

    for ((idx, value) in numbers3.withIndex()) {
        println("$idx $value")
    }

    // Map
    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    // 중위 호출로 초기화
    mapOf(1 to "Monday", 2 to "Tuesday")

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for ((key, value) in oldMap.entries) {
        println(key)
        println(value)
    }

    /**
     * 컬렉션의 null 가능성
     * 1. List<Int?> : 리스트에 null이 들어갈 수 있지만, 리스트는 절대 null이 아님
     * 2. List<Int>? : 리스트에는 null이 들어갈 수 없지만, 리스트는 null일 수 있음
     * 3. List<Int?>? : 리스트에 null이 들어갈 수도 있고, 리스트가 null일 수도 있음
     */

    /**
     * Java와 함께 컬렉션을 사용할 경우
     * 1. Koltin 쪽의 컬렉션이 Java에서 호출되면 컬렉션 내용이 변할 수 있음을 감안해야 한다
     * 2. Koltin 쪽에서 Collections.unmodifiableXXX()를 활용하면 변경 자체를 막을 수 있다
     */
}

private fun printNumbers(numbers: List<Int>) {
}
