package functionalProgramming

fun toSentenceCase(input: String) : String {
    return input[0].uppercaseChar() + input.substring(1)
}

fun main(args: Array<String>) {
    println(toSentenceCase("hello"))
}