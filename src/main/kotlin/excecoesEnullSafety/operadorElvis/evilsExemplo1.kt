package excecoesEnullSafety.operadorElvis

fun main() {
    // Exemplo 1: Atribuir um valor padrão se a variável for nula
    val nome: String? = null
    val nomeNaoNulo = nome ?: "Nome Padrão"
    println("Exemplo 1: $nomeNaoNulo") // Saída: Nome Padrão

    // Exemplo 2: Usar o operador Elvis em uma expressão
    val comprimento: Int? = null
    val comprimentoNaoNulo = comprimento ?: 0
    println("Exemplo 2: $comprimentoNaoNulo") // Saída: 0

    // Exemplo 3: Usar o operador Elvis em uma expressão com uma variável não nula
    val idade: Int? = 25
    val idadeNaoNula = idade ?: 0
    println("Exemplo 3: $idadeNaoNula") // Saída: 25

    // Exemplo 4: Usar o operador Elvis em cadeias de chamadas
    val pessoa: Pessoa? = null
    val primeiroNome = pessoa?.nome ?: "Nome Padrão"
    println("Exemplo 4: $primeiroNome") // Saída: Nome Padrão (pessoa é nula, então o padrão é usado)
}

data class Pessoa(val nome: String)
