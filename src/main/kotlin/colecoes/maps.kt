package colecoes

fun main() {
    // Exemplo 1: Criando e acessando elementos de um Map
    val numeros: Map<String, Int> = mapOf(
        "um" to 1,
        "dois" to 2,
        "tres" to 3
    )

    println(numeros["um"]) // Saída: 1
    println(numeros["quatro"]) // Saída: null

    // Exemplo 2: Iterando sobre um Map
    for ((chave, valor) in numeros) {
        println("$chave: $valor")
    }
}