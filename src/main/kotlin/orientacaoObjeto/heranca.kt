package orientacaoObjeto

// Definindo a classe Animal como classe base
open class Animal(val nome: String) {
    // Método para emitir um som genérico
    open fun fazerSom() {
        println("O animal está fazendo um som.")
    }
}

// Definindo a classe Cachorro, que herda de Animal
class Cachorro(nome: String) : Animal(nome) {
    // Sobrescrevendo o método fazerSom() para emitir o som de latido
    override fun fazerSom() {
        println("$nome está latindo: Au Au!")
    }
}

fun main() {
    // Criando uma instância de Animal e chamando o método fazerSom()
    val animal = Animal("Animal")
    animal.fazerSom()

    // Criando uma instância de Cachorro e chamando o método fazerSom()
    val cachorro = Cachorro("Bob")
    cachorro.fazerSom()
}
