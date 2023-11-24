package variaveisTipoDeDados

/*
O tipo Unit é usado em Kotlin para representar uma função que
não retorna nenhum valor significativo. Aqui estão alguns exemplos:
*/


// Exemplo 1: Função que imprime uma mensagem e não retorna valor
fun imprimirMensagem(mensagem: String): Unit {
    println(mensagem)
}

// Exemplo 2: Função que executa uma ação, mas não retorna valor
fun realizarAcao() {
    println("Ação realizada com sucesso!")
}

// Exemplo 3: Função principal que chama as funções acima
fun main() {
    // Chamando a função imprimirMensagem
    imprimirMensagem("Olá, isso é uma mensagem!")

    // Chamando a função realizarAcao
    realizarAcao()

    // Atribuindo o resultado de uma função que retorna Unit a uma variável
    val resultado: Unit = realizarAcao()

    // Unit é o tipo de retorno padrão quando não há retorno especificado
    fun funcaoPadrao() { /* código da função */ }
}
