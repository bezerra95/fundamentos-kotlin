package variaveisTipoDeDados

// Exemplo 1: Função que aceita uma quantidade variável de inteiros e retorna sua soma
fun sum(vararg numbers: Int): Int {
    // 'numbers' é tratado como uma lista no corpo da função
    return numbers.sum()
}

// Exemplo 2: Função que imprime elementos de uma lista e aceita varargs
fun printElements(vararg elements: Any) {
    // Itera sobre os elementos e os imprime
    for (element in elements) {
        println(element)
    }
}

// Exemplo 3: Função que concatena strings usando varargs
fun concatenateStrings(vararg strings: String): String {
    // Usa a função joinToString para concatenar as strings com vírgula como separador
    return strings.joinToString(", ")
}

fun main() {
    // Exemplo de uso da função 'sum'
    val result = sum(1, 2, 3, 4, 5)
    println("Soma: $result")

    // Exemplo de uso da função 'printElements'
    printElements("Hello", 42, true, 3.14)

    // Exemplo de uso da função 'concatenateStrings'
    val concatenated = concatenateStrings("Kotlin", "é", "incrível")
    println("Concatenação: $concatenated")
}
