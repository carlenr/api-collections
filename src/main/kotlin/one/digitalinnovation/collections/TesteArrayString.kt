package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3){""}
    nomes[0] = "Maria"
    nomes[1] = "João"
    nomes[2] = "José"
    for (nome in nomes){
        println(nome)
    }
    nomes.sort()
    nomes.forEach { println(it) }
}

