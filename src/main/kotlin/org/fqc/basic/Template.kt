package org.fqc.basic

fun main(args: Array<String>) {
    var a = 99
    val s1 = "a is $a"

    a = 100
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)
}