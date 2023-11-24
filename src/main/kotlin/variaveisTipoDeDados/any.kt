package variaveisTipoDeDados

/*Em Kotlin, Any é um tipo especial que representa qualquer tipo de objeto.
É como se fosse uma caixa que pode conter qualquer coisa, seja um número,
uma string, um objeto personalizado ou até mesmo null.

Por exemplo, se você tem uma função que pode retornar diferentes tipos de dados,
você pode usar Any para indicar que o resultado pode ser de qualquer tipo.
No entanto, ao usar Any, você perde um pouco da segurança de tipos,
já que o compilador não pode garantir o tipo específico contido em Any até o momento da execução.

Em resumo, Any é uma maneira flexível de lidar com diferentes tipos de dados,
mas deve ser usado com cautela, pois a verificação de tipos pode ser necessária
para garantir um comportamento seguro do programa.*/



// Exemplo: Função com parâmetro do tipo Any
fun exibirDetalhes(item: Any) {
    // Verifica se o item é uma String
    if (item is String) {
        println("É uma String: \"$item\"")
    } else {
        println("Não é uma String.")
    }

    // Utiliza o operador "as" para fazer cast para Int, se possível
    val numero: Int? = item as? Int
    if (numero != null) {
        println("Número: $numero")
    } else {
        println("Não é um número inteiro.")
    }

    // Verifica se o item é nulo
    if (item != null) {
        // Utiliza o método toString() para obter a representação em String
        val stringRepresentation = item.toString()
        println("Representação em String: $stringRepresentation")
    } else {
        println("O item é nulo.")
    }
}

fun main() {
    // Chamando a função com diferentes tipos de argumentos
    exibirDetalhes("Olá")  // Imprime "É uma String: "Olá""
    exibirDetalhes(42)      // Imprime "Número: 42"
    exibirDetalhes(3.14)    // Imprime "Não é um número inteiro."
}
