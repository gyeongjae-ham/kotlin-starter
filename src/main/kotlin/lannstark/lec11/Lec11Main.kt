package lannstark.lec11

// 코틀린에서 접근 제어를 다루는 방법
/**
 * 1. 자바와 코틀린의 가시성 제어
 * 2. 코틀린 파일의 접근 제어
 * 3. 다양한 구성요소의 접근 제어
 * 4. Java와 Kotlin을 함께 사용할 경우 주의할 점
 */
class Lec11Main {
    /**
     * Java -> Kotlin
     * 1. public: 모든 곳에서 접근 가능
     * 2. protected: Java에서는 같은 패키지, 하위 클래스였지만 // Kotlin에서는 선언된 클래스, 하위 클래스만 접근 가능
     * 3. default -> internal: 같은 모듈에서만 접근 가능
     * 4. private: 선언된 클래스에서만 접근 가능
     */

    // Java에서 abstract class를 만들고 생성자를 private 처리해서 생성자 생성을 못하게 유틸성 클래스를 만들어 사용했었는데,
    // Kotlin에서도 해당 방법이 가능하나, 그냥 파일 상단에 util성 함수를 만들어서 사용하는 방법을 추천한다
}

class Car(
    // name의 getter, setter 둘 다 internal 설정
    internal val name: String,
    // owner의 getter, setter 둘 다 private 설정
    private val owner: String,
    _price: Int
) {

    var price = _price
        // setter만 private하게 설정
        private set

}
