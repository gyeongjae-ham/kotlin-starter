package lannstark.lec20

import lannstark.lec09.Person

// 코틀린의 scope function
/**
 * 1. scope function이란
 * 2. scope function의 분류
 * 3. 언제 어떤 scope function을 사용해야 할까
 * 4. scope function과 가독성
 */

fun main() {
    // scope function
    // 일시적인 영역을 생성하는 함수
    /**
     * scope function의 종류
     * 1. let -> 람다 결과, it 사용
     * 2. run -> 람다 결과, this 사용
     * 3. also -> 객체 그 자체, it 사용
     * 4. apply -> 객체 그 자체, this 사용
     * 5. with(확장함수가 아님)
     */

    // it은 다른 이름으로 쓸 수 있지만 생략이 불가능하다
    // this는 다른 이름으로 쓸 수 없지만 생략이 가능하다

    // with(파라미터, 람다): this를 사용해 접근하고 this는 생략 가능하다
}

fun printPerson(person: Person?) {
    person?.let {
        println(it.name)
        println(it.age)
    }
}
