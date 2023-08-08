package colecoes

fun main() {
    // Criando uma lista de números inteiros
    val numeros: List<Int> = listOf(1, 2, 3, 4, 5)

    // Acessando elementos da lista
    println("Primeiro elemento: ${numeros[0]}")
    println("Último elemento: ${numeros.last()}")

    // Tamanho da lista
    println("Tamanho da lista: ${numeros.size}")

    // Verificando se a lista está vazia
    println("Lista está vazia? ${numeros.isEmpty()}")

    // Verificando se um elemento está na lista
    val elemento = 3
    println("$elemento está na lista? ${elemento in numeros}")

    // Iterando sobre a lista usando for loop
    println("Iterando sobre a lista:")
    for (numero in numeros) {
        println(numero)
    }

    // Iterando sobre a lista usando forEach
    println("Iterando usando forEach:")
    numeros.forEach { println(it) }

    // Filtrando elementos maiores que 2
    val numerosMaioresQue2 = numeros.filter { it > 2 }
    println("Números maiores que 2: $numerosMaioresQue2")

    // Mapeando os elementos para o dobro
    val numerosDobro = numeros.map { it * 2 }
    println("Números dobrados: $numerosDobro")

    // Verificando se todos os elementos são pares
    val todosPares = numeros.all { it % 2 == 0 }
    println("Todos são pares? $todosPares")

    // Verificando se algum elemento é par
    val algumPar = numeros.any { it % 2 == 0 }
    println("Tem algum número par? $algumPar")

    // Encontrando o primeiro número par
    val primeiroPar = numeros.firstOrNull { it % 2 == 0 }
    println("Primeiro número par: $primeiroPar")

    // Somando todos os elementos
    val soma = numeros.sum()
    println("Soma dos números: $soma")
}
