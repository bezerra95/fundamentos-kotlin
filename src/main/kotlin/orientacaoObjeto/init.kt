package orientacaoObjeto

// Classe com um construtor primário e inicialização personalizada
class Pessoa(val nome: String, var idade: Int) {
    // Inicializador
    init {
        println("$nome foi criado(a) e tem $idade anos.")
    }
}

// Classe com inicialização personalizada e validação de parâmetros usando o bloco init
class Produto(val nome: String, var preco: Double) {
    // Bloco init com validação de preço
    init {
        if (preco < 0) {
            throw IllegalArgumentException("Preço não pode ser negativo")
        }
    }
}

// Classe com inicialização personalizada e cálculo de propriedade usando o bloco init
class Circulos(val raio: Double) {
    // Propriedade calculada para calcular a área do círculo
    val area: Double

    // Bloco init para inicialização da propriedade área
    init {
        area = Math.PI * raio * raio
    }
}

class Aluno(val nome: String, val idade: Int) {
    // Inicializador init primário
    init {
        println("Criando um novo aluno...")
        println("Nome: $nome")
        println("Idade: $idade")
    }

    // Inicializador init secundário
    init {
        println("Realizando inicialização adicional...")
        if (idade < 18) {
            println("$nome é menor de idade.")
        } else {
            println("$nome é maior de idade.")
        }
    }
}

fun main() {
    // Criando uma instância da classe Pessoa usando o construtor primário
    val pessoa = Pessoa("Ana", 30)
    println()

    try {
        // Tentando criar uma instância de Produto com preço negativo (irá lançar uma exceção)
        val produto = Produto("Notebook", -1500.0)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    println()
    // Criando uma instância da classe Círculo e acessando sua propriedade área
    val circulo = Circulos(5.0)
    println("Área do círculo: ${circulo.area}")

    println()
    // Criando uma instância da classe Aluno
    val aluno = Aluno("João", 20)
}