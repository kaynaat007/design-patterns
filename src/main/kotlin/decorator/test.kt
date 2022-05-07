package decorator

import java.io.BufferedInputStream
import java.io.FileInputStream

class test {


}

fun main() {
    println("Hello world !")
    val inputStream = LowerCaseInputStream(BufferedInputStream(FileInputStream("/Users/bounce/Documents/design-patterns/src/decorator.main/kotlin/decorator.test.txt")))
    while (true) {
        val c = inputStream.read()
        if (c < 0) {
            break
        }
        else {
            println((c.toChar()))
        }
    }
    inputStream.close()
}