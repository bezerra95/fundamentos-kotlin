package variaveisTipoDeDados

// Exemplo 1: Função que aceita uma quantidade variável de inteiros e retorna sua soma
fun sum2(vararg numbers: Int): Int {
    return numbers.sum()
}

// Exemplo 2: Função que imprime elementos de uma lista e aceita varargs
fun printElements2(vararg elements: Any) {
    for (element in elements) {
        println(element)
    }
}

// Exemplo 3: Função que concatena strings usando varargs
fun concatenateStrings2(vararg strings: String): String {
    return strings.joinToString(", ")
}

fun main() {
    // Exemplo de uso da função 'sum' com entrada do usuário
    print("Digite alguns números separados por espaço: ")
    val userInput = readLine()
    val numbers = userInput?.split(" ")?.map { it.toInt() } ?: emptyList()
    val result = sum2(*numbers.toIntArray())
    println("Soma: $result")

    // Exemplo de uso da função 'printElements' com entrada do usuário
    print("Digite alguns elementos separados por vírgula: ")
    val userElements = readLine()?.split(",") ?: emptyList()
    printElements2(*userElements.toTypedArray())

    // Exemplo de uso da função 'concatenateStrings' com entrada do usuário
    print("Digite algumas palavras separadas por espaço: ")
    val userWords = readLine()?.split(" ") ?: emptyList()
    val concatenated = concatenateStrings2(*userWords.toTypedArray())
    println("Concatenação: $concatenated")
}
