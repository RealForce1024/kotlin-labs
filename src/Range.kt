fun main(args: Array<String>) {
    var x = 10
    var y = 9
    if (x in 1..y + 1) {
        println("fit in range")
    }

    val fruits = listOf<String>("apple", "banana", "orange")
    if (-1 !in 0..fruits.lastIndex) {
        println("-1 is out of range")
    }

    if (fruits.size !in fruits.indices) {
        println("list size is out of valid list indices range too")
        println(fruits.indices)
    }
}