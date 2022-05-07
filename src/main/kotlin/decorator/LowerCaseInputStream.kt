package decorator

import java.io.FilterInputStream
import java.io.InputStream

class LowerCaseInputStream(inputStream: InputStream) : FilterInputStream(inputStream) {

    override fun read(): Int {
        val c =  super.read()
        if (c == -1){
            return -1
        }
        return c.toChar().lowercase()[0].code
    }
}