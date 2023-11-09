package lannstark.lec14

fun handleCountry(country: Country) {
    // enum class로 when을 사용할 경우 어차피 컴파일러가 모든 값의 내용을 알고 있으므로
    // else -> 부분을 작성하지 않아도 된다
    when (country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }

    // sealed class 타입에 대해서 when으로 분기처리 가능
    handleCar(Avante())
}

// Java enum class와 같이 추가적인 클래스를 상속받을 수 없고, 인터페이스는 구현할 수 있으며, 각 코드가 싱글톤이다
// 지난 5 챕터에서 말했던 when Enum Class, Sealed Class와 함께 사용할 경우 진가를 발휘한다(enum 값에 대한 분기처리 시)
enum class Country(
    private val code: String,
) {
    KOREA("KO"),
    AMERICA("US")
}

/**
 * Sealed Class, Sealed Interface
 * 1. 상속이 가능하도록 추상 클래스를 만들면서 외부에선 이 클래스를 상속받지 않고 싶은 니즈에서 생긴 클래스
 * 2. 작성한 클래스만 하위 클래스가 되도록 봉인한 클래스
 * 3. 컴파일 타임 때 하위 클래스 타입을 모두 기억한다, 런타임 때 클래스 타입이 추가될 수 없다
 * 4. 하위 클래스는 같은 패키지에 있어야 한다.
 */
/**
 * Enum과 다른 점
 * 1. 클래스를 상속받을 수 있다.
 * 2. 하위 클래스는 멀티 인스턴스가 가능하다.
 */

sealed class HyundaiCar(
    val name: String,
    val price: Long
)

class Avante : HyundaiCar("아반떼", 1_000L)

class Sonata : HyundaiCar("소나타", 1_000L)

class Grandeur : HyundaiCar("그렌저", 1_000L)

private fun handleCar(car: HyundaiCar) {
    // else -> 구현 안해줘도 된다
    when (car) {
        is Avante -> TODO()
        is Grandeur -> TODO()
        is Sonata -> TODO()
    }
}
