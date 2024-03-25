package orientacaoObjeto

// Enumeração representando os dias da semana
enum class DiaSemana {
    SEGUNDA,
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA,
    SABADO,
    DOMINGO
}

// Enumeração representando categorias de produtos com valores inteiros
enum class Categoria(val codigo: Int) {
    ELETRONICOS(1),
    LIVROS(2),
    VESTUARIO(3),
    ALIMENTOS(4),
    OUTROS(5)
}

// Enumeração representando os meses do ano
enum class Meses(val numero: Int) {
    JANEIRO(1) {
        override fun toString() = "Janeiro"
    },
    FEVEREIRO(2) {
        override fun toString() = "Fevereiro"
    },
    MARCO(3) {
        override fun toString() = "Março"
    },
    // E assim por diante para os outros meses
}

fun main() {
    // Acessando os valores da enumeração DiaSemana
    val diaAtual = DiaSemana.QUARTA

    // Exibindo o dia da semana atual
    println("Hoje é $diaAtual")

    // Verificando se é final de semana
    if (diaAtual == DiaSemana.SABADO || diaAtual == DiaSemana.DOMINGO) {
        println("É final de semana! :)")
    } else {
        println("Não é final de semana. :(")
    }
    println()

    // Lista de dias
    for (dia in DiaSemana.values()) {
        println(dia)
    }
    println()

    // Acessando os valores e atributos da enumeração Categoria
    val categoriaProduto = Categoria.LIVROS

    // Exibindo informações sobre a categoria do produto
    println("Categoria do produto: ${categoriaProduto.name}")
    println("Código da categoria: ${categoriaProduto.codigo}")

    // Verificando a categoria do produto
    when (categoriaProduto) {
        Categoria.ELETRONICOS -> println("Produto pertence à categoria de Eletrônicos")
        Categoria.LIVROS -> println("Produto pertence à categoria de Livros")
        Categoria.VESTUARIO -> println("Produto pertence à categoria de Vestuário")
        Categoria.ALIMENTOS -> println("Produto pertence à categoria de Alimentos")
        Categoria.OUTROS -> println("Produto pertence à categoria de Outros")
    }

    println()
    // Acessando os valores e atributos da enumeração Meses
    val mesAtual = Meses.JANEIRO
    // Exibindo informações sobre o mês atual
    println("Mês atual: $mesAtual (${mesAtual.numero})")
}
