package decorator

import java.io.BufferedInputStream
import java.io.FileInputStream

fun main() {
    /**
     * our decorator decorates the BufferedInput class and adds a custom behaviour
     * - classes should be open for extension but closed for modifications
     */

    val inputStream = LowerCaseInputStream(
        BufferedInputStream(
            FileInputStream("/Users/bounce/Documents/design-patterns/src/decorator.main/kotlin/decorator.test.txt")))
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