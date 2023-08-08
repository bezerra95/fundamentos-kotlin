package colecoes

fun main() {
    val numeros = listOf(10, 15, 20, 25, 30)

    val soma = numeros.sum()
    val media = numeros.average()
    val maximo = numeros.maxOrNull()
    val minimo = numeros.minOrNull()

    println("Números: $numeros")
    println("Soma: $soma")
    println("Média: $media")
    println("Máximo: $maximo")
    println("Mínimo: $minimo")
}