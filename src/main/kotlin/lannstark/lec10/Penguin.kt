package lannstark.lec10

class Penguin(
    species: String
    // 코틀린에서 추상클래스와 인터페이스는 ,로 계속 받으면 된다
) : Animal(species, 2), Swimable, Flyable {

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 움직인다~ 꽥꽥")
    }

    // 코틀린에서 프로퍼티를 override할 때 open을 붙여줘야 한다
    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

    override val swimAbility: Int
        get() = 3

}
