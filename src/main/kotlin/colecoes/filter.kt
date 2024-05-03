package colecoes


/*
Função sum:

A função sum é usada para calcular a soma dos elementos em uma coleção numérica,
como uma lista de números. Ela retorna a soma total dos elementos na coleção.
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

Função sumOf:

A função sumOf é usada para calcular a soma de um valor específico derivado de
cada elemento na coleção. Em outras palavras, você pode aplicar uma transformação
a cada elemento e depois somar os resultados.
*/


fun main() {
    val data = listaDeDados()

    // Sei como fazer panqueca? E sushi?
    val knowPanqueke = data.filter { it.nome == "Panqueca" }.any()
    println("Sei fazer panqueca? ${if (knowPanqueke) "sim" else "não"}")

    val knowSushi = data.filter { it.nome == "Sushi" }.any()
    println("Sei fazer sushi? ${if (knowSushi) "sim" else "não"}")

}


// Retorna lista de dados
private fun listaDeDados(): List<Receita4> {
    return listOf(
        Receita4(
            "Lasanha", 1200,
            listOf(
                Ingrediente4("Presunto", 5),
                Ingrediente4("Queijo", 10),
                Ingrediente4("Molho de tomate", 2),
                Ingrediente4("Manjerição", 3)
            )
        ),
        Receita4("Panqueca", 500),
        Receita4("Omelete", 200),
        Receita4("Parmegiana", 700),
        Receita4("Sopa de feijão", 300),
        Receita4(
            "Hamburguer", 2000,
            listOf(
                Ingrediente4("Pão", 1),
                Ingrediente4("Hamburguer", 3),
                Ingrediente4("Queijo", 1),
                Ingrediente4("Catupiry", 1),
                Ingrediente4("Bacon", 3),
                Ingrediente4("Alface", 1),
                Ingrediente4("Tomate", 1)
            )
        )
    )
}

data class Receita4(val nome: String, val calorias: Int, val ingredientes: List<Ingrediente4> = listOf())
data class Ingrediente4(val nome: String, val quantidade: Int)