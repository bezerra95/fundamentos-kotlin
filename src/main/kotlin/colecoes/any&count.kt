package colecoes

/*
Função any:
A função any é usada para verificar se pelo menos um elemento em uma coleção satisfaz uma condição específica.

Ela retorna um valor booleano:
true: se pelo menos um elemento na coleção atende à condição especificada.
false: se nenhum elemento na coleção atende à condição.
É uma maneira eficaz de verificar rapidamente a presença de elementos que cumpram certos critérios em uma coleção,
sem precisar iterar por todos os elementos manualmente.

- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

Função count:
A função count é usada para contar o número de elementos em uma coleção que satisfazem uma condição específica.

Ela retorna um número inteiro que representa a quantidade de elementos que atendem a essa condição.
Se você não especificar uma condição, count simplesmente retorna o número total de elementos na coleção.
Se você especificar uma condição, ela retorna o número de elementos que a satisfazem.
Essa função é útil quando você precisa saber quantos elementos em uma coleção atendem a uma condição específica,
ajudando em análises e validações dentro de conjuntos de dados.

Ambas as funções são ferramentas poderosas para trabalhar com coleções em Kotlin, permitindo escrever código conciso
e eficiente para realizar verificações e contagens condicionais.
*/
fun main() {
    val data = listaDeDados()

    // Tenho receitas na lista?
    println("Tenho receitas? ${if (data.any()) "sim" else "não"}.")

    // Quantas receitas tenho na coleção?
    println("Tenho ${data.count()} receitas.")

    // Tenho alguma receita de Lasanha?
    println("Tenho receitas de Lasanha? ${if (data.any { it.nome == "Lasanha" }) "sim" else "não"}.")

    // Quantas receitas de Lasanha?
    println("Tenho ${data.count { it.nome == "Lasanha" }} receitas de Lasanha.")
}

// Retorna lista de dados
private fun listaDeDados(): List<Receita> {
    return listOf(
        Receita(
            "Lasanha",
            1200,
            listOf(
                Ingrediente("Presunto", 5),
                Ingrediente("Queijo", 10),
                Ingrediente("Molho de tomate", 2),
                Ingrediente("Manjerição", 3)
            )
        ),
        Receita("Panqueca", 500),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijão", 300),
        Receita(
            "Hamburguer",
            2000,
            listOf(
                Ingrediente("Pão", 1),
                Ingrediente("Hamburguer", 3),
                Ingrediente("Queijo", 1),
                Ingrediente("Catupiry", 1),
                Ingrediente("Bacon", 3),
                Ingrediente("Alface", 1),
                Ingrediente("Tomate", 1)
            )
        )
    )
}

data class Receita(val nome: String, val calorias: Int, val ingredientes: List<Ingrediente> = listOf())
data class Ingrediente(val nome: String, val quantidade: Int)
