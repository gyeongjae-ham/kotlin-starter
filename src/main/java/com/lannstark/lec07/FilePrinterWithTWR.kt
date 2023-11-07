package com.lannstark.lec07

import java.io.BufferedReader
import java.io.FileReader

// Java - try with resources
// Kotlin에서는 try with resources가 없고, use라는 inline 확장 함수를 사용한다
class FilePrinterWithTWR {

    fun readFile(path: String) {
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }

}
