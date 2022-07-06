package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 4
    values[3] = 2
    values[4] = 9

    for (value in values){
        println(value)
    }
    println("------------------")
    values.forEach {value ->
        println(value)
    }
    println("------------------")
    for (valor in values.indices){
        println(values[valor])
    }
    println("------------------")
    values.sort()
    for (valor in values){
        println(valor)
    }
}