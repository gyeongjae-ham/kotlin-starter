package lannstark.lec10

interface Swimable {

    // backing field 없는 프로퍼티를 만들 수 있다
    // default getter나 구현해야 하는 getter를 지정하는 의미
    val swimAbility: Int

    fun act() {
        println("어푸 어푸")
    }

}
