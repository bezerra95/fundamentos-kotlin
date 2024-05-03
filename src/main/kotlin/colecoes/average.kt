package colecoes

/*
A função average() calcula a média dos valores em uma coleção. No exemplo acima,
transformamos a lista de Receita7 em uma lista de Int (as calorias) com map { it.calorias }
e depois aplicamos average() para calcular a média.
Essa abordagem é útil para análises rápidas e relatórios estatísticos em coleções de dados.
*/
fun main() {
    val data = listaDeDados()

    // Qual a média de caloria de todas as receitas?
    val media = data.map { it.calorias }.average()
    println("A média de calorias é: $media.")

    // maxByOrNull: Encontra o elemento com o maior valor baseado em uma propriedade ou função dada.
    val maisCal = data.maxByOrNull { it.calorias }
    println("Mais calórica: ${maisCal?.nome}") // Imprime a receita com mais calorias.

    // minByOrNull: Encontra o elemento com o menor valor baseado em uma propriedade ou função dada.
    val menosCal = data.minByOrNull { it.calorias }
    println("Menos calórica: ${menosCal?.nome}") // Imprime a receita com menos calorias.


    //CALCULA A MÉDIA DE CALORIAS USANDO AVERAGE() - average()
    val mediaCalorias = data.map { it.calorias }.average()
    println("Média de calorias: $mediaCalorias") // Imprime a média de calorias das receitas.


    // Exemplos adicionais usando maxOrNull e minOrNull para comparar diretamente valores.
    val maxCalorias = data.map { it.calorias }.maxOrNull()
    println("Maior número de calorias: $maxCalorias")

    val minCalorias = data.map { it.calorias }.minOrNull()
    println("Menor número de calorias: $minCalorias")

}


// Retorna lista de dados
private fun listaDeDados(): List<Receita10> {
    return listOf(
        Receita10(
            "Lasanha", 1200,
            listOf(
                Ingrediente10("Presunto", 5),
                Ingrediente10("Queijo", 10),
                Ingrediente10("Molho de tomate", 2),
                Ingrediente10("Manjerição", 3)
            )
        ),
        Receita10("Panqueca", 500),
        Receita10("Omelete", 200),
        Receita10("Parmegiana", 700),
        Receita10("Sopa de feijão", 300),
        Receita10(
            "Hamburguer", 2000,
            listOf(
                Ingrediente10("Pão", 1),
                Ingrediente10("Hamburguer", 3),
                Ingrediente10("Queijo", 1),
                Ingrediente10("Catupiry", 1),
                Ingrediente10("Bacon", 3),
                Ingrediente10("Alface", 1),
                Ingrediente10("Tomate", 1)
            )
        )
    )
}

data class Receita10(val nome: String, val calorias: Int, val ingredientes: List<Ingrediente10> = listOf())
data class Ingrediente10(val nome: String, val quantidade: Int)