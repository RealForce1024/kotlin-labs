package org.fqc.basic

data class Person(
        val name: String,
        var age: Int? = null
)

fun main(args: Array<String>) {
    val persons = listOf<Person>(Person("kobe", 19), Person("james", 20))
    val oldest = persons.maxBy { it.age ?: 0 }
    println("The oldest is: ${oldest?.name}")

    findPerson()

    fun findKobe() = findPerson2(persons, "kobe")
    println(findKobe()?.name)

}

fun findPerson(): Unit {
    val persons = listOf<Person>(Person("kobe"), Person("james", 23))
    fun findJames() = persons.find { it.name == "james" }
    println(findJames()?.name)
    fun findKobe() = persons.find { it.name == "kobe" }
    println(findKobe())
}

fun findPerson2(persons: List<Person>, name: String): Person? {
    val persons = listOf<Person>(Person("kobe"), Person("james", 24))
    fun findPerson() = persons.find { it.name == name }
    return findPerson()
}

