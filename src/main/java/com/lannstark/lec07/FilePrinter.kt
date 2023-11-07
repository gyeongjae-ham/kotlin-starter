package com.lannstark.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FilePrinter {

    // IOException이 발생하는데도 빨간줄이 뜨지 않는다
    // Kotlin에서는 Checked Exception과 Unchecked Exception을 구분하지 않는다
    // 모두 Unchecked Exception이다
    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

}

