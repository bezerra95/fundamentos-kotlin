package excecoesEnullSafety.let

fun main() {
    // Exemplo 1: Trabalhando com uma String não nula
    val nome1: String? = "Alice"
    nome1?.let {
        println("Olá, $it!")
    }

    // Exemplo 2: Trabalhando com uma lista não nula
    val listaNomes: List<String>? = listOf("Carlos", "Maria", "Pedro")
    listaNomes?.let {
        println("Nomes na lista: $it")
    }

    // Exemplo 3: Trabalhando com um número não nulo
    val numero: Int? = 42
    numero?.let {
        val quadrado = it * it
        println("O quadrado de $it é $quadrado")
    }

    // Exemplo 4: Trabalhando com um objeto não nulo
    data class Pessoa(val nome: String, val idade: Int)
    val pessoa: Pessoa? = Pessoa("João", 30)
    pessoa?.let {
        println("Nome: ${it.nome}, Idade: ${it.idade}")
    }

    // Exemplo 5: Trabalhando com um valor nulo
    val texto: String? = null
    texto?.let {
        println("Este código nunca será executado porque texto é nulo.")
    }
}
