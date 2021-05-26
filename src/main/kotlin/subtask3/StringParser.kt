package subtask3

import java.util.*

class StringParser {

    val symMap = mapOf<Char, Char>('(' to ')', '[' to ']', '<' to '>')

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val arr =  arrayListOf<String>()
        inputString.forEachIndexed { index, c -> if (c == '(' || c == '[' || c == '<') arr.add(foundSymbol(inputString, c, index)) }
        return arr.toTypedArray()
    }

    private fun foundSymbol(inputString: String, symbol: Char, ind: Int): String {
        var mustSkip = 0
        var i = ind
        while (i < inputString.length) {
            if (i != ind && inputString[i] == symbol) {
                mustSkip++
            } else if (inputString[i] == symMap[symbol]) {
                if (mustSkip > 0) {
                    mustSkip--
                } else {
                    return inputString.substring(ind + 1, i)
                }
            }
            i++
        }
        return ""
    }
}