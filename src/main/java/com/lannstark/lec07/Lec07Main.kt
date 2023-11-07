package com.lannstark.lec07

import java.lang.NumberFormatException

// 코틀린에서 예외를 다루는 방법
/**
 * 1. try catch finally 구문
 * 2. Checked Exception과 Unchecked Exception
 * 3. try with resources
 */
fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}은 숫자가 아닙니다")
    }
}

// try catch문도 Expression이므로 return으로 가능
fun parseIntOrThrowV2(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

fun main() {
    FilePrinter().readFile()
}
