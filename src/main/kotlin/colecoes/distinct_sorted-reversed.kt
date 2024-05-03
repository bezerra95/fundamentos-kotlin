package colecoes

/*
distinct():
Esta função retorna uma nova lista removendo elementos duplicados.
A duplicação é determinada pela igualdade dos objetos (equals). No exemplo acima,
as receitas de "Lasanha" duplicadas são consolidadas em uma.


sortedBy { it.calorias }:
Esta função ordena a lista com base em uma propriedade específica dos objetos,
neste caso as calorias. sortedBy é útil quando os elementos não implementam Comparable diretamente.

reversed():
Esta função reverte a ordem dos elementos na lista. No exemplo, ela é usada para inverter
a ordem da lista previamente ordenada por calorias. É comum usar reversed após sorted
ou sortedBy para obter uma ordem decrescente.
*/


fun main() {
    val receitas = listaDeReceitas()

    // distinct: Remove elementos duplicados baseando-se na igualdade completa dos objetos.
    val receitasUnicas = receitas.distinct()
    println("Receitas únicas:")
    receitasUnicas.forEach { println("${it.nome}: ${it.calorias} calorias") }

    // sorted: Ordena elementos que são naturalmente comparáveis (exige Comparable).
    // Usaremos sortedBy para ordenar por calorias porque String (nome) não é naturalmente comparável nesta lista.
    val receitasOrdenadasPorCalorias = receitas.sortedBy { it.calorias }
    println("Receitas ordenadas por calorias:")
    receitasOrdenadasPorCalorias.forEach { println("${it.nome}: ${it.calorias} calorias") }

    // reversed: Reverte a ordem dos elementos na lista.
    val receitasReversas = receitasOrdenadasPorCalorias.reversed()
    println("Receitas em ordem reversa de calorias:")
    receitasReversas.forEach { println("${it.nome}: ${it.calorias} calorias") }
}

private fun listaDeReceitas(): List<Receita11> {
    return listOf(
        Receita11("Lasanha", 1200),
        Receita11("Lasanha", 1200), // Duplicata intencional para demonstrar o distinct.
        Receita11("Panqueca", 500),
        Receita11("Omelete", 200),
        Receita11("Parmegiana", 700),
        Receita11("Sopa de feijão", 300),
        Receita11("Hamburguer", 2000)
    )
}

data class Receita11(val nome: String, val calorias: Int, val ingredientes: List<Ingrediente11> = listOf())
data class Ingrediente11(val nome: String, val quantidade: Int)
