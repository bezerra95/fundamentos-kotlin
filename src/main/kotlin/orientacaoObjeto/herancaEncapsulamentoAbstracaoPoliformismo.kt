package orientacaoObjeto

// Vamos começar definindo uma classe abstrata Animal, que servirá como base para outros animais.
// Ela encapsula características comuns a todos os animais e define métodos que todos devem implementar.
abstract class Animal3(
    val nome: String,
    val idade: Int
) {
    // Método abstrato que deve ser implementado por subclasses para representar o som do animal.
    abstract fun fazerSom(): String
}

// Agora, vamos criar subclasses de Animal que representam tipos específicos de animais.
// Vamos começar com a classe Mamifero, que herda de Animal.
// Ela também encapsula características específicas dos mamíferos.
open class Mamifero2(
    nome: String,
    idade: Int,
    val corPelo: String
) : Animal3(nome, idade) {
    // Implementação do método fazerSom() para mamíferos.
    override fun fazerSom(): String {
        return "Som genérico de mamífero"
    }
}

// Vamos criar uma classe Cachorro, que é uma subclasse de Mamifero.
// Aqui podemos ver herança e polimorfismo em ação.
class Cachorro2(
    nome: String,
    idade: Int,
    corPelo: String
) : Mamifero2(nome, idade, corPelo) {
    // Sobrescrevendo o método fazerSom() para representar o som específico de um cachorro.
    override fun fazerSom(): String {
        return "Au au!"
    }
}

fun main() {
    // Vamos criar uma instância de Cachorro e chamar alguns métodos para demonstrar polimorfismo.
    val cachorro = Cachorro2("Bob", 5, "Marrom")

    // A chamada para o método fazerSom() irá executar o método específico da classe Cachorro.
    println("${cachorro.nome} faz: ${cachorro.fazerSom()}")

    // Acessando propriedades encapsuladas da classe Animal.
    println("${cachorro.nome} tem ${cachorro.idade} anos de idade.")

    // Acessando propriedades encapsuladas da classe Mamifero.
    println("${cachorro.nome} tem pelagem ${cachorro.corPelo}.")
}

//Este exemplo demonstra:
//
//Herança: A classe Mamifero herda da classe Animal, e a classe Cachorro herda de Mamifero.
//Encapsulamento: As propriedades nome e idade em Animal são encapsuladas e acessadas
// por métodos getter automáticos. Similarmente, a propriedade corPelo em Mamifero é encapsulada.
//Abstração: A classe Animal é abstrata e define um método abstrato fazerSom(),
// que é implementado nas subclasses concretas.
//Polimorfismo: O método fazerSom() é polimórfico, ou seja, ele é chamado em uma instância de Cachorro,
// mas executa a implementação específica dessa classe.