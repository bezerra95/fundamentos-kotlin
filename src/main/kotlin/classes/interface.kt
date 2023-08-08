package classes

interface Forma {
    fun calcularArea(): Double
    fun calcularPerimetro(): Double
}

class Retangulo(val base: Double, val altura: Double) : Forma {
    override fun calcularArea(): Double {
        return base * altura
    }

    override fun calcularPerimetro(): Double {
        return 2 * (base + altura)
    }
}

class Circulo(val raio: Double) : Forma {
    override fun calcularArea(): Double {
        return Math.PI * raio * raio
    }

    override fun calcularPerimetro(): Double {
        return 2 * Math.PI * raio
    }
}

fun main() {
    val retangulo = Retangulo(5.0, 3.0)
    println("Área do retângulo: ${retangulo.calcularArea()}")
    println("Perímetro do retângulo: ${retangulo.calcularPerimetro()}")

    val circulo = Circulo(2.0)
    println("Área do círculo: ${circulo.calcularArea()}")
    println("Perímetro do círculo: ${circulo.calcularPerimetro()}")
}

//Neste exemplo, temos a interface Forma, que define dois métodos:
//calcularArea() e calcularPerimetro(). As classes Retangulo e Circulo
//implementam a interface Forma, sobrescrevendo os métodos para
//fornecer a implementação adequada para cada forma geométrica