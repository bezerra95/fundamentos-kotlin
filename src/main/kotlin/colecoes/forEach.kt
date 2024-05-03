package colecoes

// ForEach = Para cada

fun main() {
    val data = listaDeDados()

    //intera na lista  = para cada receita filtrada impra o nome
    data.filter { it.calorias > 500 }.forEach { println(it.nome) }
}
// Retorna lista de dados
private fun listaDeDados(): List<Receita5> {
    return listOf(
        Receita5(
            "Lasanha", 1200,
            listOf(
                Ingrediente5("Presunto", 5),
                Ingrediente5("Queijo", 10),
                Ingrediente5("Molho de tomate", 2),
                Ingrediente5("Manjerição", 3)
            )
        ),
        Receita5("Panqueca", 500),
        Receita5("Omelete", 200),
        Receita5("Parmegiana", 700),
        Receita5("Sopa de feijão", 300),
        Receita5(
            "Hamburguer", 2000,
            listOf(
                Ingrediente5("Pão", 1),
                Ingrediente5("Hamburguer", 3),
                Ingrediente5("Queijo", 1),
                Ingrediente5("Catupiry", 1),
                Ingrediente5("Bacon", 3),
                Ingrediente5("Alface", 1),
                Ingrediente5("Tomate", 1)
            )
        )
    )
}

data class Receita5(val nome: String, val calorias: Int, val ingredientes: List<Ingrediente5> = listOf())
data class Ingrediente5(val nome: String, val quantidade: Int)