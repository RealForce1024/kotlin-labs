fun main(args: Array<String>) {
    println(describe(1))
    println(describe("Hello"))
    println(describe(1000L))
    println(describe(2))
    println(describe("other"))

    println("=============================")

    println(describe_2(1))
    println(describe_2("2"))
    println(describe_2(true))
    println(describe_2("else"))
    println(describe_2("other"))


}

fun describe(obj: Any): String =
        when (obj) {
            1 -> "one"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "not a string"
            else -> "Unknown"
        }

fun describe_2(obj: Any): Any =
        when (obj) {
            1 -> "one"
            "2" -> "tow"
            is Boolean -> "true"
            else -> "else 原路返回:${obj}"
        }


