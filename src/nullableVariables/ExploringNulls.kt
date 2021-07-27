package nullableVariables

import java.util.*

fun main(args: Array<String>) {

    var name: String? = null

    //name = "Matt"

    println(name!!.uppercase(Locale.getDefault()))

    var address :String? = null

    address = "Hello"

    var myInteger :Int? = 7

    myInteger = null
}