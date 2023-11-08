package lannstark.lec13

import com.lannstark.lec13.JavaHouse.LivingRoom

// 코틀린에서 중첩 클래스를 다루는 방법
/**
 * 1. 중첩 클래스의 종류
 * 2. 코틀린의 중첩 클래스와 내부 클래스
 */
fun main() {

}

// Effective guide에 따른 중첩 클래스
// 클래스안의 클래스는 참조가 없도록 static으로 구현
class JavaHouse(
    private val address: String,
    private val livingRoom: LivingRoom,
) {

    class LivingRoom(
        private val area: Double
    )

}

// 권장되지 않는 방식의 중첩 클래스
// 내부 클래스가 외부 클래스를 참조할 수 있는 경우
class JavaHouse2(
    private val address: String,
    private val livingRoom: LivingRoom,
) {

    inner class LivingRoom(
        private val area: Double
    ) {
        val address: String
            get() = this@JavaHouse2.address
    }

}
