package colecoes


fun main() {
    val data = listaDeDados()

    // Faça uma lista com o nome dos pratos
    data.map { it.nome }

// Qual a média de caloria de todas as receitas?
    val media = data.map { it.calorias }.average()
    println("A média de calorias é: $media.")
}

// Retorna lista de dados
private fun listaDeDados(): List<Receita8> {
    return listOf(
        Receita8(
            "Lasanha", 1200,
            listOf(
                Ingrediente8("Presunto", 5),
                Ingrediente8("Queijo", 10),
                Ingrediente8("Molho de tomate", 2),
                Ingrediente8("Manjerição", 3)
            )
        ),
        Receita8("Panqueca", 500),
        Receita8("Omelete", 200),
        Receita8("Parmegiana", 700),
        Receita8("Sopa de feijão", 300),
        Receita8(
            "Hamburguer", 2000,
            listOf(
                Ingrediente8("Pão", 1),
                Ingrediente8("Hamburguer", 3),
                Ingrediente8("Queijo", 1),
                Ingrediente8("Catupiry", 1),
                Ingrediente8("Bacon", 3),
                Ingrediente8("Alface", 1),
                Ingrediente8("Tomate", 1)
            )
        )
    )
}

data class Receita8(val nome: String, val calorias: Int, val ingredientes: List<Ingrediente8> = listOf())
data class Ingrediente8(val nome: String, val quantidade: Int)

