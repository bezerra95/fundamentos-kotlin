package orientacaoObjeto

// Exemplo de interfaces em Kotlin
// Interfaces definem um conjunto de métodos que uma classe deve implementar.
// Elas são semelhantes a classes abstratas, mas não podem conter estado.

// Interface que define um comportamento de animal que pode se mover
interface Movivel {
    // Métodos que devem ser implementados pelas classes que implementam esta interface
    fun moverParaFrente()
    fun moverParaTras()
}

// Interface que define um comportamento de animal que pode fazer barulho
interface Barulhento {
    // Método que deve ser implementado pelas classes que implementam esta interface
    fun fazerBarulho()
}

// Classe que implementa a interface Movivel
class CarroCelta : Movivel {
    override fun moverParaFrente() {
        println("Carro movendo para frente.")
    }

    override fun moverParaTras() {
        println("Carro movendo para trás.")
    }
}

// Classe que implementa a interface Movivel e Barulhento
class CachorroBelga : Movivel, Barulhento {
    override fun moverParaFrente() {
        println("Cachorro correndo para frente.")
    }

    override fun moverParaTras() {
        println("Cachorro correndo para trás.")
    }

    override fun fazerBarulho() {
        println("Cachorro fazendo Au Au!")
    }
}

fun main() {
    // Criando instâncias das classes e chamando seus métodos
    val carro = CarroCelta()
    val cachorro = CachorroBelga()

    println("Movimentos do Carro:")
    carro.moverParaFrente()
    carro.moverParaTras()

    println("\nMovimentos do Cachorro:")
    cachorro.moverParaFrente()
    cachorro.moverParaTras()
    cachorro.fazerBarulho()
}
