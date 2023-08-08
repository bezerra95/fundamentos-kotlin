package funcoes

open class Animal(val nome: String) {
    fun emitirSom() {
        println("O animal faz algum barulho.")
    }
}

class Cachorro(nome: String) : Animal(nome) {
    fun abanarRabo() {
        println("$nome está abanando o rabo.")
    }
}

fun main() {
    val cachorro = Cachorro("Rex")
    cachorro.emitirSom() // Output: O animal faz algum barulho.
    cachorro.abanarRabo() // Output: Rex está abanando o rabo.
}