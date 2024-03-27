package orientacaoObjeto

// Exemplo 1: Uso básico de lateinit com tipos primitivos
class Exemplo1 {
    // Declarando uma variável primitiva como lateinit
    private lateinit var nome: String

    // Função para inicializar a variável nome
    fun inicializarNome() {
        nome = "João da Silva"
    }

    // Função para imprimir o valor da variável nome
    fun imprimirNome() {
        // Verificando se a variável foi inicializada antes de acessá-la
        if (::nome.isInitialized) {
            println("Nome: $nome")
        } else {
            println("Nome não inicializado")
        }
    }
}

// Classe de exemplo para representar um Humano
class Humano(val nome: String, val idade: Int)

// Exemplo 2: Uso de lateinit com tipos de objeto personalizados
class Exemplo2 {
    // Declarando uma variável de objeto como lateinit
    private lateinit var pessoa: Humano

    // Função para inicializar a variável pessoa
    fun inicializarPessoa() {
        pessoa = Humano("Maria", 25)
    }

    // Função para imprimir detalhes da variável pessoa
    fun imprimirDetalhesPessoa() {
        // Verificando se a variável foi inicializada antes de acessá-la
        if (::pessoa.isInitialized) {
            println("Detalhes da Pessoa: ${pessoa.nome}, ${pessoa.idade} anos")
        } else {
            println("Pessoa não inicializada")
        }
    }
}


fun main() {
    // Exemplo 1
    val exemplo1 = Exemplo1()
    exemplo1.inicializarNome()
    exemplo1.imprimirNome()

    // Exemplo 2
    val exemplo2 = Exemplo2()
    exemplo2.inicializarPessoa()
    exemplo2.imprimirDetalhesPessoa()
}
