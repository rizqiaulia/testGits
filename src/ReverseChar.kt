import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    println("Enter maximum char : ")
    val maxChar = scanner.next().toInt()
    val arrayChar = mutableListOf<Char>()

    for (i in 0 until maxChar){
        val char = scanner.next().single()
        arrayChar.add(char)
    }

    val combineChar = String(arrayChar.toCharArray())
    println(reverseString(combineChar))
}

fun reverseString(str: String): String{
    if(str.length == 0)
        return str
    return reverseString(str.substring(1)) + str[0]
}