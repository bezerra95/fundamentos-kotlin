package colecoes

/*
take :
 O método take é usado para selecionar os primeiros elementos de uma coleção.
 O número de elementos que você deseja pegar é passado como argumento para o método.


takeLast :
 Por outro lado, o método takeLast é usado para pegar os últimos elementos de uma coleção.
 Assim como o take, o número de elementos é especificado como argumento.
 */

fun main() {
    val data = listaDeDados()

    // Me dê as duas PRIMEIRAS receitas
    val firstTwo = data.take(2)
    for (x in firstTwo.withIndex()) {
        println("${x.index + 1} - ${x.value.nome}")
    }

    println()

    // Me dê as duas ULTIMAS receitas
    val lastTwo = data.takeLast(2)
    for (x in lastTwo.withIndex()) {
        println("${x.index + 1} - ${x.value.nome}")
    }
}

private fun listaDeDados(): List<Receita6> {
    return listOf(
        Receita6(
            "Lasanha", 1200,
            listOf(
                Ingrediente6("Presunto", 5),
                Ingrediente6("Queijo", 10),
                Ingrediente6("Molho de tomate", 2),
                Ingrediente6("Manjerição", 3)
            )
        ),
        Receita6("Panqueca", 500),
        Receita6("Omelete", 200),
        Receita6("Parmegiana", 700),
        Receita6("Sopa de feijão", 300),
        Receita6(
            "Hamburguer", 2000,
            listOf(
                Ingrediente6("Pão", 1),
                Ingrediente6("Hamburguer", 3),
                Ingrediente6("Queijo", 1),
                Ingrediente6("Catupiry", 1),
                Ingrediente6("Bacon", 3),
                Ingrediente6("Alface", 1),
                Ingrediente6("Tomate", 1)
            )
        )
    )
}

data class Receita6(val nome: String, val calorias: Int, val ingredientes: List<Ingrediente6> = listOf())
data class Ingrediente6(val nome: String, val quantidade: Int)