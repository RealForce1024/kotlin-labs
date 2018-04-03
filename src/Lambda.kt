fun main(args: Array<String>) {
    val fruits = listOf<String>("avocado", "orange", "apple", "kiwifruit", "banana")
    fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }.reversed()
            .map { it.toUpperCase() }
            .forEach { println(it) }

}