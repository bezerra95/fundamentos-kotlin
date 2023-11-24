package variaveisTipoDeDados

fun main() {

    println("Exemplo 1: Função com Generics")
    // Chamando a função com diferentes tipos de argumentos
    printItem("Texto") // Imprime "Item: Texto"
    printItem(42)       // Imprime "Item: 42"
    printItem(3.14)     // Imprime "Item: 3.14"



    println("\nExemplo 2: Classe com Generics")
    // Criando instâncias da classe Caixa com diferentes tipos de conteúdo
    val caixaTexto = Caixa("Conteúdo de texto")
    val caixaNumero = Caixa(42)
    val caixaDecimal = Caixa(3.14)

    // Exibindo o conteúdo das caixas
    caixaTexto.exibirConteudo()   // Imprime "Conteúdo: Contéudo de texto"
    caixaNumero.exibirConteudo()  // Imprime "Conteúdo: 42"
    caixaDecimal.exibirConteudo() // Imprime "Conteúdo: 3.14"

    print("\nExemplo 3: Função com restrição de tipo (bounded generics)")
    // Chamando a função com diferentes tipos numéricos
    val resultadoInt = somarNumeros(5, 10)       // Resultado é 15.0
    val resultadoDouble = somarNumeros(3.14, 2.0) // Resultado é 5.14

    println("Soma Inteira: $resultadoInt")        // Imprime "Soma Inteira: 15.0"
    println("Soma Decimal: $resultadoDouble")     // Imprime "Soma Decimal: 5.14"
}


// Exemplo 1: Função com Generics
fun <T> printItem(item: T) {
    println("Item: $item")
}

// Exemplo 2: Classe com Generics
class Caixa<T>(val conteudo: T) {
    fun exibirConteudo() {
        println("Conteúdo: $conteudo")
    }
}

// Exemplo 3: Função com restrição de tipo (bounded generics)
fun <T : Number> somarNumeros(a: T, b: T): Double {
    return a.toDouble() + b.toDouble()
}

