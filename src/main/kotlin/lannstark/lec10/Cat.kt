package lannstark.lec10

import lannstark.lec10.Animal

class Cat(
    species: String
) : Animal(species, 4) {

    override fun move() {
        println("고양이가 사뿐 사뿐 걸어가~")
    }

}
