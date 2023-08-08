package colecoes


fun main() {
    val numerosMutaveis = mutableListOf(1, 2, 3, 4, 5) // Lista mutável de números inteiros

    println("Elementos da lista mutável:")
    for (numero in numerosMutaveis) {
        println(numero)
    }

    numerosMutaveis.add(6) // Adicionando um novo elemento à lista mutável
    numerosMutaveis.removeAt(2) // Removendo o elemento de índice 2 da lista mutável

    println("\nElementos atualizados da lista mutável:")
    for (numero in numerosMutaveis) {
        println(numero)
    }

    val numerosImutaveis = listOf(1, 2, 3, 4, 5) // Lista imutável de números inteiros

    println("\nElementos da lista imutável:")
    for (numero in numerosImutaveis) {
        println(numero)
    }
}
