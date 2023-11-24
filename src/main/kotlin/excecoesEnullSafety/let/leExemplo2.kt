package excecoesEnullSafety.let

fun main() {
    // Passo 1: Criando uma String opcional (pode ser nula ou não)
    val nome: String? = "Alice"

    // Passo 2: Usando a função let para operar na String
    nome?.let { valorNaoNulo ->
        // Passo 3: Este bloco será executado se 'nome' não for nulo
        println("Passo 3: 'nome' não é nulo. Valor: $valorNaoNulo")
    }

    // Passo 4: Criando outra String opcional que é nula
    val sobrenome: String? = null

    // Passo 5: Usando a função let com uma String nula
    sobrenome?.let { valorNaoNulo ->
        // Passo 6: Este bloco não será executado porque 'sobrenome' é nulo
        println("Passo 6: 'sobrenome' não é nulo. Valor: $valorNaoNulo")
    }

    // Passo 7: Usando o operador Elvis ?: para fornecer um valor padrão para String nula
    val nomeCompleto: String? = sobrenome ?: "Nome Padrão"
    nomeCompleto?.let { valorNaoNulo ->
        // Passo 8: Este bloco será executado com 'nomeCompleto' não nulo
        println("Passo 8: 'nomeCompleto' não é nulo. Valor: $valorNaoNulo")
    }

    // Passo 9: Usando a função let em uma expressão encadeada
    val numero: Int? = 42
    numero?.let { valorNaoNulo ->
        // Passo 10: Realizando operações em um valor não nulo
        val quadrado = valorNaoNulo * valorNaoNulo
        println("Passo 10: O quadrado de $valorNaoNulo é $quadrado")
    }
}
