package colecoes

fun main() {
    // Exemplo 1: Criando um conjunto e adicionando elementos
    val conjunto: Set<Int> = setOf(1, 2, 3, 4, 4, 5) // Criando um conjunto com elementos inteiros

    println("Conjunto: $conjunto") // Conjunto: [1, 2, 3, 4, 5]

    // Exemplo 2: Verificando se um elemento pertence ao conjunto
    val conjuntoStrings: Set<String> = setOf("maçã", "banana", "laranja")

    val elemento = "banana"
    val contemElemento = conjuntoStrings.contains(elemento)

    println("O conjunto contém \"$elemento\"? $contemElemento") // O conjunto contém "banana"? true

    // Exemplo 3: Realizando operações entre conjuntos
    val conjuntoA: Set<Int> = setOf(1, 2, 3, 4)
    val conjuntoB: Set<Int> = setOf(3, 4, 5, 6)

    val uniao = conjuntoA.union(conjuntoB) // Realiza a união entre os conjuntos A e B
    val intersecao = conjuntoA.intersect(conjuntoB) // Realiza a interseção entre os conjuntos A e B
    val diferenca = conjuntoA.subtract(conjuntoB) // Realiza a diferença entre os conjuntos A e B

    println("União: $uniao") // União: [1, 2, 3, 4, 5, 6]
    println("Interseção: $intersecao") // Interseção: [3, 4]
    println("Diferença: $diferenca") // Diferença: [1, 2]
}