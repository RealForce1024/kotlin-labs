package org.fqc.basic

fun main(args: Array<String>) {
    var a = 10
    val b = 112
    var c = 100
    c += 1
    println("a = ${a}")

    var x = 2
    val PI = 3.14
    x += 1
    println("org.fqc.basic.getX = ${x}")

    incrementX()
}


var x = 99
/*fun org.fqc.basic.incrementX(org.fqc.basic.getX: Int) {
    org.fqc.basic.getX += 1 // Val can't be reassigned
    *//*aaa*//*
}*/

fun incrementX(): Unit {
    x += 1
    println("org.fqc.basic.getX = ${x}")
}
