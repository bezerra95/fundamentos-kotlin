package orientacaoObjeto

// Explicação de classes abstratas:

// Definição de uma classe abstrata
abstract class Animal2 {
    // Propriedade da classe abstrata
    val species: String = "Animal"

    // Método abstrato que deve ser implementado nas classes filhas
    abstract fun makeSound()
}

// Classe filha que herda da classe abstrata Animal
class Dog2 : Animal2() {
    override fun makeSound() {
        println("Au Au!")
    }
}

// Classe filha que herda da classe abstrata Animal
class Cat : Animal2() {
    override fun makeSound() {
        println("Miau!")
    }
}

// Explicação de classes abstratas com parâmetros:

// Definição de uma classe abstrata com parâmetro no construtor
abstract class Mamifero(val nome: String) {
    // Método abstrato que deve ser implementado nas classes filhas
    abstract fun emitirSom()
}

// Classe filha que herda da classe abstrata Mamifero
class Lobo(nome: String) : Mamifero(nome) {
    override fun emitirSom() {
        println("$nome diz: Au Au!")
    }
}

// Classe filha que herda da classe abstrata Mamifero
class Gato(nome: String) : Mamifero(nome) {
    override fun emitirSom() {
        println("$nome diz: Miau!")
    }
}


fun main() {
    // Instâncias das classes filhas
    val dog = Dog2()
    val cat = Cat()

    // Chamada do método makeSound() das classes filhas
    println("\nChamada do método makeSound() das classes filhas")
    dog.makeSound()
    cat.makeSound()

    // Instâncias das classes filhas
    val cachorro = Lobo("Bolinha")
    val gato = Gato("Frajola")

    // Chamada do método emitirSom() das classes filhas
    println("\nChamada do método emitirSom() das classes filhas")
    cachorro.emitirSom()
    gato.emitirSom()
}
