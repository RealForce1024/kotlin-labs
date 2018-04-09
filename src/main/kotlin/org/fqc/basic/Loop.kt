package org.fqc.basic

fun main(args: Array<String>) {
    val fruits = listOf<String>("apple", "banana", "orange")
    for (fruit in fruits) {
        println(fruit)
    }
    println("=============================")
    var i = 0
    while (i<fruits.size) {
        println(fruits[i])
        i++
    }
}