package variaveis


fun main() {
    // Variáveis imutáveis
    val numero: Int = 10 // Sem limite específico, mas usa 32 bits de armazenamento
    val nome: String = "João" // Tamanho máximo depende da capacidade de armazenamento da memória
    val estaCorreto: Boolean = true // Pode ser true (verdadeiro) ou false (falso)
    val pi: Double = 3.14 // Precisão de 15 a 16 dígitos decimais
    val caractere: Char = 'A' // Armazena um único caractere Unicode

    // Variáveis mutáveis
    var idade: Int = 25 // Sem limite específico, mas usa 32 bits de armazenamento
    var salario: Float = 2500.50f // Precisão de 6 a 7 dígitos decimais
    var saudacao: String = "Olá" // Tamanho máximo depende da capacidade de armazenamento da memória

    // Exibindo os valores das variáveis
    println("Número: $numero")
    println("Nome: $nome")
    println("Está correto? $estaCorreto")
    println("PI: $pi")
    println("Caractere: $caractere")
    println("Idade: $idade")
    println("Salário: $salario")
    println("Saudação: $saudacao")
}