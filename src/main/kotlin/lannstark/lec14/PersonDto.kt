package lannstark.lec14

fun main() {
    val dto1 = PersonDto("luca", 100)
    val dto2 = PersonDto("luca", 200)
    println(dto1 == dto2)
    println(dto1)
}

// Java에서 lombok이나 getter, setter, equals and hashcode, toString 생성한 효과
// Java JDK16부터 도입된 record 클래스와 비슷함
// named argument까지 사용하면 사실상 builder 패턴같은 효과도 쓸 수 있다
data class PersonDto(
    val name: String,
    val age: Int,
)
