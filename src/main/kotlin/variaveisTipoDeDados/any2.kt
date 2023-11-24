package variaveisTipoDeDados

fun printData(data: Any) {
    println("Data: $data")
}

fun main() {
    // Exemplo 1: Inteiro
    val numero: Any = 42
    printData(numero)

    // Exemplo 2: String
    val texto: Any = "Olá, mundo!"
    printData(texto)

    // Exemplo 3: Lista de qualquer tipo
    val lista: Any = listOf(1, "dois", 3.0)
    printData(lista)

    // Exemplo 4: Objeto personalizado
    data class Pessoa(val nome: String, val idade: Int)
    val pessoa: Any = Pessoa("João", 30)
    printData(pessoa)
}
