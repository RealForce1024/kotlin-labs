package org.fqc.basic

fun MaxOf(x: Int, y: Int): Int {
    if (x > y) {
        return x
    } else {
        return y
    }
}

fun MaxOf_2(x: Int, y: Int) = if (x > y) x else y

fun main(args: Array<String>) {
    val maxOf = MaxOf(1, 2)
    println("maxOf = ${maxOf}")

    val maxOf_2 = MaxOf_2(1, 2)
    println("maxOf_2 = ${maxOf_2}")
}
