package org.fqc.basic

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum_2(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int) {
    println("org.fqc.basic.sum of $a and $b is ${a + b}")
}


fun main(args: Array<String>) {
    println(sum(1, 2))
    println(sum_2(2, 4))
    printSum(7, 9)
}