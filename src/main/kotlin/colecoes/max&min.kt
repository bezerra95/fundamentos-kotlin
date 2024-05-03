package colecoes

/*
maxByOrNull e minByOrNull: Essas funções são usadas para encontrar o máximo
e o mínimo em uma coleção com base em um critério específico, neste caso,
as calorias de uma receita. Se a lista estiver vazia, retornarão null, daí o sufixo "OrNull".

maxOrNull e minOrNull: Essas funções foram introduzidas como substitutas das funções
depreciadas max e min e são usadas para encontrar o maior e o menor valor em uma
coleção de valores diretamente.

O exemplo adicionado demonstra o uso de maxOrNull e minOrNull em uma lista de inteiros,
 que são as calorias das receitas, para encontrar os valores extremos diretamente.
*/

fun main() {
    val data = listaDeDados() // Obtem a lista de dados (receitas).

    // maxByOrNull: Encontra o elemento com o maior valor baseado em uma propriedade ou função dada.
    val maisCal = data.maxByOrNull { it.calorias }
    println("Mais calórica: ${maisCal?.nome}") // Imprime a receita com mais calorias.

    // minByOrNull: Encontra o elemento com o menor valor baseado em uma propriedade ou função dada.
    val menosCal = data.minByOrNull { it.calorias }
    println("Menos calórica: ${menosCal?.nome}") // Imprime a receita com menos calorias.

    // Exemplos adicionais usando maxOrNull e minOrNull para comparar diretamente valores.
    val maxCalorias = data.map { it.calorias }.maxOrNull()
    println("Maior número de calorias: $maxCalorias")

    val minCalorias = data.map { it.calorias }.minOrNull()
    println("Menor número de calorias: $minCalorias")
}

// Retorna lista de dados

private fun listaDeDados(): List<Receita7> {
    return listOf(
        Receita7(
            "Lasanha", 1200,
            listOf(
                Ingrediente7("Presunto", 5),
                Ingrediente7("Queijo", 10),
                Ingrediente7("Molho de tomate", 2),
                Ingrediente7("Manjerição", 3)
            )
        ),
        Receita7("Panqueca", 500),
        Receita7("Omelete", 200),
        Receita7("Parmegiana", 700),
        Receita7("Sopa de feijão", 300),
        Receita7(
            "Hamburguer", 2000,
            listOf(
                Ingrediente7("Pão", 1),
                Ingrediente7("Hamburguer", 3),
                Ingrediente7("Queijo", 1),
                Ingrediente7("Catupiry", 1),
                Ingrediente7("Bacon", 3),
                Ingrediente7("Alface", 1),
                Ingrediente7("Tomate", 1)
            )
        )
    )
}

data class Receita7(val nome: String, val calorias: Int, val ingredientes: List<Ingrediente7> = listOf())
data class Ingrediente7(val nome: String, val quantidade: Int)
}