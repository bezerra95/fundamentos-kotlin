package orientacaoObjeto

// Em Kotlin, você usa override para indicar que está substituindo um membro
// de uma superclasse ou interface. Aqui estão alguns exemplos:
open class Bixo {
    open fun makeSound() {
        println("Animal faz algum som")
    }
}

class Dog : Bixo() {
    override fun makeSound() {
        super.makeSound() // Chama o método makeSound() da classe pai
        println("O cachorro faz latido")
    }
}

fun main() {
    val dog = Dog()
    dog.makeSound() // Saída: Animal faz algum som \n O cachorro faz latido
}
