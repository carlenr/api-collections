package one.digitalinnovation.collections

fun main() {
    val values = intArrayOf(1, 9, 5, 10, 7, 12)

    values.forEach {
        println(it)
    }
    println("---------------")
    values.sort()
    values.forEach {
        println(it)
    }
}