import java.util.*


fun main() {
    val checkBracket = "{(([])[])[]}"

    if (checkBracket.trim().length !=0){
        print(isBracketMatch(checkBracket))
    }else{
        print("empty")
    }
}

fun isBracketMatch(bracket: String): Boolean {
    val stack = Stack<Char>()
    var singleBracket: Char
    for (element in bracket) {
        singleBracket = element
        when (singleBracket) {
            '(', '{', '[' -> stack.push(singleBracket)
            ')', '}', ']' -> {
                if (stack.isEmpty())
                    return false

                val lastChar = stack.peek()
                if (singleBracket == '}' && lastChar == '{' || singleBracket == ')' && lastChar == '(' || singleBracket == ']' && lastChar == '[') {
                    stack.pop()
                } else {
                    return false
                }
            }
        }
    }
    return stack.empty()
}