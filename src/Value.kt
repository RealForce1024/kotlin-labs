fun main(args: Array<String>) {
    var a = 10
    val b = 112
    var c = 100
    c += 1
    println("a = ${a}")

    var x = 2
    val PI = 3.14
    x += 1
    println("x = ${x}")

    incrementX()
}


var x = 99
/*fun incrementX(x: Int) {
    x += 1 // Val can't be reassigned
    *//*aaa*//*
}*/

fun incrementX(): Unit {
    x += 1
    println("x = ${x}")
}
