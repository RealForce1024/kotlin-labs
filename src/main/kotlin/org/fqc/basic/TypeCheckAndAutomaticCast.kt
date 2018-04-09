package org.fqc.basic

fun getStringLength(x: Any): Int? {
    if (x is String) {
        return x.length
    }
    return null
}

fun getStringLength_2(x: Any): Int? {
    if (x !is String) return null
    return x.length
}

fun getStringLength_3(x: Any): Int? {
    if (x is String && x.length > 0) {
        return x.length
    }
    return null
}

fun main(args: Array<String>) {
    printLength("Incomprehensibilities")
    printLength("")
    printLength(1000)
}

fun printLength(obj: Any): Unit {
//    println("'$obj' string lenght is ${org.fqc.basic.getStringLength(obj)}?:... error,is empty or not a string at all")
//    println("'$obj' string lenth is ${org.fqc.basic.getStringLength_2(obj) ?: "... err, is empty or not a string at all"}")
    println("'$obj' string lenth is ${getStringLength_3(obj) ?: "... err, is empty or not a string at all"}")
}
