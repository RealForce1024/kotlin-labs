fun parseInt(x: String): Int? {
//    return x.toInt()
    return x.toIntOrNull()
}

fun printProduct(x: String, y: String): Unit {
    var x = parseInt(x)
    var y = parseInt(y)

    if (x != null && y != null) {
        println("x * y = ${x * y}")
    } else {
        println("either '$x' or '$y' is not a number")
    }
}

fun printProduct_2(x: String, y: String): Unit {
    val x = parseInt(x)
    val y = parseInt(y)

    if (x == null) {
        println("wrong number format in x: '$x'")
        return
    }
    if (y == null) {
        println("wrong number format in y: '$y'")
        return
    }

    println("x * y = ${x * y}")
}

fun main(args: Array<String>) {
    printProduct("10", "99")
    printProduct("12", "6")
    printProduct("a", "10")

    printProduct_2("1","100")
    printProduct_2("a","b")
    printProduct_2("99","c")
}

