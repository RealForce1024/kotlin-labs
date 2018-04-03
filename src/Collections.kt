fun main(args: Array<String>) {
    val fruits = listOf<String>("apple", "orange", "banana")
    for (fruit in fruits) {
        println("fruit${fruits.indexOf(fruit)} = ${fruit}")
    }

    val list = setOf<String>("apple", "orange", "kiwifruit")
    when {
        "banana" in list -> println("juicy")
        "apple" in list -> println("apple is fine too")
    }
}