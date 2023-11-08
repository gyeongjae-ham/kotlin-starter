package lannstark.lec10

// 코틀린에서 상속을 다루는 방법
/**
 * 1. 추상 클래스
 * 2. 인터페이스
 * 3. 클래스를 상속할 때 주의할 점
 * 4. 상속 관련 지시어 정리
 */
fun main() {
    Derived(300)
}

// 상위 클래스를 설계할 때 생성자 또는 초기화 블록에 사용되는 프로퍼티에는 open을 피해야 한다
// 하위 클래스를 인스턴스화 했을 때, 상위 클래스 생성자만 초기화된 상태에서 프로퍼티를 불러오면
// 하위 클래스 프로퍼티가 초기화되지 않은 상태에서 초기 값이 들어가서 원하는 형태로 동작하지 않게 된다
open class Base(
    open val number: Int = 100
) {
    init {
        println("Base Class")
        println(number)
    }
}

class Derived(
    override val number: Int
) : Base(number) {

    init {
        println("Derived Class")
    }

}
