package colecoes


fun main() {
    val data = listaDeDados()

    // Qual a soma de calorias?
    val sumCalories = data.sumOf { it.calorias }
    println("A soma de calorias é: $sumCalories")

    val numeros: List<Int> = listOf(1, 2, 3, 4, 5)
    println(numeros.sum())
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

data class Receita9(val nome: String, val calorias: Int, val ingredientes: List<Ingrediente10> = listOf())
data class Ingrediente9(val nome: String, val quantidade: Int)