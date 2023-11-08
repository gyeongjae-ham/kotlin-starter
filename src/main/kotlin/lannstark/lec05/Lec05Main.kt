package lannstark.lec05

// 코틀린에서 조건문을 다루는 방법
fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
    }
}

// Java와 다른 점: Java에선 조건문은 Statement이므로 변수에 담을 수 없다(하나의 값이 아니기 때문에), 삼항연산자로 담아야 함
// Kotlin에서는 조건문이 Expression이므로 바로 return할 수 있다
// 따라서 Kotlin에서는 삼항 연산자가 없습니다
fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}

fun validateScore(score: Int) {
    if (score !in 0..100) {
        throw IllegalArgumentException("score의 범위는 0부터 100입니다")
    }
}

// switch와 when
// Kotlin에서는 switch가 없고, when으로 사용한다
// Expression이므로 하나의 값으로 사용할 수 있다
// in: 범위 객체 등으로 더 다양하게 사용할 수 있다
// 조건부에 여러개의 조건을 동시에 검사할 수 있다(,로 구분)
fun getGradeWithSwitch(score: Int): String {
    return when (score / 10) {
        in 98..99 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

fun judgeNumber(number: Int) {
    when (number) {
        1, 0, -1 -> println("어디서 많이 본 숫자입니다")
        else -> println("1, 0, -1이 아닙니다")
    }
}

// when절을 값없이 early return 처럼 사용가능하다
fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다")
        else -> println("주어진 숫자는 홀수입니다")
    }
}

// when은 'Enum Class' 혹은 'Sealed Class'와 함께 사용하면 더 진가를 발휘한다
