package colecoes

/*
As funções first e last em Kotlin são usadas para recuperar elementos de coleções, como listas.
Aqui está uma explicação simples e didática dessas funções:

Função first:
A função first é usada para obter o primeiro elemento de uma coleção. Ela pode ser usada de duas maneiras:

first(): Retorna o primeiro elemento da coleção. Se a coleção estiver vazia, esta chamada lançará
uma exceção NoSuchElementException.
first { condition }: Retorna o primeiro elemento que satisfaz uma condição específica.
Se nenhum elemento satisfizer a condição, será lançada uma exceção NoSuchElementException.
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

Função last
A função last é usada para obter o último elemento de uma coleção.
Semelhante à função first, ela pode ser usada de duas maneiras:

last(): Retorna o último elemento da coleção. Se a coleção estiver vazia,
esta chamada lançará uma exceção NoSuchElementException.
last { condition }: Retorna o último elemento que satisfaz uma condição específica.
Se nenhum elemento satisfizer a condição, será lançada uma exceção NoSuchElementException.
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

Resumo:
first e last sem condições: São úteis quando você tem certeza de que a coleção não está vazia,
ou quando você está lidando com coleções que por definição sempre terão elementos.
first e last com condições: São úteis para buscar elementos que atendam a critérios específicos,
 mas requerem cuidado, pois lançam exceções se nenhum elemento for encontrado.
Essas funções simplificam a tarefa de acessar elementos em coleções, permitindo escrever código
mais limpo e expressivo sem a necessidade de loops explícitos.
 */

fun main() {
    val data = listaDeDados()

    // Qual a primeira e última receita?
    println("A primeira receita é: ${data.first().nome}.")
    println("A última receita é: ${data.last().nome}.")

    // Caso a lista possa ser vazia
    // data.firstOrNull()
    // data.lastOrNull()
}

// Retorna lista de dados
private fun listaDeDados(): List<Receita2> {
    return listOf(
        Receita2(
            "Lasanha", 1200,
            listOf(
                Ingrediente2("Presunto", 5),
                Ingrediente2("Queijo", 10),
                Ingrediente2("Molho de tomate", 2),
                Ingrediente2("Manjerição", 3)
            )
        ),
        Receita2("Panqueca", 500),
        Receita2("Omelete", 200),
        Receita2("Parmegiana", 700),
        Receita2("Sopa de feijão", 300),
        Receita2(
            "Hamburguer", 2000,
            listOf(
                Ingrediente2("Pão", 1),
                Ingrediente2("Hamburguer", 3),
                Ingrediente2("Queijo", 1),
                Ingrediente2("Catupiry", 1),
                Ingrediente2("Bacon", 3),
                Ingrediente2("Alface", 1),
                Ingrediente2("Tomate", 1)
            )
        )
    )
}

data class Receita2(val nome: String, val calorias: Int, val ingredientes: List<Ingrediente2> = listOf())
data class Ingrediente2(val nome: String, val quantidade: Int)
