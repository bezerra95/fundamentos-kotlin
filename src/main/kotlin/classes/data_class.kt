package classes

// Exemplo sem data class
class PessoaSemDataClass(val nome: String, val idade: Int)

// Exemplo com data class
data class PessoaComDataClass(val nome: String, val idade: Int)

fun main() {
    // Criando instâncias das classes
    val pessoa1SemDataClass = PessoaSemDataClass("Alice", 25)
    val pessoa2SemDataClass = PessoaSemDataClass("Alice", 25)

    val pessoa1ComDataClass = PessoaComDataClass("Bob", 30)
    val pessoa2ComDataClass = PessoaComDataClass("Bob", 30)

    // Comparando instâncias
    println("Comparação sem data class: ${pessoa1SemDataClass == pessoa2SemDataClass}") // false
    println("Comparação com data class: ${pessoa1ComDataClass == pessoa2ComDataClass}") // true

    // Copiando instância com alterações
    val pessoa1Copia = pessoa1ComDataClass.copy(idade = 31)
    println("Cópia com alteração de idade: $pessoa1Copia")
}
