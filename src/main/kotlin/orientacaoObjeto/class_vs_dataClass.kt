package orientacaoObjeto

// Classe normal representando um carro
class Car(val marca: String, val modelo: String, val ano: Int) {
    // Método para imprimir os detalhes do carro
    fun imprimirDetalhes() {
        println("Carro: $marca $modelo, Ano: $ano")
    }
}

// Data class representando um livro
data class Livro(val titulo: String, val autor: String, val anoPublicacao: Int)

fun main() {
    // Instanciando um objeto da classe Carro
    val carro = Car("Toyota", "Corolla", 2022)
    // Chamando o método para imprimir os detalhes do carro
    carro.imprimirDetalhes()

    println()

    // Instanciando um objeto da data class Livro
    val livro = Livro("A Arte da Guerra", "Sun Tzu", 1910)

    // Imprimindo os detalhes do livro usando o recurso de destructuring
    val (titulo, autor, anoPublicacao) = livro
    println("Livro: $titulo, Autor: $autor, Ano de Publicação: $anoPublicacao")
}


//A principal diferença entre uma classe normal e uma data class é que a data class
// fornece automaticamente implementações padrão para métodos como
// toString(), equals(), hashCode(), entre outros. Isso pode economizar
// muito tempo de codificação ao lidar com classes simples que são
// usadas principalmente para armazenar dados.